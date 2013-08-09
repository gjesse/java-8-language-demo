package net.loshodges.java8._02_mappingoperation;

import java.util.*;
import java.util.function.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    int totalOfValuesDoubled = 0;
    for(int number : numbers) {
      totalOfValuesDoubled += number * 2;
    }
    
    System.out.println(totalOfValuesDoubled);

    final int sum = numbers.stream()
            .map(number -> number * 2)
            .sum();

      System.out.println(sum);
  }
}
