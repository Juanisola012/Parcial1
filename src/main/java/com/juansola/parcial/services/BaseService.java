package com.juansola.parcial.services;
import java.io.Serializable;
import java.util.List;

import com.juansola.parcial.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface BaseService<E extends Base, ID extends Serializable> {

    List<E> findAll() throws Exception;
    Page<E> findAll(Pageable pageable) throws Exception;

    E findById(ID id) throws Exception;

    E save(E entity) throws Exception;

    E update(E entity, ID id) throws Exception;

    boolean delete(ID id) throws Exception;
}