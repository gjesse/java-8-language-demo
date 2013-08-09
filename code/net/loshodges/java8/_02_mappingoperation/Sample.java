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
    /*
    System.out.println(totalOfValuesDoubled);

    System.out.println(numbers.stream()
            .mapToInt(number -> number * 2)
            .sum());*/
    // Stream operations are divided into two categories: intermediate and terminal.
    // After a terminal operation is performed, the stream can no longer be used.

  }
}
