package eu.abdoulsy.testaccu;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;


import org.junit.Test;

import junit.framework.Assert;

public class accumulatorTest {

	//testing the instanciation
	@Test
	public void testAccumulatorWithNoValue() {
		Accumulator accumulator = new Accumulator();
		assertThat(accumulator, instanceOf(Accumulator.class));
	}
	
	@Test
	public void testAccumulatorTotalWithValues() {
		Accumulator accumulator = new Accumulator();
		int total = accumulator.getTotal();
		assertEquals(total, 0);
	}
	
	//testing the sum value
	@Test
	public void testAccumulatorAccumumulatesReturnsSumOfTwoValues() {
		Accumulator accumulator = new Accumulator();
		assertEquals(accumulator.accumulate(3, 3), 6);
	}
	
	//testing the sum value
	@Test
	public void testConstructingAnAccumulatorWithValuesAccumulates() {
		Accumulator accumulator = new Accumulator(3,3);
		int total = accumulator.getTotal();
		assertEquals(total, 6);
	}
	
	//testing the sum value
	@Test
	public void testAccumulatorAccumumulatesAndGetTotalReturnsSum() {
		Accumulator accumulator = new Accumulator();
		accumulator.accumulate(3, 3);
		int total = accumulator.getTotal();
		assertEquals(total, 6);
	}
		
	@Test
	public void testAccumulatorAccumulatesAndResetsTheSumValueToZero() {
		Accumulator accumulator = new Accumulator();
		accumulator.accumulate(3, 3);
		int total = accumulator.getTotal();
		//accumulates to 6
		assertEquals(total, 6);
		accumulator.reset();
		//resetting the internal value
		int totalAfterReset = accumulator.getTotal();
		assertEquals(totalAfterReset, 0);
	}
	

}
