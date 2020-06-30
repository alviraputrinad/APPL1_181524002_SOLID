package Model;

import Interface.ISleeper;

public abstract class Worker implements ISleeper {
	
	private String id;
	private int workingHours;
	
	public Worker(String id) {
		this.id = id;
	}
	
	public void Work(int hours) {
		this.workingHours += hours;
	}

}
