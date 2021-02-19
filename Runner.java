package garageChallenge;

public class Runner {

	public static void main(String[] args) {
		Car car1 = new Car("red", 4, "audi", 5000, "huge boot");
		Car car2 = new Car("orange", 4, "lamboghini", 20000, "tiny boot");

		Bike bike1 = new Bike("blue", 2, "BMW", 2500, "side car");
		Bike bike2 = new Bike("black", 2, "VW", 3000, "no side car");

		Lorry lorry1 = new Lorry("red", 8, "VW", 6000, "very long trailer");
		Lorry lorry2 = new Lorry("yellow", 8, "DAF", 10000, "short trailer");

		Garage garage = new Garage();
		garage.addVehicle(car1);
		garage.addVehicle(car2);

		garage.addVehicle(bike1);
		garage.addVehicle(bike2);

		garage.addVehicle(lorry1);
		garage.addVehicle(lorry2);

		garage.removeVehicle(lorry1);

		garage.printVehicles();

		garage.billPayments();

		garage.printBills();

	}

}