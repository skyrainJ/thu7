package lab3;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator c = new Calculator();
	@Before 
//	public void init() {Calculator c = new Calculator();}
	@After
//	public void tearDown() {c =null;}
	
	@Test(expected=ArithmeticException.class)
	public void testAdd()  {
		assertTrue(c.add(1,2)==3);
	}
	@Test(expected=ArithmeticException.class)
	public void testsubtrart()  {
		assertTrue(c.subtract(9, 3)==6);
	}
	@Test(expected=ArithmeticException.class)
	public void testMultiply()  {
		assertTrue(c.multiply(2, 3)==6);
	}
	@Test(expected=ArithmeticException.class)
	public void testDivide()  {
		assertTrue(c.divide(5, 5)==1);
	}
}
