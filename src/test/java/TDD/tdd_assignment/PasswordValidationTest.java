package TDD.tdd_assignment;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PasswordValidationTest 
{
    
    @Test
    public void checkPassword()
    {
    	String password="omkar";
    	String expectedPassword="Omkar@123";
       PasswordValidation pv=new PasswordValidation();
      String count=pv.getPassword(password);
      Assert.assertEquals(expectedPassword, count);
    }
    
    @Test(expected=AssertionError.class)
    public void checkPasswordWithEmptyInput()
    {
    	String password="";
    	int expectedPassword=0;
       PasswordValidation pv=new PasswordValidation();
      String count=pv.getPassword(password);
      Assert.assertEquals(expectedPassword, count);
    }
    
    @Test(expected=AssertionError.class)
    public void checkPasswordWithInvalidInput()
    {
    	String password="abc";
    	int expectedPassword=0;
       PasswordValidation pv=new PasswordValidation();
      String count=pv.getPassword(password);
      Assert.assertEquals(expectedPassword, count);
    }
}
