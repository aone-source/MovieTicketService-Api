package com.codedifferently.moviebooking.repos;

import com.codedifferently.moviebooking.common.Entity;


import java.util.List;
import java.util.Optional;

public interface Repository<T extends Entity> {
    T save(T entry);
    Optional<T> findById(String id);
    List<T> findAll();
    void delete(String id);
}
