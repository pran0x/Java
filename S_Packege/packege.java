package S_Packege;
// Two Types of Packege
// 1. User Defind Packege
// 2. Predefind Packege
import java.util.Scanner; // Predefind Packege
import S_Packege.pranx; // User Defind Packege
public class packege {
  public static void main(String[] args) {
    System.out.println("Predefined Packege......: Java.until.Scanner");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int a = sc.nextInt();
    System.out.println("Number is : "+ a);
    sc.close();
    // User Defined Packege callling as a object
    System.out.println("User Defined Packege......: S_Packege.pran0x");
    S_Packege.pranx pran = new S_Packege.pranx();
    pran.pran();
  }
}
