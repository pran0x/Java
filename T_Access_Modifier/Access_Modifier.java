package T_Access_Modifier;
//Access Modifier
//1. private  - only within the class
//2. default  - only within the package
//3. protected - within the package and outside the package through child class
//4. public - within the package and outside the package
class  Account{
  public  String name;// public variable
  protected  String email; // protected variable , can be accessed within the package and outside the package through child class
  String address; // default variable, can be accessed only within the package
  private  String password; // private variable, can be accessed only within the class
  public   String GETPass(){
    return this.password;//getter method
  }
  public void SETPass(String pass){
    this.password = pass;//setter method
  }
}
public class Access_Modifier {
  public static void main(String[] args) {
    Account a = new Account();
    a.name = "PRANTO";
    a.email = "xyz@gmail.com";
    a.address = "Dhaka";
    System.out.println(a.name);
    System.out.println(a.email);
    System.out.println(a.address);
    a.SETPass("1234");
    System.out.println(a.GETPass());
  }
}
