package warmup1;

public class IcyHot {
	public static void main(String[] args) {
		IcyHot s = new IcyHot();
		System.out.println(s.icyHot(0, 100));
	}

	public boolean icyHot(int temp1, int temp2) {
		if (temp1 < 0 && temp2 > 100 || temp2 < 0 && temp1 > 100)
			return true;

		return false;
	}

}
