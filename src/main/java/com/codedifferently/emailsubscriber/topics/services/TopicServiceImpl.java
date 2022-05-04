package com.codedifferently.emailsubscriber.topics.services;

import com.codedifferently.emailsubscriber.topics.models.Topic;

import java.util.HashMap;
import java.util.Map;

public class TopicServiceImpl implements TopicService{
    private Map<Long, Topic> topics;

    public TopicServiceImpl(){
        topics = new HashMap<>();
    }

    @Override
    public Topic createTopic(Topic topic) {
        return null;
    }

    @Override
    public Topic getTopicById(Long id) {
        return null;
    }

    @Override
    public Topic updateTopic(Long id, Topic topic) {
        return null;
    }

    @Override
    public Boolean deleteTopic(Long id) {
        return null;
    }
}
