import java.util.Scanner;

public class Email {
	public String firstname;
	public String lastname;
	public String email;
	public String password;
	public int passwordDefault = 8;
	public String department;
	public String company = "zhedron";
	public String changeEmail;
	public String changePassword;

	Email (String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		
		System.out.println("Email created by: " +  this.firstname + " " + this.lastname);
		
		// calling a method
		this.department = setDetartment();
		
		System.out.println("Department: " + this.department);
		
		// call the method that generates the password
		this.password = generatepassword(passwordDefault);
		
		System.out.println("Your password is: " + this.password);
		
		System.out.println("Your email " + this.firstname.toLowerCase() + this.lastname.toLowerCase() + "@" + this.company + "." + "ua");
	}
	
	
	public String setDetartment () {
		System.out.println("Department CODES\n1 for Sales\n2 for Development\n3 for Accounting \n0 none\nEnter department code: ");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			return "sales";
		case 2:
			return "dev";
		case 3:
			return "acc";
			default:
				return "";
		}
	}
	
	// set password generator
	public String generatepassword (int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUMXYZ0123456789!@#$%?";
		
		char[] password = new char[length];
		
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String (password);
	}

	public String getChangeEmail() {
		return changeEmail;
	}

	public void setChangeEmail(String changeEmail) {
		this.changeEmail = changeEmail;
	}
	
	public String getChangePassword() {
		return changePassword;
	}

	public void setChangePassword(String changePassword) {
		this.changePassword = changePassword;
	}
}
