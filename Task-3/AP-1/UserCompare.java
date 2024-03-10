package task3.ap1;

public class UserCompare {
	public static void main(String[] args) {
		UserCompare s = new UserCompare();
		System.out.println(s.userCompare(null, 0, null, 0));
	}

	public int userCompare(String aName, int aId, String bName, int bId) {
		int nameCompare = aName.compareTo(bName);
		if (nameCompare == 0) {
			return Integer.compare(aId, bId);
		} else {
			return nameCompare < 0 ? -1 : 1;
		}
	}

}
