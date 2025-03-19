package U_Incapsulation;
// Incapsulation is a way to hide the data from the user
// It is a way to protect the data from the user
class  pen{
  String NamePen;
  int PricePen;
  private int ActualPricePen;
}
public class incap {
  public static void main(String[] args) {
    pen p1 = new pen();
    p1.NamePen = "Gel Pen";
    p1.PricePen = 20; 
  }
}
