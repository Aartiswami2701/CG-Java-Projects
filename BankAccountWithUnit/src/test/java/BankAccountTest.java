
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
 
import com.cg.BankAccount;
 
public class BankAccountTest {
 
	BankAccount b;
 
	@BeforeEach
	public void objBank() {
		b = new BankAccount();
	}
 
	@Test
	public void depositeTest() {
		double prevBal = b.getBalance();
		b.deposite(120000.00);
		assertEquals(prevBal + 120000.00, b.getBalance(), "balance should be 1200000.00+");
	}
 
	@Test
	public void initialBlance() {
		assertEquals(b.getBalance(), 0.0, "Initial balance is 0.0");
	}
 
	@Test
	public void withdrawTest() {
		depositeTest();
		double prevBal = b.getBalance();
		b.withdraw(1000.00);
		assertEquals(b.getBalance(), prevBal - 1000.00);
	}
	
	@Test
	public void testLowBalance()
	{
	
		Exception e = assertThrows(Exception.class, ()->{b.withdraw(2000.00);});
		assertEquals("Insufficient balance", e.getMessage());
	}
	
	
	
}