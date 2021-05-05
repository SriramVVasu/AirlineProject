/*import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class Test1 {

	    @Test
	    public void testWelcome()
	    {
	       // String welcomeMessage = "Welcome to JUnit";
	        GreetMessenger greetMsg = new GreetMessenger("Welcome to JUnit");
	    	assertEquals("Welcome to JUnit", greetMsg.getGreeting());
	    	System.out.println("testWelcome is over ");
	    }
	    
	    @Test
	    public void testSomeAssertions()
	    {
	       // String welcomeMessage = "Welcome to JUnit";
	    	int empno = 7839;
	    	String empname = "KING";
	    	String empjob  = "PRESIDENT";
  	        
	    	assertEquals("PRESIDENT", empjob);
	    	System.out.println("empjob passed....");
	    	
	    	assertTrue(empno > 1000);
	    	System.out.println("empno passed....");
	    	
	    	assertNotNull(empname);
	    	System.out.println("empname passed....");
	    	
	    	System.out.println("testSomeAssertions is over....");
	    }
	    @Test
	    public void testWithdraw()
	    {
	    	 SavingsAccount savObj = new SavingsAccount(85000);
	    	 assertNotNull(savObj);
	    	 savObj.withdraw(15000);
	    	 assertEquals(70000, savObj.getBankBalance(),"Balance is not matching");
	    	
		   
	}
}

*/