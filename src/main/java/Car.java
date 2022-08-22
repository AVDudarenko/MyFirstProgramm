public class Car {

	private String brand;
	private String model;
	private double engineSize;
	private int releaseDate;

	public void equals(String modelFirst, String modelSecond, int releaseDateFirst, int releaseDateSecond) {
		if (modelFirst.equals(modelSecond) && releaseDateFirst == releaseDateSecond) {
			System.out.println("Two equals car.");
		} else {
			System.out.println("Not two equals car.");
		}
	}
}
