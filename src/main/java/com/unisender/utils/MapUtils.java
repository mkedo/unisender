package com.unisender.utils;

import java.util.Map;

public class MapUtils {
	public static boolean putIfNotNull(Map map, Object key, Object value){
		if (value != null){
			map.put(key, value);
			return true;
		} else {
			return false;
		}
	}
}
