package garageChallenge;

public class Lorry extends Vehicles {

	private String trailerSize;

	public Lorry(String colour, int wheels, String model, double price, String extraFunction) {
		super(colour, wheels, model, price, extraFunction);
		this.setTrailerSize(trailerSize);
	}

	@Override
	public String extraFunction() {
		return "a trailer.";
	}

	// getter
	public String getTrailerSize() {
		return trailerSize;
	}

	// setter
	public void setTrailerSize(String trailerSize) {
		this.trailerSize = trailerSize;
	}

}
