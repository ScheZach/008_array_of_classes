package arrayClassesPackage;

import javax.swing.JOptionPane;

public class AnimalArray {
	
	Animal[] vetInfo = new Animal[10];
	int appointmentNum = 2;
	String msg = "";
	
	public void CreateAnimalInfo() {
		boolean StopLoop = false;
		String ConfirmStart = "Yes";
		
		vetInfo[0] = new Animal();
		vetInfo[0].setSpecies("Snake");
		vetInfo[0].setBreed("Anaconda");
		vetInfo[0].setGender("male");
		vetInfo[0].setAge(3);
		vetInfo[0].setSymptoms("Has a shedding issue");
		
		vetInfo[1] = new Animal();
		vetInfo[1].setSpecies("dog");
		vetInfo[1].setBreed("Beagle");
		vetInfo[1].setGender("female");
		vetInfo[1].setAge(5);
		vetInfo[1].setSymptoms("Cut on paw");
		
		while(StopLoop == false) {
			vetInfo[appointmentNum] = new Animal();
			
			
			msg = "Are you done? (Y/n)";
			ConfirmStart = JOptionPane.showInputDialog(msg);
			if (ConfirmStart.equalsIgnoreCase("n") || ConfirmStart.equalsIgnoreCase("no")) {
				StopLoop = false;
			}//end of if
			else if (ConfirmStart.equalsIgnoreCase("y") || ConfirmStart.equalsIgnoreCase("yes")) {
				StopLoop = true;
				JOptionPane.showMessageDialog(null, "Thank you for using my program");
			}
			else {
				JOptionPane.showMessageDialog(null, "I'm sorry but I don't understand that.");
			}
		}//end of while
	}
	
}
