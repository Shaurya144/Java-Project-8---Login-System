import java.util.HashMap;

public class IDandPasswords {

	// hashmaps = key value pairs
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	IDandPasswords(){
		loginInfo.put("user1", "password1");
		loginInfo.put("user2", "password2");
		loginInfo.put("user3", "password3");

	}
	
	protected HashMap getLoginInfo(){
		return loginInfo;
	}
}
