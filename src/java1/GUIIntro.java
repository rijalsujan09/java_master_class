package java1;

import javax.swing.JOptionPane;

public class GUIIntro {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("What is Your Name");
		
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age  = Integer.parseInt(JOptionPane.showInputDialog("What is your age ? "));
		
		JOptionPane.showMessageDialog(null, "Your age is "+age+" years old.");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("What is your Height ? "));
		
		JOptionPane.showMessageDialog(null, "Your height is "+ height + " foot");
		
		JOptionPane.showMessageDialog(null, "Thank You Bye");

	}

}
