package com.example.demo;

import javax.persistence.Entity;


public class BodyModel {
	Integer counter ;
			

	@Override
	public String toString() {
		return "{" + "\"" + "counter" + "\"" + ":" + counter + "}";
	}

	public Integer getCounter() {
		return counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
	}
	

	
	
	

}
