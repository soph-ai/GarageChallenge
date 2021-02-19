package garageChallenge;

import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicles> vehicleList = new ArrayList<>();

	// add vehicle method
	public void addVehicle(Vehicles vehicles) {
		vehicleList.add(vehicles);
	}

	// remove vehicle method
	public void removeVehicle(Vehicles vehicles) {
		vehicleList.remove(vehicles);
	}

	// print vehicle method
	public void printVehicles() {
		for (int i = 0; i < vehicleList.size(); i++) {

			Vehicles actualVehicle = vehicleList.get(i);
			actualVehicle.printVehicle();
		}
	}

	// bill payment

	public void billPayments() {
		for (int i = 0; i < vehicleList.size(); i++) {

			Vehicles actualPayment = vehicleList.get(i);
			actualPayment.billPayment(actualPayment);
		}
	}

	// print bill method
	public void printBills() {
		for (int i = 0; i < vehicleList.size(); i++) {

			Vehicles actualVehicle = vehicleList.get(i);
			actualVehicle.printBill();
		}
	}

}
