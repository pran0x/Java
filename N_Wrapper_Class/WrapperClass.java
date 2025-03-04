package N_Wrapper_Class;
// Wrapper class is a class whose object wraps or contains primitive data types
// Wrapper class in java provides the mechanism to convert primitive into object and object into primitive
//Wrappper ---> Primitive
//Boolean -> boolean
//Byte -> byte
//Short -> short 
//Integer -> int
//Long -> long
//Float -> float
//Double -> double
//Character -> char

//Autoboxing: The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing
//Unboxing: The automatic conversion of wrapper class object into primitive data type is known as unboxing
public class WrapperClass {
  public static void main(String[] args) {
    // Autoboxing
    int a = 20;
    Integer y = Integer.valueOf(a); // Converting int into Integer
    System.out.println("y........: " + y);

    Integer z = a;//Autoboxing, now compiler will write Integer.valueOf(a) internally
    System.out.println("z........: " + z);

    // Unboxing
    //obj
    Double d = new Double(50.40);
    System.out.println("d........: " + d);
    //converting Double object to double
    Double e = d.doubleValue();
    System.out.println("e........: " + e);
    //converting Double object to double
    Double f = d; // Unboxing, now compiler will write d.doubleValue() internally
    System.out.println("f........: " + f);

    //Premetive to Wrapper-AutoBoxing
    Boolean b = true;
    Character c = 'a';
    Integer i = 10;
    Double dd = 10.5;
    System.out.println("b........: " + b);
    System.out.println("c........: " + c);
    System.out.println("i........: " + i);
    System.out.println("dd........: " + dd);


    //Wrapper to Premetive-UnBoxing
    boolean bb = b;
    char cc = c;
    int ii = i;
    double ddd = dd;
    System.out.println("bb........: " + bb);
    System.out.println("cc........: " + cc);  
    System.out.println("ii........: " + ii);
    System.out.println("ddd........: " + ddd);

  }
}
