package TDD.tdd_assignment;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class PasswordValidation 
{
 
	public String getPassword(String password) {
		List<String> passwordList=null;
		String isValid=null;
		if(password.isEmpty()) {
			throw new AssertionError("Password cannot be empty");
		}
		passwordList=getPasswordstat();
		if(!password.contains(password))
		{
			throw new AssertionError("Password is wrong");
		}
		else
		{
		 isValid=passwordList.get(1);
		}
		return isValid;
	}
	
	private List<String> getPasswordstat() {
		
		List<String> passwordList =new ArrayList<>();
		passwordList.add("omkar");
		passwordList.add("Omkar@123");
		passwordList.add("Omkar@");
		passwordList.add("omka123");
		return passwordList; 
		
	}

	
}
