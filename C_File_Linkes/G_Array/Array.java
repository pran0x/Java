package C_File_Linkes.G_Array;

import java.util.Scanner;

public class Array {
  public static void main(String[] args) {
    String[] name = {"Pran", "Revolver", "Pran0x", "Pritom"};
    System.out.println("Name : "+name[1]);


    for (String i : name){ // for each loop
      System.out.println("Name.....: "+i);
    }

    System.out.println("Enter the Array :");
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 5; i++){
      arr[i] = sc.nextInt();
    }
    sc.close();// close the scanner

    int x= 1; // for index
    for(int i: arr){ // for each loop
      System.out.println(x+" : "+ i);
      x++;
    }
  }
}
