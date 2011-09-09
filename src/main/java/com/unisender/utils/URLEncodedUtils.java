package com.unisender.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;

public class URLEncodedUtils {
	private static final String PARAMETER_SEPARATOR = "&";
	private static final String NAME_VALUE_SEPARATOR = "=";

	public static String formatQuery(final Map<String, String> params,
			final String encoding) {
		if (params == null) {
			return "";
			//throw new IllegalArgumentException("params cannot be null");
		}
		if (params.isEmpty()) {
			return "";
		}
		final StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<String, String>> it = params.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<String, String> pairs = (Map.Entry<String, String>) it.next();
			final String encodeName = encode(pairs.getKey(), encoding);
			final String value = ((Object)pairs.getValue()).toString();
			final String encodedValue = value == null ? "" : encode(value,
					encoding);
			if (sb.length() > 0) {
				sb.append(PARAMETER_SEPARATOR);
			}
			sb.append(encodeName);
			sb.append(NAME_VALUE_SEPARATOR);
			sb.append(encodedValue);
		}
		return sb.toString();
	}

	private static String encode(final String content, final String encoding) {
		try {
			return URLEncoder.encode(content, encoding);
		} catch (UnsupportedEncodingException e) {
			throw new IllegalArgumentException(e);
		}
	}
}
