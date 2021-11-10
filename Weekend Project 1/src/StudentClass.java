import java.util.Scanner;

public class StudentClass {

	public static void main(String[] args) {

		String fullName;
		double schoolCredits;
		double schoolGpa;
		String schoolName;
		String schoolMajor;
		String schoolEmailAddress;

		Scanner userStudentInput = new Scanner(System.in);

		// Print out statement asking for student's fullName, credits, gpa, school,
		// major, email address

		System.out.println("Please enter your full name: ");

		// Create a variable that stores info inputed by user

		fullName = userStudentInput.nextLine();

		System.out.println("Please enter your credits: ");

		// Create a variable that stores info inputed by user

		schoolCredits = userStudentInput.nextDouble();

		if (schoolCredits >= 120) {
			System.out.println("Congratulations, you have met the requirement of 120 or more credits to graduate.");

		}

		if (schoolCredits < 120) {
			System.out.println("You have not met the requirement of 120 or more credits to graduate.");
		}
		System.out.println("Please enter your GPA: ");

		schoolGpa = userStudentInput.nextDouble();

		if (schoolGpa < 2.50) {
			System.out.println("You have not met the requirement of 2.50 or greater GPA to graduate.");
		}

		if (schoolGpa >= 2.50) {
			System.out.println("Congratulations, you have met the requirement of 2.50 or greater GPA to graduate.");
		}
		userStudentInput.nextLine();
		
		System.out.println("Please enter your school name:");

		// Create a variable that stores info inputed by user
		schoolName = userStudentInput.next(); 

		userStudentInput.nextLine();
		
		System.out.println("Please enter your school major: ");
		// Create a variable that stores info inputed by user

		schoolMajor = userStudentInput.next();

		if (schoolCredits >= 60) {
			System.out.println("You have reached 60 or more credits must declare a major please do so as soon as possible. ");
		}

		System.out.println("Please enter your school email address: ");

		// Create a variable that stores info inputed by user

		schoolEmailAddress = userStudentInput.next();

	}

}


