package com.sjsu.edu.dao.beans;

import com.mongodb.BasicDBObject;

public class CatalogEntry extends BasicDBObject {
	private static final long serialVersionUID = 2050456974829702125L;
	
	public static final String DATABASE_NAME = "catalog";
	public static final String COLLECTION_NAME = "appliance";
	
	public static final String ID = "_id";
	public static final String NAME = "name";
	public static final String DESC = "desc";
	public static final String BRAND = "brand";
	public static final String DIMENSION = "dimension";
	public static final String RESOLUTION = "resolution";
	public static final String PRICE = "price";
	public static final String YEAR = "year";
	public static final String CATEGORY = "category";	
	public static final String CAPACITY = "capacity";
	public static final String CARRIER = "carrier";
	public static final String URL = "url";
	
	public String getId() {
		return getString(ID);
	}

	public String getName() {
		return getString(NAME);
	}

	public String getDesc() {
		return getString(DESC);
	}

	public String getBrand() {
		return getString(BRAND);
	}
	
	public String getDimension() {
		return getString(DIMENSION);
	}
	
	public String getResolution() {
		return getString(RESOLUTION);
	}
	
	public String getPrice() {
		return getString(PRICE);
	}
	
	public String getYear() {
		return getString(YEAR);
	}
	
	public String getCategory() {
		return getString(CATEGORY);
	}

	public String getCapacity() {
		return getString(CAPACITY);
	}

	public String getCarrier(){
		return getString(CARRIER);
	}

	public String getUrl(){
		return getString(URL);
	}
}
