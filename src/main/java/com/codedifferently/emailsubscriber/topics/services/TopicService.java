package com.codedifferently.emailsubscriber.topics.services;

import com.codedifferently.emailsubscriber.topics.models.Topic;

public interface TopicService {
    Topic createTopic(Topic topic);
    Topic getTopicById(Long id);
    Topic updateTopic(Long id, Topic topic);
    Boolean deleteTopic(Long id);

}
