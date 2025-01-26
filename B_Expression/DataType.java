package B_Expression;

public class DataType {
  public static void main(String[] args) {
    int x = 10;
    int result = x / 3;
    System.out.println("Result before decimale value: " + result);
    double result1 = (double) x / 3;
    System.out.println("Result after Decimale value : " + result1);

    // #------------------------------//#endregion
    int a = 10;
    System.out.println("Value of a: " + a);
    a--;
    System.out.println("Value of a after post-decrement : " + a);
    --a;
    System.out.println("Value of a after pre-decrement : " + a);
    a++;
    System.out.println("Value of a after post-increment : " + a);
    ++a;
    System.out.println("Value of a after pre-increment : " + a);

    // #------------------------------//#endregion
    boolean XD = true;
    boolean DX = false;
    System.out.println("\nXD  = true and DX = false");
    System.out.println("And operation: " + (XD & DX));
    System.out.println("Or operation: " + (XD | DX));
    System.out.println("XOR operation: " + (XD ^ DX));
    System.out.println("Not operation: " + (!XD));
    System.out.println("Not operation: " + (!DX)); 

    int b = 10;
    System.out.println("Left shift operation (b = 10): " + (b << 2));
    System.out.println("Right shift operation (b = 10): " + (b >> 2));

    // #------------------------------//#endregion
  }
}
