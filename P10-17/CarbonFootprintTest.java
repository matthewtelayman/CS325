//Matt Layman 10-17 CarbonFootprintTest.java

public class CarbonFootprintTest {
	public static void main(String[] args) {
		CarbonFootprint[] list = new CarbonFootprint[3];

		// add elements to list
		list[0] = new Bicycle();
		list[1] = new Building(2500);
		list[2] = new Car(10);

		// display carbon footprint of each object
		for (int i = 0; i < list.length; i++)
			list[i].GetCarbonFootprint();
	}
}// end Class CarbonFootPrintTest
