package exercism;

public class NeedForSpeed {
	int speed;
	int batteryDrain;
	int distanceDriven;
	int batteryRemaining;

	NeedForSpeed(int speed, int batteryDrain) {
		this.speed = speed;
		this.batteryDrain = batteryDrain;
		this.batteryRemaining = 100;
	}

	public boolean batteryDrained() {
		return batteryRemaining <= 0;
	}

	public int distanceDriven() {
		return distanceDriven;
	}

	public void drive() {
		if (batteryDrained())
			return;
		distanceDriven += speed;
		batteryRemaining -= batteryDrain;
	}

	public static NeedForSpeed nitro() {
		return new NeedForSpeed(50, 4);
	}
}

class RaceTrack {
	int distance;

	RaceTrack(int distance) {
		this.distance = distance;
	}

	public boolean tryFinishTrack(NeedForSpeed car) {
		return (100 / car.batteryDrain) * car.speed >= distance;
	}
}
