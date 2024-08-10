
public class Main {

	public static void main(String[] args) {

		IDandPasswords idandpassword = new IDandPasswords();
		
		LoginPage loginPage = new LoginPage(idandpassword.getLoginInfo());
		
	}

}
