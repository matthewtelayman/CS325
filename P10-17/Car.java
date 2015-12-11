//Matt Layman 10-17 Car.java

public class Car implements CarbonFootprint {
	private double gallons;

	public Car(double gallons) {
		this.gallons = gallons;
	}

	// one gallon of gas yields 20 lbs of co2
	public void GetCarbonFootprint() {
		System.out.printf("Car that has used %.2f gallons of gas: %.2f\n",
				gallons, gallons * 20);
	}
}
