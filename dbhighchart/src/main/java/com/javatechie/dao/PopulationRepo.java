package com.javatechie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.model.YEARPOPULATION;

public interface PopulationRepo extends JpaRepository<YEARPOPULATION,Long> {

}
