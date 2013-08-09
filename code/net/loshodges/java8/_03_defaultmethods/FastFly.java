package net.loshodges.java8._03_defaultmethods;

public interface FastFly extends Fly {
  default void takeOff() { System.out.println("net.loshodges.java8.defaultmethods.FastFly::takeOff"); }
}