package com.codedifferently.emailsubscriber.subscribers.repos;

import com.codedifferently.emailsubscriber.repos.Repository;
import com.codedifferently.emailsubscriber.repos.RepositoryImpl;
import com.codedifferently.emailsubscriber.subscribers.models.Subscriber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

public class SubscriberDbTest {

    private Repository<Subscriber> subscriberDataBase;
    private Subscriber testSubscriber;

    @BeforeEach
    public void setup()throws ParseException {
        subscriberDataBase = new RepositoryImpl<>();
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        testSubscriber = new Subscriber("Bob", "Dole", "bob@dole.com", format.parse("01-01-1978"));
    }

    @Test
    @DisplayName("Create New Subscriber")
    public void saveSubscriberTes01()  {
        String actual = subscriberDataBase.save(testSubscriber).getId();
        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("Update Subscriber")
    public void saveSubscriberTes02()  {
        testSubscriber.setId("save-"+3l);
        subscriberDataBase.save(testSubscriber);
        Optional<Subscriber> subscriberOptional = subscriberDataBase.findById("save-"+3l);
        Assertions.assertTrue(subscriberOptional.isPresent());

    }

    @Test
    @DisplayName("Find All")
    public void findAllTest()  {
        subscriberDataBase.save(testSubscriber);
        List<Subscriber> actualList = subscriberDataBase.findAll();
        Integer expected = 1;
        Integer actual = actualList.size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Delete")
    public void deleteTest(){
        Subscriber subscriber = subscriberDataBase.save(testSubscriber);
        String subscriberID = subscriber.getId();
        subscriberDataBase.delete(subscriberID);
        Optional<Subscriber> findSubscriber = subscriberDataBase.findById(subscriberID);
        Assertions.assertTrue(findSubscriber.isEmpty());
    }
}
