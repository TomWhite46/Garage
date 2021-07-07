package com.garage.vehics;

public class Horse extends Vehicle {

	private String name;
	private Boolean isHappy;

	public void speak() {
		System.out.println("Whinny");
	}

//	***** CONSTRUCTOR **********
	public Horse(int price, int topSpeed, String name, Boolean isHappy) {
		super("Horse", price, 0, topSpeed, false, "Oats and carrots");
		this.name = name;
		this.isHappy = isHappy;
	}

	@Override
	public int getBill() {
		return getTopSpeed() * 10;
	}

//	**********************GETTERS/SETTERS*********************
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	horse models are all 'horse' so returns name instead
	@Override
	public String getModel() {
		return name + " (" + getClass().getSimpleName() + ")";
	}

	public Boolean getIsHappy() {
		return isHappy;
	}

	public void setIsHappy(Boolean isHappy) {
		this.isHappy = isHappy;
	}

}
