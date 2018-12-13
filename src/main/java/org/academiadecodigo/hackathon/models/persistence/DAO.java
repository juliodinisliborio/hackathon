package org.academiadecodigo.hackathon.models.persistence;

import java.util.List;

public interface DAO <T> {

    T create(T t);

    List<T> read();

    T update(T t);

    void delete(T t);

}
