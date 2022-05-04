package com.codedifferently.emailsubscriber.common;

// Any class that we intend on saving in our Repo/Database will need to have an ID so it will extend this class
public abstract class Entry {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
