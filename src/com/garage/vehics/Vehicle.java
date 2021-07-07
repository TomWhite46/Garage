package com.garage.vehics;

public abstract class Vehicle {

	private String model;
	private int price;
	private int numWheels;
	private int topSpeed;
	private Boolean hasRoof;
	private String fuelType;

	public void travel(int distance) {
		float time = (float) (distance) / (float) this.topSpeed;
		System.out.print("With your ");
		System.out.print(toString().toLowerCase());
		System.out.print(" " + getModel() + ", ");
		System.out.print("you have arrived at your destination after ");
		System.out.print(time);
		System.out.println(" hours.");
	}

	public void printStats() {
		System.out.println("Model: " + model + ", price: " + price + ", speed: " + topSpeed);
	}

//	***** CONSTRUCTOR **********
	public Vehicle(String model, int price, int numWheels, int topSpeed, Boolean hasRoof, String fuelType) {
		this.setModel(model);
		this.setPrice(price);
		this.setNumWheels(numWheels);
		this.setTopSpeed(topSpeed);
		this.setHasRoof(hasRoof);
		this.setFuelType(fuelType);
	}

//	get bill for vehicle- defined at individual vehicles
	public abstract float getBill();

//	Strings
	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

//	**********************GETTERS/SETTERS*********************
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public Boolean getHasRoof() {
		return hasRoof;
	}

	public void setHasRoof(Boolean hasRoof) {
		this.hasRoof = hasRoof;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

}
