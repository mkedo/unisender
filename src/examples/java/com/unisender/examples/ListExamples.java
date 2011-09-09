package com.unisender.examples;

import java.util.ArrayList;
import java.util.List;

import com.unisender.UniSender;
import com.unisender.entities.Contacts;
import com.unisender.entities.FieldData;
import com.unisender.entities.LogMessage;
import com.unisender.entities.MailList;
import com.unisender.exceptions.UniSenderException;
import com.unisender.exceptions.UniSenderInvalidResponseException;
import com.unisender.exceptions.UniSenderMethodException;
import com.unisender.requests.ImportContactsRequest;
import com.unisender.responses.ActivateContactsResponse;
import com.unisender.responses.ImportContactsResponse;

public class ListExamples {
	public static final String apiKey = "2GMXqcUziKr3Ogr0Q9zsZo1b8IwaIjju7";

	public static void main(String[] args) throws UniSenderException {

		UniSender us = new UniSender(apiKey);
		try {
			
			/* Создание нового списка рассылки 
			 * http://www.unisender.com/ru/help/api/createList */
			
			MailList testMaillist = new MailList("Тестовый список рассылки");
			us.createList(testMaillist);
			System.out.println("Created: " + testMaillist.getId());
			
			/* Получение перечня всех имеющихся списков рассылок
			 * http://www.unisender.com/ru/help/api/getLists */
			
			List<MailList> lists = us.getLists();
			for (MailList ml: lists){
				System.out.println(ml);
			}
			
			/* Массовый импорт и синхронизация контактов
			 *  http://www.unisender.com/ru/help/api/importContacts */
			FieldData fd = new FieldData();
			
			fd.addFields(new String[]{"email", "phone", "lists_ids"}); // Также можно использовать List
			
			fd.addValues(new String[]{"some@mail.com", "12345678", testMaillist.getId().toString()});
			fd.addValues(new String[]{"some2@mail.com", "87654321", testMaillist.getId().toString()});
			
			ImportContactsRequest ic = new ImportContactsRequest(fd);
			ImportContactsResponse icr = us.importContacts(ic);
			System.out.println(
					String.format(
							"total:%s, inserted:%s, updated:%s, deleted:%s, new_emails:%s",
							icr.getTotal(),
							icr.getInserted(),
							icr.getUpdated(),
							icr.getDeleted(),
							icr.getNewEmails()
					)
			);
			List<LogMessage> logs = icr.getLogMessages();
			if (logs != null){
				for (LogMessage lm: logs){
					System.out.println(lm);
				}
			}
			
			
			/* Активация контактов 
			 * http://www.unisender.com/ru/help/api/activateContacts */
			
			List<MailList> mailList = new ArrayList<MailList>();
			mailList.add(testMaillist);
			Contacts contacts = new Contacts(mailList);
			// Contacts contacts = new Contacts("some@mail.com,some2@mail.com"); // Или так
			
			ActivateContactsResponse acr = us.activateContacts(contacts);
			System.out.println("Activated: " + acr.getActivated());
			
			
		} catch (UniSenderMethodException e) {
			System.err.println(e.getCode());
			
		} catch (UniSenderInvalidResponseException e) {
			System.err.println(e.getResponse());
			System.err.println(e);
		}
	}
}
