package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		MyInteger test1=new MyInteger(5);
		MyInteger test2=new MyInteger(6);
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
	public void test() {
		assertTrue(1==1);
		assertTrue(MyInteger.isPrime(5));
		assertTrue(MyInteger.isPrime(4));
		assertTrue(MyInteger.isPrime(2));
		assertTrue(MyInteger.isPrime(1));
		assertTrue(MyInteger.isPrime(10));
		assertTrue(MyInteger.isEven(new MyInteger(10)));
		assertTrue(MyInteger.isEven(new MyInteger(9)));
		assertTrue(MyInteger.isOdd(new MyInteger(10)));
		assertTrue(MyInteger.isOdd(new MyInteger(9)));
	}

}
