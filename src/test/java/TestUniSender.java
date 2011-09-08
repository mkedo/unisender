import java.util.ArrayList;
import java.util.List;

import com.unisender.UniSender;
import com.unisender.entities.MailList;
import com.unisender.entities.SmsMessage;
import com.unisender.exceptions.UniSenderException;
import com.unisender.requests.ContactType;
import com.unisender.requests.CreateSmsMessageRequest;
import com.unisender.requests.ExcludeRequest;



public class TestUniSender {
	public static void main(String[] args) throws UniSenderException {
		UniSender us = new UniSender("2GMXqcUziKr3Ogr0Q9zsZo1b8IwaIjju7", true);
		
		//try {
			/*
				MailList cl = us.createList(new MailList("Моя рассылка"));
				System.out.println("Created " + cl.getId());
			*/
		
			/*
			java.util.List<List> lists =  us.getLists();
			for (List l: lists){
				System.out.println(l.getId() + ":" + l.getTitle());
			}
			*/
			/*
			Person p = new Person();
			p.setEmail("emailss");
			p.setId(1);
			List<MailList> l = new ArrayList<MailList>();
			l.add(new MailList(532791));
			
			SubscribeRequest sr = new SubscribeRequest(l, p);
			
			us.subscribe(sr);
			*/
			List<MailList> l = new ArrayList<MailList>();
			l.add(new MailList(532791));
			
			us.exclude(new ExcludeRequest(ContactType.PHONE, "number", l));
			CreateSmsMessageRequest sm = new CreateSmsMessageRequest(new SmsMessage("", ""), new MailList(1));
			us.createSmsMessage(sm);
			
		//} catch (UniSenderMethodException e) {
		//	System.err.println(e.getCode());
		//}
	}
}
