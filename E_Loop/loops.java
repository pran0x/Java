package E_Loop;

public class loops {
  public static void main(String[] args) {
    System.out.println("For loop");
    for (int i = 0; i < 10; i++) {
      System.out.print(" "+i+" ");  
    }
    System.out.println("\nWhile loop");
    int x = 0;
    while (x < 10) {
      System.out.print(" "+x+" ");
      x++;
    }
    System.out.println("\nforeach loop");
    for(int i : new int[]{9,8,7,6,5,4,3,2,1,0}) {
      System.out.print(" "+i+" ");
    }
    System.out.println("\nDo-while loop");
    int y = 0;
    do { 
        System.out.print(" "+y+" ");
        y++;
    } while (y < 10);
  }
}
