package org.academiadecodigo.hackathon.models.dao;

import java.util.List;

public interface DAO <T> {

    T add(T t);

    List<T> getAll();

    T update(T t);

    void remove(T t);

}
