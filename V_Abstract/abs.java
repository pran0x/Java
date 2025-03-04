package V_Abstract;
// Abstract class is a class that is declared with abstract keyword
// Abstract method is a method that is declared without an implementation 
// Abstract class can have abstract and non-abstract methods
// Abstract class cannot be instantiated
// Abstract class can have constructors
abstract class Animal{ // Abstract class
  Animal(){
    System.out.println("Animal is created......BASE CLASS");
  }
    abstract void walk(); // Abstract method without body
    public void Eats(){
      System.out.println("Eats food");
    }
  }
class Dog extends Animal{
  @Override // Annotation
  public void walk(){
      System.out.println("Walk in 4 legs");
    }
    Dog(){
      System.out.println("Dog is created..........DERIVED CLASS");
    }
  }
class Chicken extends Animal{
    @Override // Annotation
    public void walk(){
      System.out.println("Walk in 2 legs");
    }
    Chicken(){
      System.out.println("Chicken is created..........DERIVED CLASS");
    }
  }
public class abs{
  public static void main(String[] args){
    Dog d = new Dog();
    d.walk();
    Chicken c = new Chicken();
    c.walk();
    d.Eats();
    c.Eats();
    // Animal a = new Animal(); // Error
    // a.walk(); // Runtime Error!
  }
}
