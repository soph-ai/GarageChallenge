package garageChallenge;

public abstract class Vehicles {

	// instance variables
	private String colour;
	private int wheels;
	private String model;
	private double price;

	// constructors (overloaded)
	public Vehicles() {
		super();
	}

	public Vehicles(String colour, int wheels, String model, double price, String extraFunction) {
		this.colour = colour;
		this.wheels = wheels;
		this.model = model;
		this.price = price;
	}

	public abstract String extraFunction();

	// getters
	public String getColour() {
		return colour;
	}

	public int getWheels() {
		return wheels;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	// setters
	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// printVehicle method
	public void printVehicle() {

		System.out.println("Hi, I'm a " + this.colour + " " + this.model + " with " + this.wheels
				+ " wheels! And I cost £" + this.price + ". I have " + extraFunction());
	}

	// bill payment
	private double bill;

	public void billPayment(Vehicles vehicle) {
		if (vehicle instanceof Car) {
			bill = price * 0.3;
		} else if (vehicle instanceof Bike) {
			bill = price * 0.1;
		} else if (vehicle instanceof Lorry) {
			bill = price * 0.5;
		} else {
			System.out.println("not a valid vehicle type");
		}
	}

	// printBill method
	public void printBill() {

		System.out.println("I cost £" + this.price + " and my bill for repair is: £" + this.bill);
	}
}
