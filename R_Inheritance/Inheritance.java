package R_Inheritance;

class  shape{//Base class
  String color;
public  void draw(){
    System.out.println("Drawing shape");
  }
}
//extends keyword is used to inherit the properties of a class
//child/Derive class---Base Class
class  Triangle extends shape{ // triangle shpe extend from shape
  public void draw(){
    System.out.println("Drawing Trangle : " + color);
  }
}
//multi level inheritance
class  EquilateralTriangle extends Triangle{
  public void draw(){
    System.out.println("Drawing Equilateral Triangle : " + color);
  }
}
//hyarachical inheritance
class  Circle extends shape{
  public void draw(){
    System.out.println("Drawing Circle : " + color);
  }
}

public class Inheritance {
  public static void main(String[] args) {
    Triangle t1 = new Triangle();
    t1.color = "Red";
    t1.draw();
  }
}
