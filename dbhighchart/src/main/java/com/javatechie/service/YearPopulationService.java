package com.javatechie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.dao.PopulationRepo;
import com.javatechie.model.YEARPOPULATION;

@Service
public class YearPopulationService {

	@Autowired
	private PopulationRepo repo;
	
	
	public List<YEARPOPULATION> listAll() {
		return repo.findAll();
	}
}
