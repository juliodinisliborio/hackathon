package org.academiadecodigo.hackathon.models.dao;

import java.util.List;

public interface DAO <T> {

    T add(T t);

    List<T> getAll();

    T update(Integer id);

    void remove(Integer id);

}
