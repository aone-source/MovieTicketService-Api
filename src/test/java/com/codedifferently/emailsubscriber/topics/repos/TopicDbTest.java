package com.codedifferently.emailsubscriber.topics.repos;

import com.codedifferently.emailsubscriber.repos.Repository;
import com.codedifferently.emailsubscriber.repos.RepositoryImpl;
import com.codedifferently.emailsubscriber.topics.models.Topic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class TopicDbTest {

    private Repository<Topic> dataBase;
    private Topic testTopic;

    @BeforeEach
    public void setup(){
        dataBase = new RepositoryImpl<>();
        testTopic = new Topic("Test Topic");
    }

    @Test
    public void saveTopicTest01(){
        String actual = dataBase.save(testTopic).getId();
        Assertions.assertNotNull(actual);
    }

    @Test
    public void saveTopicTest02(){
        testTopic.setId("save-"+3l);
        dataBase.save(testTopic);
        Optional<Topic> topicOptional = dataBase.findById("save-"+3l);
        Assertions.assertTrue(topicOptional.isPresent());
    }

    @Test
    public void findAllTest(){
        dataBase.save(testTopic);
        List<Topic> topics = dataBase.findAll();
        Integer expected = 1;
        Integer actual = topics.size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void deleteTest(){
        Topic topic = dataBase.save(testTopic);
        String topicId = topic.getId();
        dataBase.delete(topicId);
        Optional<Topic> findTopic = dataBase.findById(topicId);
        Assertions.assertTrue(findTopic.isEmpty());
    }
}
