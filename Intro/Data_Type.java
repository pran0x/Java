package Intro;

import java.util.Scanner;

public class Data_Type {
  public static void main(String[] args) {
    int x = 0, y = 0;  //int data type;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of x: ");
    x = sc.nextInt();
    System.out.println("Enter the value of y: ");
    y = sc.nextInt();
    sc.close();

    System.out.println("sum of Total Number {x + y} = " + (x+y));
  }
}
