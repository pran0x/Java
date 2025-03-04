package G_Array;

import java.util.Scanner;

public class Two_D_Array {
  public static void main(String[] args) {
    // 2D Array
    Scanner sc = new Scanner(System.in);


    int[][] arr = new int[2][2];
    for(int i = 0; i < 2; i++){
      for(int j = 0; j < 2; j++){
        arr[i][j] = sc.nextInt();
      }
    }
    sc.close();
    System.out.println("2D Array is: ");
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr.length; j++){
        System.out.print("= "+arr[i][j]+" =");
      }
      System.out.println();
    }
  }
}
