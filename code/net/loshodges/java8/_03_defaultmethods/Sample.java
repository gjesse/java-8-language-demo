package net.loshodges.java8._03_defaultmethods;

public class Sample {
  public static void main(String[] args) {
    SeaPlane seaPlane = new SeaPlane();
    seaPlane.takeOff();
    seaPlane.turn();
    seaPlane.cruise();
    seaPlane.land();
  }
}
