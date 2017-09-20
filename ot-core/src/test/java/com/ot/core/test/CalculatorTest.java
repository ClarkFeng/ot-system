package com.ot.core.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	private static Calculator calculator = new Calculator();
/**
 * setUp方法原来是每个方法测试之前都会调用一次，而setUpBeforeClass则在整个测试过程中只调用一次。
 * 同理，tearDown和tearDownAfterClass的方法也是在于此。
 * setUpBeforeClass和tearDownAfterClass这两个方法是在junit4中新增的，junit3中没有
 * @throws Exception
 */
	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@Test
	public void testAdd() {
		calculator.add(2);
		calculator.add(3);
		assertEquals(5, calculator.getResult());
	}

	@Test
	public void testSubstract() {
		calculator.add(10);
		calculator.substract(2);

		assertEquals(8, calculator.getResult());
	}

	@Ignore("Multiply() Not yet implemented")
	@Test
	public void testMultiply() {
	}

	@Test
	public void testDivide() {
		calculator.add(8);
		calculator.divide(2);
		calculator.divide(0);
		assertEquals(4, calculator.getResult());
	}
	
	
}
