package io.swagger.services;

import java.util.List;

public interface Service<T> {

    void save(T t);

    T findById(Long id);

    List<T> findAll();

    T update(T t);

    void delete(Long id);

}
