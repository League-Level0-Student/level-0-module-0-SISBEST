import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String LastSummer = JOptionPane.showInputDialog(null, "Welcome to the prank interface! Please enter something the victim did last summer to pull the prank, then click OK.");
	String Victim = JOptionPane.showInputDialog(null, "Enter the victim's name to pull the prank!");
	JOptionPane.showMessageDialog(null, "I know you did " + LastSummer + " last summer, " + Victim + "!");
}
}
