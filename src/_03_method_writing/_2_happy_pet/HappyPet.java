package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel=0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("Would you like to buy a cat or a dog?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 11; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "How do you want to make your pet happy?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Feed", "Take a walk", "Groom"}, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if(task==0) {
				cuddle(pet);
			}
			else if(task==1) {
				feed(pet);
			}
			else if(task==2) {
				takeAWalk(pet);
			}
			else {
				groom(pet);
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel>= 20) {
				JOptionPane.showMessageDialog(null, "You obviously love your pet and it is very happy!");
				break;
			}

	}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void cuddle(String pet) {
		if(pet.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "The cat is purring and is very happy.");
			happinessLevel = happinessLevel+5;
		}
		else {
			JOptionPane.showMessageDialog(null, "The dog is wagging its tail and is very happy.");
			happinessLevel = happinessLevel+5;
		}
	}
	public static void feed(String pet) {
		if(pet.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "You fed your cat fish and water and now they are very happy");
			happinessLevel = happinessLevel+10;
		}
		else {
			JOptionPane.showMessageDialog(null, "You fed your dog meat and water and now they are very happy");
			happinessLevel = happinessLevel+10;
		}
	}
	public static void takeAWalk(String pet) {
		if(pet.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "Your cat enjoyed the fresh air and watching birds");
			happinessLevel = happinessLevel+5;
		}
		else {
			JOptionPane.showMessageDialog(null, "Your dog loved the fresh air and chacing squirrels");
			happinessLevel = happinessLevel+5;
		}
	}
	public static void groom(String pet) {
		if(pet.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "Your cat loved getting its fur brushed");
			happinessLevel = happinessLevel+2;
		}
		else {
			JOptionPane.showMessageDialog(null, "Your dog now looks adorable and is barking with joy");
			happinessLevel = happinessLevel+2;
		}
	}
	
	
}
