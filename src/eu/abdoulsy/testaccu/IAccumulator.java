package eu.abdoulsy.testaccu;

public interface IAccumulator {
  //accumulates the values into the internal accumulator running value
  int accumulate(int... values);
  
  //gets the internal running value
  int getTotal();
  
  //resets the running value to 0
  void reset();
  
}
