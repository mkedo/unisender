package com.unisender.utils;

import java.util.Collection;
import java.util.List;

import com.unisender.entities.MailList;

public class StringUtils {
	public static String join(Collection collection, String separator){
		if (collection == null)
			return null;
		StringBuilder sb = new StringBuilder();
		
		for(Object o: collection){
			if (sb.length() != 0){
				sb.append(separator);
			}
			sb.append(o);
		}
		
		return sb.toString();
	}
	
	public static String joinMailList(List<MailList> list, String separator){
		if (list == null)
			return null;
		StringBuilder sb = new StringBuilder();
		
		for(MailList o: list){
			if (sb.length() != 0){
				sb.append(separator);
			}
			sb.append(o.getId());
		}
		
		return sb.toString();
	}
}
