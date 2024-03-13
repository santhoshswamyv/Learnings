package exercism;

public class AnnalynsInfiltration {

	public static void main(String[] args) {
		System.out.println(canFreePrisoner(true, false, false, true));

	}

	public static boolean canFastAttack(boolean knightIsAwake) {
		return !knightIsAwake;
	}

	public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
		return (knightIsAwake || archerIsAwake || prisonerIsAwake);
	}

	public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
		return !archerIsAwake && prisonerIsAwake;
	}

	public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake,
			boolean petDogIsPresent) {
		return petDogIsPresent ? (!archerIsAwake ? true : false)
				: (!archerIsAwake && !knightIsAwake && prisonerIsAwake) ? true : false;
	}
}
