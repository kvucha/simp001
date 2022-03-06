package com.javatechie.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class YEARPOPULATION {

	
	private Long ID;
	private Long YEAR;
	private int POPULATION;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public Long getYEAR() {
		return YEAR;
	}
	public void setYEAR(Long yEAR) {
		YEAR = yEAR;
	}
	public int getPOPULATION() {
		return POPULATION;
	}
	public void setPOPULATION(int pOPULATION) {
		POPULATION = pOPULATION;
	}
	

		

}
