package com.test.spring.boot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.test.spring.boot.app.models.entity.Taza;

public interface ITazaDao extends CrudRepository<Taza, Long> {

}
