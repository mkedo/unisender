package com.unisender.exceptions;

public enum MethodExceptionCode {
	UNSPECIFIED, INVALID_API_KEY, ACCESS_DENIED, UNKNOWN_METHOD, INVALID_ARG, NOT_ENOUGH_MONEY, TOO_MANY_DOUBLE_OPTINS, UNKNOWN;
	
	@Override
	public String toString() {
		switch (this) {
		case UNSPECIFIED:
			return "Тип ошибки не указан. Подробности смотрите в сообщении.";
		case INVALID_API_KEY:
			return "Указан неправильный ключ доступа к API. Проверьте, совпадает ли значение api_key со значением, указанным в личном кабинете.";
		case ACCESS_DENIED:
			return "Доступ запрещён. Проверьте, включён ли доступ к API в личном кабинете и не обращаетесь ли вы к методу, прав доступа к которому у вас нет.";
		case UNKNOWN_METHOD:
			return "Указано неправильное имя метода";
		case INVALID_ARG:
			return "Указано неправильное значение одного из аргументов метода";
		case NOT_ENOUGH_MONEY:
			return "Не хватает денег на счету для выполнения метода";
        case TOO_MANY_DOUBLE_OPTINS:
            return "Превышен лимит количества подписчиков";
		default:
			return "Неизвестная ошибка";
		}
	}
}
