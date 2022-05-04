package com.codedifferently.emailsubscriber.repos;

import com.codedifferently.emailsubscriber.common.Entry;

import java.util.List;
import java.util.Optional;

public interface Repository<T extends Entry> {
    T save(T entry);
    Optional<T> findById(String id);
    List<T> findAll();
    void delete(String id);
}
