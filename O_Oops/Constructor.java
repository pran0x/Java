package O_Oops;

class Student{
  String  Name,ID, Varsity, Department, Batch, Address;
  double  CGPA;
  int Year;
  Student(){//Non-parametarized constructor
    System.out.println("#> Non-Parametarized construction loading.......");
  }
  Student(String Name, String ID){ // parametarized constructor
    //Init var = Para var
    System.out.println("#> Parametarized constructor loading.......");
    this.Name = Name; 
    this.ID = ID;
  }
  Student (Student Person){//Copy constructor
    System.out.println("#> Copy constructor loading.......");
    this.Name = Person.Name;
    this.ID = Person.ID;
  }

  public void info(){//whithout parameter
    System.out.println("Student Details:");
    System.out.println("Name........: "+this.Name);//pointing current object
    System.out.println("ID..........: "+this.ID);
    System.out.println("Varsity.....: "+this.Varsity);  
    System.out.println("Department..: "+this.Department);
    System.out.println("Batch.......: "+this.Batch);
    System.out.println("Address.....: "+this.Address);
    System.out.println("Year........: "+this.Year);
    System.out.println("CGPA........: "+this.CGPA);
    System.out.println("---------------------------");
  }
}
public class Constructor {
  public static void main(String[] args) {
    // Parametarized object
    Student S1 = new Student("Revolver", "2233081469"); // allocate a new memory where student class duplicated!
    S1.info();
    // Non-Parametarized object
    Student S2 = new  Student();
    S2.Name = "Pran0x90";
    S2.ID = "2233081405";
    S2.Name = "Pran0x";
    S2.ID = "2233081405";
    S2.Varsity = "Uttara University";
    S2.Department = "CSE";
    S2.Batch = "60th";
    S2.Address = "Mirpur, Dhaka";
    S2.Year = 2025;
    S2.CGPA = 3.23;
    S2.info();
    
    //class object pass as a parameter;
    Student S4 = new Student(S1);// Copy Paramaterized object
    S4.info();
  }
}
