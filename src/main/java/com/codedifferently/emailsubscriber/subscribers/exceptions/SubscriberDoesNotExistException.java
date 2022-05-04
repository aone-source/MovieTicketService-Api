package com.codedifferently.emailsubscriber.subscribers.exceptions;

public class SubscriberDoesNotExistException extends  Exception{
    public SubscriberDoesNotExistException(String msg){
        super(msg);
    }
}
