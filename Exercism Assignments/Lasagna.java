package exercism;

public class Lasagna {
	static final int LASAGNA_COOKING_TIME = 40;

	public int expectedMinutesInOven() {
		return LASAGNA_COOKING_TIME;
	}

	public int remainingMinutesInOven(int lasagnaIsInOven) {
		return expectedMinutesInOven() - lasagnaIsInOven;
	}

	public int preparationTimeInMinutes(int numberOfLayers) {
		return numberOfLayers * 2;
	}

	public int totalTimeInMinutes(int numberOfLayers, int numberOfMinutesLasagnaIsInOven) {
		return preparationTimeInMinutes(numberOfLayers) + numberOfMinutesLasagnaIsInOven;
	}
}