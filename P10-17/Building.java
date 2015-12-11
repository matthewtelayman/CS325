//Matt Layman 10-17 Building.java

public class Building implements CarbonFootprint {
	private int squareFeet;

	public Building(int squareFeet) {
		this.squareFeet = squareFeet;
	}

	// Simplified formula: multiply the square footage by 50
	// for the wood frame, by 20 for the basement,
	// by 47 for the concrete, and 17 for the steel
	// Note: the website where we got this no longer exits
	public void GetCarbonFootprint() {
		System.out.printf("Building with %d square feet: %d\n", squareFeet,
				squareFeet * (50 + 20 + 47 + 17));
	}
}
