package eu.abdoulsy.testaccu;

public class Accumulator {
	//TODO: should be immutable
	private int sum;
	
	//Can also be a private constructor if we want only one accumulator
	public Accumulator() {
		this.sum = 0;
	}
	//Constructor With values
	public Accumulator(int...values) {
		this.sum = 0;
		this.accumulate(values);
	}
	//accumulates values inside the internal sum
	public int accumulate(int... values) {
	    for (int i: values) {
	    	this.sum += i;
	    }
		return sum;
		
	}
	//Gets the internal value
	public int getTotal() {
		return sum;
	}
	//resets the internal value
	public void reset() {
		this.sum = 0;
	}
}
