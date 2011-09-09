package com.unisender.examples;

import com.unisender.UniSender;
import com.unisender.entities.FieldData;
import com.unisender.exceptions.UniSenderException;
import com.unisender.exceptions.UniSenderInvalidResponseException;
import com.unisender.exceptions.UniSenderMethodException;
import com.unisender.requests.ExportContactsRequest;

public class ExportContacsExample {
	public static final String apiKey = "2GMXqcUziKr3Ogr0Q9zsZo1b8IwaIjju7";

	public static void main(String[] args) throws UniSenderException {
		try {
			UniSender us = new UniSender(apiKey);

			ExportContactsRequest ecr = new ExportContactsRequest();
			FieldData fd = us.exportContacts(ecr);

			System.out.println("Fields");
			for (int i = 0; i < fd.getFiledCount(); ++i) {
				System.out.println(fd.getField(i));
			}
			System.out.println("------------------");
			for (int i = 0; i < fd.getDataCount(); ++i) {
				for (String data : fd.getData(i)) {
					System.out.println(data);
				}
				System.out.println("------------------");
			}

		} catch (UniSenderMethodException e) {
			System.err.println(e.getCode());

		} catch (UniSenderInvalidResponseException e) {
			System.err.println(e.getResponse());
			System.err.println(e);
		}
	}
}
