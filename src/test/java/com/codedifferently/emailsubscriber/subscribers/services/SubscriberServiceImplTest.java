package com.codedifferently.emailsubscriber.subscribers.services;

import com.codedifferently.emailsubscriber.repos.Repository;
import com.codedifferently.emailsubscriber.repos.RepositoryImpl;
import com.codedifferently.emailsubscriber.topics.services.TopicService;
import com.codedifferently.emailsubscriber.topics.services.TopicServiceImpl;
import com.codedifferently.emailsubscriber.subscribers.exceptions.SubscriberDoesNotExistException;
import com.codedifferently.emailsubscriber.subscribers.models.Subscriber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SubscriberServiceImplTest {

    private SubscriberServiceImpl subscriberService;
    private Subscriber testSubscriber;

    @BeforeEach
    public void setup() throws ParseException {
        TopicService topicService = new TopicServiceImpl();
        Repository<Subscriber> dataBase = new RepositoryImpl<>();
        subscriberService = new SubscriberServiceImpl(topicService, dataBase);
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        testSubscriber = new Subscriber("Bob", "Dole", "bob@dole.com", format.parse("01-01-1978"));
    }

    @Test
    public void getSubscriberByIdTest01(){
        Assertions.assertThrows(SubscriberDoesNotExistException.class, ()->{
            subscriberService.getSubscriberById("save-"+2l);
        });
    }
}
