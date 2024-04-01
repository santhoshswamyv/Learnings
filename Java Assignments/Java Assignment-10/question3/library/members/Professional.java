package javaassignment10.question3.library.members;

public class Professional implements Member {

	private String memberId;
	private String name;

	public Professional(String memberId, String name) {
		this.memberId = memberId;
		this.name = name;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String displayDetails() {
		return "Professional [memberId=" + memberId + ", name=" + name + "]";
	}

}
