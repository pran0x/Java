package O_Oops;
class pen { //In java class name is by default public
  String color;
  String type;
  int price; 
  // funcion that in a class called method 
  public  void  write (){ // Mehtod
    System.out.println("Writting Something...");
  }
  public void Details(){
    System.out.println("Pen Details...:"+this.type);
    System.out.println("Color..: " + this.color); // this means current object
    System.out.println("Type...: " + this.type);
    System.out.println("Price..: " + this.price);
  }
}
public class Classes_Object {
  public static void main(String[] args) {
    pen p1 = new pen(); // Object of pen class
    p1.color = "RED"; // object.properties
    p1.type = "GEL";
    p1.price = 20;

    pen p2 = new pen(); // Object of pen class
    p2.color = "BLUE";
    p2.type = "INK";
    p2.price = 10;


    p2.Details(); //calling pen2 method
    p1.Details();//calling pen1 method
  }
}
