package C_File_Linkes;

import java.util.Scanner;

public class input {
  Scanner sc = new Scanner(System.in);
  public int inputNumX(){
    int numX = 0;
    System.out.println("Enter the value of x: ");
    numX =sc.nextInt();
    return numX;
  }
  public int inputNumY(){
    int numY = 0;
    System.out.println("Enter the value of y: ");
    numY =sc.nextInt();
    sc.close();
    return numY;
  }
}
