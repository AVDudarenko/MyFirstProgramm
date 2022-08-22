public class Circle {

	private static final double pi = 3.14;
	private double radius;
	private double area;
	private double circumference;

	public Circle(double radius) {
		this.radius = radius;
	}

	public void getArea() {
		area = pi * (radius * radius);
		System.out.println("Area of circle: " + area);
	}

	public void getCircumference() {
		double circumference = pi * 2 * radius;
		System.out.println("Circumference of circle: " + circumference);
	}

}
