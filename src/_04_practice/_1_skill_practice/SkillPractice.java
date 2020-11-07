package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {
		SkillPractice skills = new SkillPractice();
			skills.skill1();
			skills.skill2();
			skills.skill3();
			skills.skill4();
	
	}
	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");



		// Tell them how many cents they have (hint multiply by 10)
		int dimesi = Integer.parseInt(dimes);
		JOptionPane.showMessageDialog(null, "You have "+ dimesi*10+" cents." );



		// Ask the user how tall they are (inches)
		String height = JOptionPane.showInputDialog("How tall are you in inches?");



		// If they are shorter than 36 inches, tell them to eat their Wheaties
		int heightI = Integer.parseInt(height);
		if (heightI<36) {
			JOptionPane.showMessageDialog(null, "Eat your Wheaties!");
		}
	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
		for (int i = 1; i < 31; i++) {
			if (i%3==0) {
				System.out.println(i);
			}
			
			
			
		}







	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
		Random r = new Random();
		int num1 = r.nextInt(20);
		System.out.println(num1);
		


	// Get another random number that is less than 10 and print it to the console
		int num2 = r.nextInt(10);
		System.out.println(num2);


		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
		int difference = num1-num2;
		JOptionPane.showMessageDialog(null, "The difference between the two random numbers is "+ difference);


		}

	void skill4() { // In a pop-up, ask the user for the city they live in
		String city = JOptionPane.showInputDialog("Which city do you live in?");


		// If they answered "San Diego", tell them they live in America's Finest City
			if(city.equalsIgnoreCase("San Diego")) {
				JOptionPane.showMessageDialog(null, "You live in America's Finest City!");
			}
		

		// Otherwise, tell them to move to San Diego 
			else {
				JOptionPane.showMessageDialog(null, "You should move to San Diego");
			}
			
		
		
		
		
		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
			int cars = 3;
				if (cars==0) {
					JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
				}

			// If there is 1 car, use a pop-up to display the make/model of the car
				else {
					JOptionPane.showMessageDialog(null, "The car is a BMW X5 series.");
				}

	
	
	
	
	
	
}
}
