package com.codedifferently.moviebooking.repos;

import com.codedifferently.moviebooking.common.Entity;

import java.util.*;

public class RepositoryImpl<T extends Entity> implements Repository<T> {
    private static Long idIndex = 0l;
    private Map<String, T> entries;

    public RepositoryImpl(){
        entries = new HashMap<>();
    }

    @Override
    public T save(T entry) {
        if(entry.getId() == null){
            entry.setId("save-"+(++idIndex));
        }
        entries.put(entry.getId(), entry);
        return entry;
    }

    @Override
    public Optional<T> findById(String id) {
        if(entries.containsKey(id)) {
            T entry = entries.get(id);
            return Optional.of(entry);
        }
        return Optional.empty();
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(entries.values());
    }

    @Override
    public void delete(String id) {
        entries.remove(id);
    }
}

