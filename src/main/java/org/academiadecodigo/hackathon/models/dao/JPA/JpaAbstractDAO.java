package org.academiadecodigo.hackathon.models.dao.JPA;

import org.academiadecodigo.hackathon.models.dao.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class JpaAbstractDAO<T> implements DAO<T> {

    protected Class<T> modelType;


    protected EntityManager entityManager;

    public JpaAbstractDAO(Class<T> modelType){
        this.modelType = modelType;
    }

    @PersistenceContext
    public void setEm(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public T add(T o) {
        return null;
    }

    @Override
    public List<T> getAll() {
        return null;
    }

    @Override
    public T update(Integer id) {
        return null;
    }

    @Override
    public void remove(Integer id) {

    }
}
