package ar.com.oliber.garcia.xcale;

import ar.com.oliber.garcia.xcale.model.Contacts;
import ar.com.oliber.garcia.xcale.model.Groups;

import java.util.ArrayList;
import java.util.List;

public class GroupsSubscriberSimples implements GroupsSubscriber {
    private List<Observer> messages = new ArrayList<>();
    private Groups groups;
    public GroupsSubscriberSimples(String name) {
        groups = new Groups(name);
    }

    /**
     * Agrega una susbcripcion para los contactos
     * @param observer
     */
    @Override
    public void addSubscriber(Observer observer) {
        messages.add(observer);
    }

    /**
     * Remueve la subscripcion para los contactos
     * @param observer
     */
    @Override
    public void removeSubscriber(Observer observer) {
        messages.remove(observer);
    }

    /**
     * envia la alerta a los contactos con el mensaje
     * @param msg
     */
    @Override
    public void sendAlert(String msg, Contacts contactsSend) {
        messages.stream().forEach( f -> f.alert(msg, groups, contactsSend));
    }
}
