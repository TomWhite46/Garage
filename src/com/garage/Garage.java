package com.garage;

import java.util.ArrayList;

import com.garage.vehics.Vehicle;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

//	List all vehicles and stats
	public void listVehicles() {

		System.out.println("The contents of the garage are:");
		System.out.println("---------------------");

		if (vehicles == null || vehicles.size() == 0) {
			System.out.println("The garage is empty!");
		} else {

			for (Vehicle vehicle : vehicles) {
				System.out.print("Model: ");
				System.out.println(vehicle.getModel());
				System.out.print("Price: ");
				System.out.println(vehicle.getPrice());
				System.out.print("Top Speed: ");
				System.out.println(vehicle.getTopSpeed());
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
		System.out.println(vehicle.getModel() + " has been removed and destroyed.");
		vehicles.remove(vehicle);
	}

//	remove vehicle by ID (= index num)
	public void removeVehicleByID(int ID) {
		System.out.println(getVehicles().get(ID).getModel() + " has been removed and destroyed.");
		getVehicles().remove(getVehicles().get(ID));
	}

//	remove all vehicles of specified type (using string input)
	public void removeVehicleByType(String typeName) {
		ArrayList<Vehicle> removeList = new ArrayList<>();

		System.out.println("Removing all " + typeName.toLowerCase() + "s:");

		for (Vehicle vehicle : vehicles) {
			if (vehicle.toString().equals(typeName)) {
				removeList.add(vehicle);
			}
		}

		if (removeList.size() == 0) {
			System.out.println("\tNo " + typeName + "s in garage!");
		} else {
			for (Vehicle vehicle : removeList) {
				System.out.println("\t" + vehicle.getModel() + " has been removed and destroyed.");
				vehicles.remove(vehicle);
			}
		}
	}

	public void empty() {
		vehicles = null;
		System.out.println("Garage has been emptied.");
	}

//	********************FIXING AND BILLING***************************
	public int fix(Vehicle vehicle) {
		int bill;
		bill = vehicle.getBill();
		System.out.print("The bill for fixing " + vehicle.getModel() + " is: �");
		System.out.println(bill);
		return bill;
	}

	public String totalBill() {
		int totalBill = 0;

		for (Vehicle vehicle : vehicles) {
			totalBill += fix(vehicle);
		}

		return "The total bill is: �" + totalBill;

	}

	public void printBill() {
		if (vehicles == null || vehicles.size() == 0) {
			System.out.println("No bill: the garage is empty!");
		} else {
			System.out.print(totalBill());
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