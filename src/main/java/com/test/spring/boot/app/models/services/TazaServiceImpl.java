package com.test.spring.boot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.spring.boot.app.models.dao.ITazaDao;
import com.test.spring.boot.app.models.entity.Taza;

@Service
public class TazaServiceImpl implements ITazaService {

	@Autowired
	private ITazaDao tazaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Taza> findAll() {
		return (List<Taza>) tazaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Taza findById(Long id) {
		return tazaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Taza save(Taza taza) {
		return tazaDao.save(taza);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		tazaDao.deleteById(id);
	}

}
