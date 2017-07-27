import java.util.ArrayList;

public class Roster {
	
	private static ArrayList<Student> myClass = new ArrayList<>();
	
	public static void main(String args[]) {
		add("1", "John", "Smith", "John1989@gmail.com", 20, 88,79,59);
		add("2", "Suzan", "Erickson", "Erickson_1990@gmailcom", 19, 91,72,85);
		add("3", "Jack", "Napoli", "The_lawyer99yahoo.com", 19, 85,84,87);
		add("4", "Erin", "Black", "Erin.black@comcast.net", 22, 91,98,82);
		add("5", "Max", "Fred", "mfred20@wgu.edu", 34, 99,97,100);
		print_all();
		print_invalid_emails();
		for (Student s : myClass) {
			print_average_grade(s.getStudentID());
		}
		remove("3");
		remove("3");
		//expected: this should print a message saying such a student with this ID was not found.
		 
	}
	
	//add students to roster
	public static void add(String studentID, String firstName, String lastName, String email, int age, double grade1, double grade2, double grade3) {
		double[] grades = {grade1, grade2, grade3};
		Student newStudent = new Student(studentID, firstName, lastName, email, age, grades);
		myClass.add(newStudent);
	}
	
	public static void remove(String studentID) {
		Student found = null;
		for (Student s : myClass)
		{
			String id = s.getStudentID();
			if ((id) == (studentID) ) {
				found = s;
				break;
			}
		}
		if (found != null) {
			myClass.remove(found);
			System.out.println("Removed Student: " + studentID);
		}else {
			System.out.println("No Student found with ID: " + studentID);
		}
	}
	
	public static void print_all() {
		for (Student s : myClass)
		{
			s.print();
		}
	}
	
	public static void print_average_grade(String studentID) {
		for (Student s : myClass) {
			if (s.getStudentID() == studentID) {
				double total = 0;
				double grade = 0;
				double[] grades = s.getGrades();
				for (Double g : grades)
				{
					total++;
					grade = grade + g;
				}
				double finalTotal = ((grade)/(total *100));
				System.out.println("Avg for ID " + studentID + ": " + finalTotal);
			}
		}
	}
	
	public static void print_invalid_emails() {
		for (Student s : myClass) {
			if (!s.getEmail().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")){
				System.out.println("Invalid Email: " + s.getEmail());
			}
		}
	}
}
