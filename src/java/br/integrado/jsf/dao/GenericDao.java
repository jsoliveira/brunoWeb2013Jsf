package br.integrado.jsf.dao;

import br.integrado.jsf.tools.JpaUtil;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;

public abstract class GenericDao< T extends Serializable> {

    private Class< T> clazz;
    EntityManager entityManager = JpaUtil.getEntityManager();

    public void setClazz(final Class< T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    public T findOne(final Long id) {
        //return entityManager.find(clazz, id);
        return (T) entityManager.find(clazz, id);
    }

    public List<T> findAll() {
        return entityManager.createQuery("SELECT e FROM " + clazz.getSimpleName() + " e").getResultList();
    }

    public void save(final T entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }

    public void update(final T entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }

    public void delete(final T entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }
}