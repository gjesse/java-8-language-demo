package net.loshodges.java8._05_composingwithlambda;

import java.util.*;

public class Sample {
  public static boolean isGreaterThan2(int number) {
    return number > 2;
  }
  
  public static boolean isEven(int number) {
    return number % 2 == 0;
  }
  
  public static int doubleIt(int number) {
    return number * 2;
  }
  
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    
    //double the first even number greater than 3 from the list
    
    System.out.println(
      numbers.stream()
      .filter(Sample::isGreaterThan2)
      .filter(Sample::isEven)
      .mapToInt(Sample::doubleIt)
      .findFirst().getAsInt()
    );

      // demo Optionals providing defaults?
 /*    numbers = Arrays.asList(1, 2, 3, 5,9);
      System.out.println(
              numbers.stream()
                      .filter(Sample::isGreaterThan2)
                      .filter(Sample::isEven)
                      .mapToInt(Sample::doubleIt)
                      .findFirst().orElse(0)
      );
*/
  }
}

