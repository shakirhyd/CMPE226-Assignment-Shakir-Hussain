package com.sjsu.edu.common;

import java.util.List;

import com.sjsu.edu.dao.CatalogDao;
import com.sjsu.edu.dao.beans.CatalogEntry;

public class Utils {
	public static List<CatalogEntry> getCatalog(String type) {
		return CatalogDao.getCatalog(type);
	}
}
