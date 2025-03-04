package P_Polymorphism;
class student {
  //! Same method name but different parameters- Polymorphism
  //Function verloading
  public void display(){
    System.out.println("Student class");
  }
  public void display(int a){
    System.out.println("Student class with int");
  }
  public void display(String a){
    System.out.println("Student class with String");
  }
  
}
public class poly {
  
  public static void main(String[] args) {
    student s = new student();
    s.display();
    s.display(10);
    s.display("Hello");
  }  
}
