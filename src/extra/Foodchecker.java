package extra;

import javax.swing.JOptionPane;

public class Foodchecker {
public static void main(String[] args) {
	
	//1.Ask the user what their favorite food is
	String answer = JOptionPane.showInputDialog("What is your favorite food?");
	
	
	//2.if they have the same favorite food as you, give them a message
	if(answer.equals("Mole")){
		JOptionPane.showMessageDialog(null, "Me too! that is my favorite food! it is delicious");
	}else {
		JOptionPane.showMessageDialog(null, "hmm...i think Mole is way better than that");
	}
//3.if they type any other food, give them a different message




}
}
