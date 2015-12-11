//Matt Layman 9-8 Parallelogram.java
//class parallelogram definition

public class Parallelogram extends Trapezoid {
	// constructor
	public Parallelogram(double x1, double y1, double x2, double y2, double x3,
			double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}

	// return width of parallelogram
	public double getWidth() {
		if (getPoint1().getY() == getPoint2().getY())
			return Math.abs(getPoint1().getX() - getPoint2().getX());
		else
			return Math.abs(getPoint2().getX() - getPoint3().getX());
	}

	// return string rep of Parallelogram object
	@Override
	public String toString() {
		return String.format("\n%s:\n%s%s: %s\n%s: %s\n%s: %s\n",
				"Coordinate of Parallelogram are", getCoordinatesAsString(),
				"Width is", getWidth(), "Height is", getHeight(), "Area is",
				getArea());
	}
} // end class Parallelogram
