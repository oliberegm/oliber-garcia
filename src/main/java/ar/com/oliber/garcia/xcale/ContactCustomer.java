package ar.com.oliber.garcia.xcale;

import ar.com.oliber.garcia.xcale.model.Contacts;
import ar.com.oliber.garcia.xcale.model.Groups;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ContactCustomer implements Observer {

    private Contacts contacts;

    public ContactCustomer(String name, String numberPhone) {
        contacts = new Contacts();
        contacts.setName(name);
        contacts.setNumberPhone(numberPhone);
    }

    /**
     * escuchas las alertas que se generan
     * @param messages
     * @param groups
     */
    @Override
    public void alert(String messages, Groups groups, Contacts contactsSend) {
        processMessage(messages, groups, contactsSend);
    }

    /**
     * Para procesar el mensaje de la alerta
     * @param messages
     * @param groups
     */
    private void processMessage(String messages, Groups groups, Contacts contactsSend) {
        log.info("contact: {} Mensaje recivido de {} por {} <==> {}",
                contacts.getName(), groups.getName(), contactsSend.getName(), messages);
    }
}
