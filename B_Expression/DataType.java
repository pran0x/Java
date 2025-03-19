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
    int N1 = 6 - 3 - 3;
    int N2 = 6 - ( 3 - 3 );
    double N3 = 3 +  5 / 2;
    double N4 = 5 / 2.0f;
    double N5 = 5.0f / ( 6 - 4 % 6 );
    double N6 = 2- 10 % 4;
    double N7 = 100 / 5 / 2 % 7;
    double N8 = ( 1 + 5 ) % 3 * 2 - 2 ;

    System.out.println("N1 = " + N1);
    System.out.println("N2 = " + N2);
    System.out.println("N3 = " + N3);
    System.out.println("N4 = " + N4);
    System.out.println("N5 = " + N5);
    System.out.println("N6 = " + N6);
    System.out.println("N7 = " + N7);
    System.out.println("N8 = " + N8);
    if(1%3 == 0){
      System.out.println("1%3 == 0");
    }
  }
}
