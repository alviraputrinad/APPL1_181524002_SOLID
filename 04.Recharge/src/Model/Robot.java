package Model;

import Interface.IRechargeable;

public class Robot extends Worker implements IRechargeable{

	private int capacity;
	private int currentPower;
	
	public Robot(String id, int capacity) {
		super(id);
		this.capacity = capacity;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	@Override
	public void Recharge() {
		this.currentPower = this.capacity;
	}

	public int getCurrentPower() {
		return currentPower;
	}

	public void setCurrentPower(int currentPower) {
		this.currentPower = currentPower;
	}
	
	public void Work(int hours) {
		if (hours > this.currentPower) {
			hours = currentPower;
		}
		super.Work(hours);
		this.currentPower -= this.capacity;
	}

	@Override
	public void Sleep() {
		// sleep
	}

}
