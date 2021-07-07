package com.garage.vehics;

public class Aeroplane extends Vehicle {

	private boolean hasJets;
	private int numWings;

//	***** CONSTRUCTOR **********
	public Aeroplane(String model, int price, int topSpeed, Boolean hasRoof, boolean hasJets, int numWings) {
		super(model, price, 3, topSpeed, hasRoof, "Aviation fuel");
		setHasJets(hasJets);
		setNumWings(numWings);
	}

	@Override
	public int getBill() {
		if (isHasJets()) {
			return 10000 * getNumWings();
		} else {
			return getPrice() / 4;
		}

	}

//	**********************GETTERS/SETTERS*********************
	public boolean isHasJets() {
		return hasJets;
	}

	public void setHasJets(boolean hasJets) {
		this.hasJets = hasJets;
	}

	public int getNumWings() {
		return numWings;
	}

	public void setNumWings(int numWings) {
		this.numWings = numWings;
	}

}
