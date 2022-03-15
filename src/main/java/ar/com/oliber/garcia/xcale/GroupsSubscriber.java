package ar.com.oliber.garcia.xcale;

import ar.com.oliber.garcia.xcale.model.Contacts;

public interface GroupsSubscriber {
    public void addSubscriber(Observer observer);
    public void removeSubscriber(Observer observer);
    public void sendAlert(String messages, Contacts contactsSend);
}