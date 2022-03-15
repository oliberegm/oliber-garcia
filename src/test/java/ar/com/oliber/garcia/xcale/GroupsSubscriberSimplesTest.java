package ar.com.oliber.garcia.xcale;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupsSubscriberSimplesTest {

    @Test
    void addSubscriber() {
        GroupsSubscriberSimples groupsTest = new GroupsSubscriberSimples("grupo1");
        ContactCustomer contactCustomer1 = new ContactCustomer("1", "1");
        groupsTest.addSubscriber(contactCustomer1);



    }

    @Test
    void removeSubscriber() {
    }

    @Test
    void notifySubscribers() {
    }
}