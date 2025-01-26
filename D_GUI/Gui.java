package D_GUI;
import javax.swing.JOptionPane;
public class Gui {
  public static void main(String[] args) {
    String nameTitleBox = JOptionPane.showInputDialog("Enter your name: ");
    JOptionPane.showMessageDialog(null,"Good evening, " + nameTitleBox + "\npress OK to continue.");

    int age = Integer.parseInt(JOptionPane.showInputDialog(nameTitleBox + " what is your age? "));
    JOptionPane.showMessageDialog(null,"Congratulations!\nYou have successfully created an account\nUser account: " + nameTitleBox + "\nAge: "+age);
  }
}
