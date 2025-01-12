package Intro; // package name or folder container

import java.util.Scanner; // import Scanner class from java.util package;

public class introduction { // class name should not be same as file name
    public static void main(String[] args){
        System.out.println("Hello, World!");
        System.out.println("Welcome to jaava programming programming.");
        System.out.println("Today Day 01 In java programming.!");
        
        int a = 10;// initialization;
      
        int b; //declearation;
        b = 50; // Assignment;
        
        System.out.println(a);
        System.out.println(b);

        boolean z = false;
        System.out.println(z);

        char c = 'P';
        System.out.println(c);

        String s = "PRITOM";
        System.out.println(s);


        String s1 = "PRITOM";
        String s2 = "PRANTO";

        System.out.println(s1 + " " + s2);
        // s1 = s2;
        System.out.println("S1 : " + s1);
        System.out.println("S2 : " + s2);
        String temp = s1;
        s1 = s2;
        s2 = temp;
        // Aftr Swap;
        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);


        //user Input;
        try(Scanner scanner = new Scanner(System.in)){ // input mathod;
          // Using try catch for avoid Resource Leak;
          /* Method:
              try( resource){
              !code;
              }
           */
        System.out.print("Enter Your Name : ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        System.out.println("What is your favorite food ?  : ");
        scanner.nextLine(); // to clear the  scanner buffer;
        String food = scanner.nextLine();

        System.out.println("Your Details : " + name + " " + age + " ");
        System.out.println("Your Favorite Food is  : " + food);

        scanner.close(); // For avoid Resource leak; 
        }
    }
}