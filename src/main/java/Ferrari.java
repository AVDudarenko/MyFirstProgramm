public class Ferrari extends Car {

	private String model = "F40";
	private int releaseDate = 1985;

	public String getModel() {
		return model;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	@Override
	public void equals(String modelFirst, String modelSecond, int releaseDateFirst, int releaseDateSecond) {
		if (modelFirst.equals(modelSecond) && releaseDateFirst == releaseDateSecond) {
			System.out.println("Two equals car.");
		} else {
			System.out.println("Not two equals car.");
		}
	}
}
