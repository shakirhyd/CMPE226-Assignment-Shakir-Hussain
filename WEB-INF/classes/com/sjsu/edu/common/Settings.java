package com.sjsu.edu.common;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Settings {
	private final static Properties properties = new Properties();
	private static ScheduledThreadPoolExecutor stpe = null;
	private static File propFile;
	private static long lastModified;

	static {
		//This is a fixed pool executor, started with 5 core threads
		stpe = new ScheduledThreadPoolExecutor(5);		
	}
	
	private Settings() {
		// This class has only static methods
	}
	
	public static void loadProperties(String fileName) {
		propFile = new File(fileName);
		loadProperties(propFile, false);
	}
	
	private static void loadProperties(File file, boolean isReload)
	{
		if (file.exists()) {
			FileInputStream fis = null;
			try {
				fis = new FileInputStream(file);
				properties.load(fis); 
				
			}
			catch (IOException ioe) {
				System.err.println("Error loading properties" + ioe.getMessage());
			}
			finally {
				if (fis != null) {
					try {
						fis.close();
					} catch (IOException e) {
						// ignore this silently
						System.err.println("Ignore - Error in closing properties file.");
					}
				}
			}
		}
	}	
	
	public static Properties getProperties() {
		return properties;
	}
	
	public static int getIntProperty(String name, int defaultValue)
	{
		try {
			if (name != null && properties.getProperty(name) != null) {
				return Integer.parseInt(properties.getProperty(name));
			}
		} catch (Exception ex) {
			System.err.println("Ignore - Error while getting IntProperty " + name + " , will return default value " + defaultValue);
		}
		return defaultValue;
	}
	
	public static long getLongProperty(String name, long defaultValue)
	{
		try {
			if (name != null && properties.getProperty(name) != null) {
				return Long.parseLong(properties.getProperty(name));
			}
		} catch (Exception ex) {
			System.err.println("Ignore - Error while getting LongProperty " + name + " , will return default value " + defaultValue);
		}
		return defaultValue;
	}
	
	public static boolean getBooleanProperty(String name)
	{
		return Boolean.parseBoolean(properties.getProperty(name, "false"));
	}	
	
	public static String getProperty(String name, String defaultValue)
	{
		return properties.getProperty(name, defaultValue);
	}	
	
	public static ScheduledThreadPoolExecutor getThreadPoolExecutor() {
		return stpe;
	}

	public static void watchPropertiesFile(final int interval)
	{
		Runnable command = new Runnable() {
			@Override
			public void run() {
				if (propFile != null && propFile.lastModified() > lastModified) {
					loadProperties(propFile, true);
					lastModified = propFile.lastModified();
				}
			}
		};
		stpe.scheduleWithFixedDelay(command, interval, interval, TimeUnit.SECONDS);
	}
}
