package ar.com.oliber.garcia.xcale;

import ar.com.oliber.garcia.xcale.model.Contacts;

public class WhatsApp {

	public static void main(String[] args) {
		// creamos grupos
		GroupsSubscriberSimples groupsSubscriberSimples1 = new GroupsSubscriberSimples("grupo1");
		GroupsSubscriberSimples groupsSubscriberSimples2 = new GroupsSubscriberSimples("grupo2");

		// creacion de los contactos
		ContactCustomer contactCustomer1 = new ContactCustomer("1", "1");
		ContactCustomer contactCustomer2 = new ContactCustomer("2", "2");
		ContactCustomer contactCustomer3 = new ContactCustomer("3" ,"3");

		// creo la lista de contactos del grupo1
		groupsSubscriberSimples1.addSubscriber(contactCustomer1);
		groupsSubscriberSimples1.addSubscriber(contactCustomer2);

		// creo la lista de contactos del grupo2
		groupsSubscriberSimples2.addSubscriber(contactCustomer1);
		groupsSubscriberSimples2.addSubscriber(contactCustomer3);

		Contacts contactsSend = new Contacts(null, "prueba", "prueba");

		//notifico el envio de un mensaje
		groupsSubscriberSimples1.sendAlert("Hola 1", contactsSend);

		//notifico el envio de un mensaje
		groupsSubscriberSimples2.sendAlert("Hola 2", contactsSend);

	}

}
