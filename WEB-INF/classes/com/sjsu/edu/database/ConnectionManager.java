package com.sjsu.edu.database;

import java.net.UnknownHostException;

import com.mongodb.MongoClient;

public class ConnectionManager {
	public static ConnectionManager instance;
	/*
	 * The Java MongoDB driver is thread safe. If you are using in a web serving environment, 
	 * for example, you should create a single MongoClient instance, and you can use it in every request. 
	 * The MongoClient object maintains an internal pool of connections to the database (default pool size of 10). 
	 * For every request to the DB (find, insert, etc) the Java thread will obtain a connection from the pool, 
	 * execute the operation, and release the connection. This means the connection (socket) used may be different each time.
	 */
	public static MongoClient mongoClient;
	
	private ConnectionManager(String hostName, int port) throws UnknownHostException {
		mongoClient = new MongoClient(hostName, port);
	}
	
	public static void init(String hostName, int port) throws UnknownHostException {
		if(instance == null)
			instance = new ConnectionManager(hostName, port);
	}
	
	public static ConnectionManager getInstance() {
		return instance;
	}
	
	public MongoClient getMongoClient() {
		return mongoClient;
	}
	
	public static void closeManager() {
		if(mongoClient != null) {
			mongoClient.close();
		}
	}
}
