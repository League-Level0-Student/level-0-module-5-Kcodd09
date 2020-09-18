package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class algorithms_prime_or_not {
	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Enter a number");
		int num1 = Integer.parseInt(num);
		boolean prime = false;
		for (int i = 2; i < num1; i++) {
			if(num1%i==0) {
				prime = true;
				break;
			}
			
		}
		if(prime==false) {
			JOptionPane.showMessageDialog(null, "The number is prime");
		}
		else {
			JOptionPane.showMessageDialog(null, "The number is not prime");
		}
		
		
	}
}
