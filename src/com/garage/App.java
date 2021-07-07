package com.garage;

import com.garage.vehics.Aeroplane;
import com.garage.vehics.Car;
import com.garage.vehics.Horse;

public class App {

	public static void main(String[] args) {

		Garage myGarage = new Garage();

		myGarage.addVehicle(new Car("Ford Mondeo", 525, 120, true, "Diesel", 3, true));
		myGarage.addVehicle(new Horse(5000, 40, "Shadowfax", true));
		myGarage.addVehicle(new Aeroplane("Sopwith Camel", 50000, 200, false, false, 4));
		myGarage.addVehicle(new Horse(5000, 300, "Sleipnir", false));
		myGarage.addVehicle(new Aeroplane("F-15", 1000000, 800, true, true, 2));
		myGarage.addVehicle(new Car("Car-y McCarface", 5, 5, true, "Water", 2, false));

		myGarage.getVehicles().get(1).travel(70);

		myGarage.removeVehicleByID(1);
		myGarage.removeVehicleByType("Horse");
		myGarage.removeVehicleByType("Motorbike");

		System.out.println();

		myGarage.listVehicles();

		System.out.println();

		myGarage.printBill();

		System.out.println();

		myGarage.empty();

		System.out.println();

		myGarage.listVehicles();

	}

}
