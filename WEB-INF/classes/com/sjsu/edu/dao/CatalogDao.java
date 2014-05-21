package com.sjsu.edu.dao;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.sjsu.edu.dao.beans.CatalogEntry;
import com.sjsu.edu.database.ConnectionManager;

public class CatalogDao {

	public static List<CatalogEntry> getCatalog(String type) {
		MongoClient mongoClient = ConnectionManager.getInstance().getMongoClient();

		List<CatalogEntry> allResults = new ArrayList<CatalogEntry>();

		DB db = mongoClient.getDB(CatalogEntry.DATABASE_NAME);
		db.requestStart();
		try {
			db.requestEnsureConnection();
			DBCollection collection = db.getCollection(CatalogEntry.COLLECTION_NAME);
			collection.setObjectClass(CatalogEntry.class);
			BasicDBObject query = new BasicDBObject("category", type);
			DBCursor docs = collection.find(query);
			while(docs.hasNext()) {				
				allResults.add((CatalogEntry)docs.next());
			}
		} finally {
			db.requestDone();
		}
		return allResults;		
	}
}
