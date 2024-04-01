package javaassignment10.question4.university.faculty;

public class NonTeachingFaculty implements Faculty {
	private String name;
	private String facultyId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}

	public NonTeachingFaculty(String name, String facultyId) {
		this.name = name;
		this.facultyId = facultyId;
	}

	@Override
	public void displayDetails() {
		System.out.println("Teaching Faculty Name: " + name);
		System.out.println("Faculty ID: " + facultyId);
	}
}
