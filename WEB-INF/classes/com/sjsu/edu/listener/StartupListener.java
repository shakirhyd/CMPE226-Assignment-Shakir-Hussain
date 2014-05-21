package com.sjsu.edu.listener;

import java.io.File;
import java.net.UnknownHostException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.sjsu.edu.common.ConsoleConstants;
import com.sjsu.edu.common.Settings;
import com.sjsu.edu.database.ConnectionManager;

@WebListener()
public class StartupListener implements ServletContextListener {
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		ConnectionManager.closeManager();
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		final String catalinaBase = System.getProperty("catalina.base");
		// start a thread to monitor / watch properties file
		Settings.loadProperties(new File(catalinaBase, ConsoleConstants.PROPERTIES_PATH).getAbsolutePath());
		
		// Establish Database Connections
		try {
			ConnectionManager.init(Settings.getProperty(ConsoleConstants.DB_HOSTNAME, "localhost"), Settings.getIntProperty(ConsoleConstants.DB_PORT, 27017));
		}
		catch(UnknownHostException e){
			System.out.println(e.getMessage());
		}

	}
}
