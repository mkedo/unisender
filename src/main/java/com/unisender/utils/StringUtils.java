package com.unisender.utils;

import java.util.List;

import com.unisender.entities.MailList;

public class StringUtils {
	public static String join(List list, String seprator){
		if (list == null)
			return null;
		StringBuilder sb = new StringBuilder();
		
		for(Object o: list){
			if (sb.length() != 0){
				sb.append(seprator);
			}
			sb.append(o);
		}
		
		return sb.toString();
	}
	
	public static String joinMailList(List<MailList> list, String seprator){
		if (list == null)
			return null;
		StringBuilder sb = new StringBuilder();
		
		for(MailList o: list){
			if (sb.length() != 0){
				sb.append(seprator);
			}
			sb.append(o.getId());
		}
		
		return sb.toString();
	}
}
