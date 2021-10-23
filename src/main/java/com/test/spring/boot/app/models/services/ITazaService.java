package com.test.spring.boot.app.models.services;

import java.util.List;

import com.test.spring.boot.app.models.entity.Taza;

public interface ITazaService {

	public List<Taza> findAll();

	public Taza findById(Long id);

	public Taza save(Taza taza);

	public void delete(Long id);
}
