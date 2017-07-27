
public class Student {

	private String studentID;
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private double[] grades;
	
	//Constructor
	public Student(String studentID, String firstName, String lastName, String email, int age, double[] grades) {
		setStudentID(studentID);
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setAge(age);
		setGrades(grades);
	}
	
	// accessor / getter
	public String getStudentID() {
		return studentID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getAge() {
		return age;
	}
	
	public double[] getGrades() {
		return grades;
	}
	
	//mutator, setter
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGrades(double[] grades) {
		this.grades = grades;
	}
	
	public void print() {
		System.out.println(
				getStudentID() + 
				"\tFirst Name:" + getFirstName() + 
				"\t" + "Last Name:" + getLastName() +
				"\tEmail:\t" + getEmail() +
				"\tAge:\t" + getAge() +
				"\tGrades:\t" + getGrades()[0] + ", " + getGrades()[1] + ", " + getGrades()[2]);
	}
	// Frivolous Comment
}
