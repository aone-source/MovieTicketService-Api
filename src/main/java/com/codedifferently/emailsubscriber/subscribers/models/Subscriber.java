package com.codedifferently.emailsubscriber.subscribers.models;

import com.codedifferently.emailsubscriber.common.Person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Subscriber extends Person {
    private List<Long> topicIds;

    public Subscriber(String firstName, String lastName, String email, Date dob) {
        super(firstName, lastName, email, dob);
        topicIds = new ArrayList<>();
    }

    public List<Long> getTopicIds() {
        return topicIds;
    }

    public void setTopicIds(List<Long> topicIds) {
        this.topicIds = topicIds;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                ", topicIds=" + topicIds +
                '}';
    }
}
