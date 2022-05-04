package com.codedifferently.emailsubscriber.subscribers.services;

import com.codedifferently.emailsubscriber.subscribers.exceptions.SubscriberDoesNotExistException;
import com.codedifferently.emailsubscriber.subscribers.models.Subscriber;

public interface SubscriberService {
    Subscriber createSubscriber(Subscriber subscriber);
    Subscriber getSubscriberById(String id) throws SubscriberDoesNotExistException;
    Subscriber getSubscriberByEmail(String email);
    Subscriber updateSubscriber(String id, Subscriber subscriber);
    void deleteSubscriber(String id);
    Boolean subscribeToTopic(String subscriberId, String topicId);
    Boolean unSubscribeToTopic(String subscriberId, String topicId);
}
