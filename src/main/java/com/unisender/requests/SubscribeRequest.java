package com.unisender.requests;

import com.unisender.entities.MailList;
import com.unisender.entities.Person;

public class SubscribeRequest {
	// required
	java.util.List<MailList> lists;
	Person fields;

	// optional
	String tags;
	String requestIp;
	String requestTime;
	/**
	 * Число от 0 до 3 - есть ли подтверждённое согласие подписчика для активации, и что делать, если превышены лимиты активации. 
	 * Если 0, то мы считаем, что подписчик только высказал желание подписаться, но ещё не подтвердил подписку. В этом случае подписчику будет отправлено письмо-приглашение подписаться. Текст письма будет взят из свойств первого списка из list_ids. 
	 * Если 1, то мы считаем, что у Вас уже есть согласие подписчика и, если суточный лимит авто-активаций не превышен, не посылаем письмо-приглашение. Если же он превышен, подписчику высылается письмо с просьбой подтвердить подписку. Текст этого письма можно настроить для каждого списка. 
	 * Если 2, то также считается, что у Вас согласие подписчика уже есть, но в случае превышения лимита мы возвращаем код ошибки too_many_double_optins. 
	 * Если 3, то также считается, что у Вас согласие подписчика уже есть, но в случае превышения лимита подписчик добавляется со статусом "новый" и можно запросить его активацию методом activateContacts или через веб-интерфейс.
	 */
	Integer doubleOptin;
	
	String confirmIp;
	String confirmTime;
	
	/**
	 * Режим перезаписывания полей и меток, число от 0 до 2 (по умолчанию 0). Задаёт, что делать в случае существования подписчика (подписчик определяется по email-адресу и/или телефону).
	 * Если 0 — происходит только добавление новых полей и меток, уже существующие поля сохраняют своё значение.
	 * Если 1 — все старые поля удаляются и заменяются новыми, все старые метки также удаляются и заменяются новыми.
	 * Если 2 — заменяются значения переданных полей, если у существующего подписчика есть и другие поля, то они сохраняют своё значение. В случае передачи меток они перезаписываются, если же метки не передаются, то сохраняются старые значения меток.
	 */
	Integer overwrite;
	
	public SubscribeRequest(java.util.List<MailList> lists, Person fields) {
		this.lists = lists;
		this.fields = fields;
	}

	public java.util.List<MailList> getLists() {
		return lists;
	}

	public void setLists(java.util.List<MailList> lists) {
		this.lists = lists;
	}

	public Person getFields() {
		return fields;
	}

	public void setFields(Person fields) {
		this.fields = fields;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getRequestIp() {
		return requestIp;
	}

	public void setRequestIp(String requestIp) {
		this.requestIp = requestIp;
	}

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public Integer getDoubleOptin() {
		return doubleOptin;
	}

	public void setDoubleOptin(Integer doubleOptin) {
		if (doubleOptin < 0 || doubleOptin > 3)
			throw new IllegalArgumentException("doubleOptin must be in range [0-3]");
		this.doubleOptin = doubleOptin;
	}

	public String getConfirmIp() {
		return confirmIp;
	}

	public void setConfirmIp(String confirmIp) {
		this.confirmIp = confirmIp;
	}

	public String getConfirmTime() {
		return confirmTime;
	}

	public void setConfirmTime(String confirmTime) {
		this.confirmTime = confirmTime;
	}

	public Integer getOverwrite() {
		return overwrite;
	}

	public void setOverwrite(Integer overwrite) {
		if (overwrite < 0 || overwrite > 2)
			throw new IllegalArgumentException("overwrite must be in range [0-2]");
		this.overwrite = overwrite;
	}

}
