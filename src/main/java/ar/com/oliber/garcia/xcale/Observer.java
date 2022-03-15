package ar.com.oliber.garcia.xcale;

import ar.com.oliber.garcia.xcale.model.Contacts;
import ar.com.oliber.garcia.xcale.model.Groups;

public interface Observer {
    public void alert(String messages, Groups groups, Contacts contactsSend);
}
