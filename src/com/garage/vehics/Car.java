package com.garage.vehics;

public class Car extends Vehicle {

	private int numDoors;
	private Boolean hasHeating;

//	***** CONSTRUCTOR **********
	public Car(String model, int price, int topSpeed, Boolean hasRoof, String fuelType, int numDoors,
			Boolean hasHeating) {
		super(model, price, 4, topSpeed, hasRoof, fuelType);
		setNumDoors(numDoors);
		setHasHeating(hasHeating);
	}

	@Override
	public float getBill() {
		if (getHasHeating()) {
			return (float) getPrice() / 2;
		} else {
			return (float) getPrice() / 4;
		}

	}

//	**********************GETTERS/SETTERS*********************
	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	public Boolean getHasHeating() {
		return hasHeating;
	}

	public void setHasHeating(Boolean hasHeating) {
		this.hasHeating = hasHeating;
	}
}
