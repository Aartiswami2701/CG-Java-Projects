import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {
 
	private static ICalculator calculator;
 
	@BeforeAll
	public static void initCalculator() {
		calculator = new Calculator();
		System.out.println(" Hello ! Before All Tests");
	}
 
	@BeforeEach
	public void beforeEachTest() {
		System.out.println("This is executed before each Test");
	}
 
	
	@AfterAll
	public static void afterAllTest() {
		System.out.println("After all execution");
	}
 
	@Test // This is a test case
	public void testSum() {
		int result = calculator.sum(3, 4);
		assertEquals(7, result);
	}
 
	@Test // This is a test case
	public void testMul() {
		int result = calculator.mul(3, 4);
		assertEquals(12, result);
	}
 
	@Test // This is a test case
	public void testSub() {
		int result = calculator.sub(3, 4);
		assertEquals(-1, result);
	}
 
	@Test // This is a test case
	public void testDiv() {
		int result = calculator.div(3, 4);
		assertEquals(0, result);
	}
 
	@Test
	public void testDivisionException() {
		// Expecting an Exception to be thrown when dividing by zero
		Exception exception = assertThrows(Exception.class, () -> {
			calculator.div(10, 0);
		});
		assertEquals("/ by 0", exception.getMessage());
	}
 
}
