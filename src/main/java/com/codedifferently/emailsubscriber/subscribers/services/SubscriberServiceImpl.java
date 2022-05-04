package com.codedifferently.emailsubscriber.subscribers.services;

import com.codedifferently.emailsubscriber.repos.Repository;
import com.codedifferently.emailsubscriber.repos.RepositoryImpl;
import com.codedifferently.emailsubscriber.topics.services.TopicService;
import com.codedifferently.emailsubscriber.subscribers.exceptions.SubscriberDoesNotExistException;
import com.codedifferently.emailsubscriber.subscribers.models.Subscriber;

import java.util.Optional;

public class SubscriberServiceImpl implements SubscriberService{

    private TopicService topicService;
    private Repository<Subscriber> dataBase;

    public SubscriberServiceImpl(TopicService topicService, Repository<Subscriber> dataBase){
        this.topicService = topicService;
        this.dataBase = dataBase;
    }

    @Override
    public Subscriber createSubscriber(Subscriber subscriber) {
        return dataBase.save(subscriber);
    }

    @Override
    public Subscriber getSubscriberById(String id) throws SubscriberDoesNotExistException {
        Optional<Subscriber> subscriberOptional = dataBase.findById(id);
        if(subscriberOptional.isEmpty()){
            throw new SubscriberDoesNotExistException("User with id not found : " + id);
        }
        return subscriberOptional.get();
    }

    @Override
    public Subscriber getSubscriberByEmail(String email) {
        return null;
    }

    @Override
    public Subscriber updateSubscriber(String id, Subscriber subscriber) {
        subscriber.setId(id);
        return dataBase.save(subscriber);
    }

    @Override
    public void deleteSubscriber(String id) {
        dataBase.delete(id);
    }

    @Override
    public Boolean subscribeToTopic(String subscriberId, String topicId) {
        return null;
    }

    @Override
    public Boolean unSubscribeToTopic(String subscriberId, String topicId) {
        return null;
    }
}
