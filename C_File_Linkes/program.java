package C_File_Linkes;

public class program {
  public static void main(String[] args) {
    input inp = new input(); // Object of "Input" Class;
    function func = new function(); // Object of "Function" class;
    int Xx, Yy;
    Xx = inp.inputNumX();
    Yy = inp.inputNumY();
    func.add(Xx, Yy); //default Parameter
    func.sub(Xx, Yy);
    func.mul(Xx, Yy);
    func.div(Xx, Yy);
  }
}
