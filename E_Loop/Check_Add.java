/**
 * This Java class iterates through numbers from 0 to 9, incrementing a variable based on certain
 * conditions, and then prints the final value of the variable.
 */
package E_Loop;

public class Check_Add {
  public static void main(String[] args) {
    int x = 0;
    for(int i = 0; i < 10; i++){
      if(i%3 == 0){ x += 50; System.out.println("i : "+i +" x : "+x);}
      else if(i%5 == 0){ x += 20; System.out.println("i : "+i +" x : "+x); }
      if(i%4 == 0){ x +=10; System.out.println("i : "+i +" x : "+x);}
    }
    System.out.println("X value is : "+x);
  }
}
