package com.unisender.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

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

    /**
     * Joins the given map into string.
     *
     * @param map               map
     * @param entrySeparator    entry separator
     * @param keyValueSeparator key value separator
     * @return joined string
     */
    public static String join(Map<?, ?> map, String entrySeparator, String keyValueSeparator) {
        Collection<String> entries = new ArrayList<String>(map.size());
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            entries.add(entry.getKey() + keyValueSeparator + entry.getValue());
        }
        return join(entries, entrySeparator);
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
