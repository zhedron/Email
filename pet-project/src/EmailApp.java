
public class EmailApp {

	public static void main(String[] args) {
		Email email = new Email ("Zheka", "Dron");
		email.setChangeEmail("my.mail@gmail.com");
		email.setChangePassword("1234567");
		System.out.println("Your email changed to " + email.getChangeEmail());
		System.out.println("Your password changed to " + email.getChangePassword());
	}

}
