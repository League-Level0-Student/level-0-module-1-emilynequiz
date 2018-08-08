package extra;

import javax.swing.JOptionPane;

public class SecretMessage {
public static void main(String[] args) {
	String Pan = "Pancake";
	String answer = JOptionPane.showInputDialog("Tell me a secret message");
	String input = JOptionPane.showInputDialog("You can only see te secret message if you guess the password!");
	if(input.equals(Pan)){
		JOptionPane.showMessageDialog(null,answer);
	
	
	
	}

		
	
}
}
