import java.util.Scanner;

public class EmailValidation {

	public static final Scanner scan = new Scanner(System.in);

	public static void checkEmail() {
		System.out.println("......Email Validation......");
		System.out.println("Enter Your Email Id");
		String emailId = scan.nextLine();
		String regex = "^[a-zA-Z0-9]+[@]+[a-zA-Z]*";
			if (emailId.matches(regex)) {
				System.out.println("This Email Id Is Valid");

			} else {
				System.out.println("This Email Id is Invaild");

			}

	}

	public static void main(String[] args) {
		//calling method to check Email Validation
		checkEmail();

	}

}

