package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	
	static MyInteger number2;
	static MyInteger number3;
	static MyInteger number4;
	static int num;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		number2 = new MyInteger(2);
		number3 = new MyInteger(3);
		number4 = new MyInteger(4);
		num = 5;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsEven() {
		int iIntegerTestValue = 2;
		MyInteger instance = new MyInteger(iIntegerTestValue);
		boolean ExpectedResult = true;
		boolean ActualResult = instance.isEven();
		assertEquals("testIsEven() failed", ExpectedResult, ActualResult);
	}
	@Test
	public void testIsEvenFalse() {
		int iIntegerTestValue = 1;
		MyInteger instance = new MyInteger(iIntegerTestValue);
		boolean ExpectedResult = false;
		boolean ActualResult = instance.isEven();
		assertEquals("testIsEven() failed", ExpectedResult, ActualResult);
	}
	@Test
	public void testIsEvenint2() {
		assertTrue("testIsEven() failed", MyInteger.isEven(2));
	}
	@Test
	public void testIsEvenint3() {
		assertFalse("testIsEven() failed", MyInteger.isEven(3));
	}
	@Test
	public void testIsEven2() {
		assertTrue("testIsEven() failed", MyInteger.isEven(number2));
	}
	@Test
	public void testIsEven3() {
		assertFalse("testIsEven() failed", MyInteger.isEven(number3));
	}
	
	@Test
	public void testIsOdd() {
		int iIntegerTestValue = 1;
		MyInteger instance = new MyInteger(iIntegerTestValue);
		boolean ExpectedResult = true;
		boolean ActualResult = instance.isOdd();
		assertEquals("testIsOdd() failed", ExpectedResult, ActualResult);
	}
	@Test
	public void testIsOddFalse() {
		int iIntegerTestValue = 2;
		MyInteger instance = new MyInteger(iIntegerTestValue);
		boolean ExpectedResult = false;
		boolean ActualResult = instance.isOdd();
		assertEquals("testIsOdd() failed", ExpectedResult, ActualResult);
	}
	@Test
	public void testIsOddint3() {
		assertTrue("testIsOdd() failed", MyInteger.isOdd(3));
	}
	@Test
	public void testIsOddint2() {
		assertFalse("testIsOdd() failed", MyInteger.isOdd(2));
	}
	@Test
	public void testIsOdd3() {
		assertTrue("testIsOdd() failed", MyInteger.isOdd(number3));
	}
	@Test
	public void testIsOdd2() {
		assertFalse("testIsOdd() failed", MyInteger.isOdd(number2));
	}
	
	@Test
	public void testIsPrime() {
		int iIntegerTestValue = 3;
		MyInteger instance = new MyInteger(iIntegerTestValue);
		boolean ExpectedResult = true;
		boolean ActualResult = instance.isPrime();
		assertEquals("testIsPrime() failed", ExpectedResult, ActualResult);
	}
	@Test
	public void testIsPrimeFalse() {
		int iIntegerTestValue = 6;
		MyInteger instance = new MyInteger(iIntegerTestValue);
		boolean ExpectedResult = false;
		boolean ActualResult = instance.isPrime();
		assertEquals("testIsPrime() failed", ExpectedResult, ActualResult);
	}
	@Test
	public void testIsPrimeint2() {
		assertTrue("testIsPrime() failed", MyInteger.isPrime(2));
	}
	@Test
	public void testIsPrimeint4() {
		assertFalse("testIsPrime() failed", MyInteger.isPrime(4));
	}
	@Test
	public void testIsPrime3() {
		assertTrue("testIsPrime() failed", MyInteger.isPrime(number3));
	}
	@Test
	public void testIsPrime4() {
		assertTrue("testIsPrime() failed", MyInteger.isPrime(number4));
	}

	@Test
	public void testequals(){
		boolean ExpectedResult = true;
		boolean ActualResult = number3.equals(3);
		assertEquals("testIsEqual() failed", ExpectedResult, ActualResult);
	}
	@Test
	public void testequalsFalse(){
		boolean ExpectedResult = false;
		boolean ActualResult = number3.equals(8);
		assertEquals("testIsEqual() failed", ExpectedResult, ActualResult);	
	}
	@Test
	public void testequals3(){
		boolean ExpectedResult = true;
		boolean ActualResult = number3.equals(number3);
		assertEquals("testIsEqual() failed", ExpectedResult,ActualResult);
	}
	@Test
	public void testequalsFalse2(){
		assertFalse(number2.equals(num));
	}
}
