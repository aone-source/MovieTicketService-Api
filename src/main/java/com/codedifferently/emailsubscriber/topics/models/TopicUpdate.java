package com.codedifferently.emailsubscriber.topics.models;

import com.codedifferently.emailsubscriber.common.Entry;

public class TopicUpdate extends Entry {

    private String title;
    private String body;

    public TopicUpdate(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "TopicUpdate{" +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
