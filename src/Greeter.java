import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class Greeter {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog(null,"What is your name?");
	JOptionPane.showMessageDialog(null, "Hi " + name + "!");
}
}
