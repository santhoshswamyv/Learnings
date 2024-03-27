package javaassignment8;

public class ZSGS {
	private String name;

	public ZSGS(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class ZSGSStudent extends ZSGS {
	private int studentId;

	public ZSGSStudent(String name, int studentId) {
		super(name);
		this.studentId = studentId;
	}

	public ZSGSStudent(String name, String school, int studentId) {
		super(name);
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}
}
