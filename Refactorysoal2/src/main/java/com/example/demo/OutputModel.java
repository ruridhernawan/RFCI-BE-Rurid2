package com.example.demo;

public class OutputModel {
	int counter ;
	String random ;
	
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public String getRandom() {
		return random;
	}
	public void setRandom(String random) {
		this.random = random;
	}
	@Override
	public String toString() {
		return "{" + "\"" + "counter" + "\"" + ":" + counter +", " +"\"" 
				+"X-RANDOM" +"\" :" +"\"" + random +"\"" 
				+ "}";
	}
	
	
	

}
