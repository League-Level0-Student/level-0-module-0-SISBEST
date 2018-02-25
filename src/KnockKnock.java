import javax.swing.JOptionPane;

public class KnockKnock {
public static void main(String[] args) {
	String knock = JOptionPane.showInputDialog(null, "Knock Knock!");
	if (knock.equals("Who's There?")); {
		String person = JOptionPane.showInputDialog("Samuel");
		if(person.equals("Samuel Who?")) {
			JOptionPane.showMessageDialog(null, "The Samuel that made this program!");
		}
		}
}

}
