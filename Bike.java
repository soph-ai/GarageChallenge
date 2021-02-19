package garageChallenge;

public class Bike extends Vehicles {

	private String sideCar;

	public Bike(String colour, int wheels, String model, double price, String extraFunction) {
		super(colour, wheels, model, price, extraFunction);
		this.setSideCar(sideCar);
	}

	@Override
	public String extraFunction() {
		return "a side car.";
	}

	// getter
	public String getSideCar() {
		return sideCar;
	}

	// setter
	public void setSideCar(String sideCar) {
		this.sideCar = sideCar;
	}

}
