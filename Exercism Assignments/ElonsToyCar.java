package exercism;

public class ElonsToyCar {
	private int distanceDriven = 0;
	private int batteryPercentage = 100;

	public static ElonsToyCar buy() {
		return new ElonsToyCar();
	}

	public String distanceDisplay() {
		return "Driven " + distanceDriven + " meters";
	}

	public String batteryDisplay() {
		return batteryPercentage > 0 ? "Battery at " + batteryPercentage + "%" : "Battery empty";
	}

	public void drive() {
		if (batteryDisplay().equals("Battery empty"))
			return;
		distanceDriven += 20;
		batteryPercentage -= 1;
	}
}
