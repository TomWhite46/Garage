package com.garage;

import java.util.ArrayList;

import com.garage.vehics.Vehicle;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

//	List all vehicles and stats
	public void listVehicles() {

		System.out.println("The contents of the garage are:");

		if (vehicles == null || vehicles.size() == 0) {
			System.out.println("The garage is empty!");
		} else {
			System.out.println("---------------------");
			for (Vehicle vehicle : vehicles) {
				System.out.print("Model: ");
				System.out.println(vehicle.getModel());
				System.out.print("Price: £");
				System.out.println(vehicle.getPrice());
				System.out.print("Top Speed: ");
				System.out.print(vehicle.getTopSpeed());
				System.out.println("mph");
				System.out.println("---------------------");

			}
		}
	}

//	*************** ADD AND REMOVE *************************************
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

//	Remove vehicle by object
	public void removeVehicle(Vehicle vehicle) {
		if (vehicle.toString().equals("Horse")) {
			System.out.println(vehicle.getModel() + " has been taken out and shot. You monster.");
		} else {
			System.out.println(vehicle.getModel() + " has been removed and destroyed.");
		}
		vehicles.remove(vehicle);
	}

//	remove vehicle by ID (= index no)
	public void removeVehicleByID(int ID) {
		removeVehicle((getVehicles().get(ID)));
	}

//	remove all vehicles of specified type (using string input)
	public void removeVehicleByType(String typeName) {
		ArrayList<Vehicle> removeList = new ArrayList<>();

		System.out.println("Removing all " + typeName.toLowerCase() + "s:");

		for (Vehicle vehicle : vehicles) {
			if (vehicle.toString().equals(typeName)) {
				// commit each to remove list
				removeList.add(vehicle);
			}
		}

		if (removeList.size() == 0) {
			// if none to remove, print message saying none of type found
			System.out.println("\tNo " + typeName.toLowerCase() + "s in garage!");
		} else {
			for (Vehicle vehicle : removeList) {
				// loop through objects in remove list and remove from original list
				System.out.print("\t");
				removeVehicle(vehicle);
			}
		}

	}

	public void empty() {
		vehicles.clear();
		System.out.println("Garage has been emptied.");
	}

//	********************FIXING AND BILLING***************************
	public float fix(Vehicle vehicle) {
		float bill;
		bill = vehicle.getBill();
		System.out.print("The bill for fixing " + vehicle.getModel() + " is: £");
		System.out.println(((float) ((int) (bill * 100))) / 100);
		;
		return bill;
	}

	public String totalBill() {
		float totalBill = 0;

		for (Vehicle vehicle : vehicles) {
			totalBill += fix(vehicle);
		}

		return "The total bill is: £" + ((float) ((int) (totalBill * 100))) / 100;

	}

	public void printBill() {
		if (vehicles == null || vehicles.size() == 0) {
			System.out.println("No bill: the garage is empty!");
		} else {
			System.out.println(totalBill());
		}
	}

//	**********************GETTERS/SETTERS*********************
	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(ArrayList<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

}
