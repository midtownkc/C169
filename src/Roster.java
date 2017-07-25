import java.util.ArrayList;

public class Roster {
	
	private static ArrayList<Student> myClass = new ArrayList<>();
	
	public static void main(String[] args) {
		print_all();
		// print_invalid_emails();
		//loop through the ArrayList and for each element:
		// print_average_grade(current_loop_student);
		remove("3");
		remove("3");
		//expected: this should print a message saying such a student with this ID was not found.
		 
	}
	
	public static void remove(String studentID) {
		for (Student s : myClass)
		{
			if (s.getStudentID() == studentID ) {
				myClass.remove(s);
				System.out.println("Removed Student: " + studentID);
			}else {
				System.out.println("Error. \nNo user found with Student ID: " +  studentID);
			}
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
				int total = 0;
				for (Double g : s.getGrades())
				{
					// code to add grades and then return average
				}
			}
		}
	}
	
}
