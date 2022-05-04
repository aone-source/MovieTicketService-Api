package com.codedifferently.emailsubscriber.topics.models;

import com.codedifferently.emailsubscriber.common.Entry;

import java.util.HashMap;
import java.util.Map;

public class Topic extends Entry {
    private String title;
    private Map<Long, TopicUpdate> topicUpdateIds;

    public Topic(String title) {
        this.title = title;
        topicUpdateIds = new HashMap<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map<Long, TopicUpdate> getTopicUpdateIds() {
        return topicUpdateIds;
    }

    public void setTopicUpdateIds(Map<Long, TopicUpdate> topicUpdateIds) {
        this.topicUpdateIds = topicUpdateIds;
    }

    @Override
    public String toString() {
        return "Topic{" +
                ", title='" + title + '\'' +
                ", topicUpdateIds=" + topicUpdateIds +
                '}';
    }
}
