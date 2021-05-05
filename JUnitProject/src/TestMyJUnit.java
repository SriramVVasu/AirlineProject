
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


public class TestMyJUnit {
	  @Test
	  public void testWelcome(){
	     // String welcomeMessage="Welcome to Junit";
	     GreetMessenger greetMsg=new GreetMessenger("Welcome to Junit");
	      assertEquals("Welcome to Junit",greetMsg.getGreeting());
	      System.out.println("testWelcome is over ");
	      }
	  
	  
	  @Test
	  public void testWithdraw() {
	     SavingsAccount savObj = new SavingsAccount(85000);
	     savObj.withdraw(15000);
	     assertNotNull(savObj);   
	     assertEquals(70000,savObj.getBankBalance(),"Balance is not matching");
	  }


	@Test
	  public void testSomeAssertions(){
	         int empno= 7839;
	         String empname="KING";
	         String empjob="PRESIDENT";
	         
	      assertEquals("PRESIDENT",empjob);
	      System.out.println("empjob  passed");
	  
	      assertTrue(empno>1000);
	      System.out.println("empno  passed");
	      
	      assertNotNull(empname);
	      System.out.println("empname  passed");
	      
	      System.out.println("testSomeAssertions is over...");
	      }
	}


