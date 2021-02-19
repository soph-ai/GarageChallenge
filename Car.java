package garageChallenge;

public class Car extends Vehicles {

	private String boot;

	public Car(String colour, int wheels, String model, double price, String extraFunction) {
		super(colour, wheels, model, price, extraFunction);
		this.setBootSize(boot);
	}

	@Override
	public String extraFunction() {
		return "a boot.";
	}

	// getter
	public String getBootSize() {
		return boot;
	}

	// setter
	public void setBootSize(String boot) {
		this.boot = boot;
	}

}
