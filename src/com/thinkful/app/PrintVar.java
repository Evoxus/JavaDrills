package com.thinkful.app;

public class PrintVar {
  public static void main(String[] args) {
    String nyHighTempJune = "79 deg. F";
    String courseName = "Java/Spring programming";
    String busServiceNumber = "555-5555";
    Double shoePrice = 39.98;
    String jupiterMass = "1.89813 x 10^27 kilograms";
    System.out.printf("New York high in June: %s \n", nyHighTempJune);
    System.out.printf("This course's name is: %s \n", courseName);
    System.out.printf("The bus service can be reached at: %s \n", busServiceNumber);
    System.out.printf("The shoes cost: $%f \n", shoePrice);
    System.out.printf("Jupiter has a mass of: %s \n", jupiterMass);
  }
}