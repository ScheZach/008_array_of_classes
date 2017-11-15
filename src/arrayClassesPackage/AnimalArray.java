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
			msg = "What is your animal species?";
			vetInfo[appointmentNum].setSpecies(JOptionPane.showInputDialog(msg));
			msg = "What is your animal's breed?";
			vetInfo[appointmentNum].setBreed(JOptionPane.showInputDialog(msg));
			msg = "What is your animal's gender?";
			vetInfo[appointmentNum].setGender(JOptionPane.showInputDialog(msg));
			msg = "What is your animal's age?";
			vetInfo[appointmentNum].setAge(Integer.parseInt(JOptionPane.showInputDialog(msg)));
			msg = "What is your animal's symptoms?";
			vetInfo[appointmentNum].setSymptoms(JOptionPane.showInputDialog(msg));
			
			msg = "Are you done? (Y/n)";
			ConfirmStart = JOptionPane.showInputDialog(msg);
			if (ConfirmStart.equalsIgnoreCase("n") || ConfirmStart.equalsIgnoreCase("no")) {
				StopLoop = false;
				appointmentNum++;
			}//end of if
			else if (ConfirmStart.equalsIgnoreCase("y") || ConfirmStart.equalsIgnoreCase("yes")) {
				StopLoop = true;
				appointmentNum++;
				for (int i = appointmentNum; i < vetInfo.length; i++) {
					vetInfo[i] = new Animal();
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "I'm sorry but I don't understand that.");
			}
		}//end of while
	}
	
	public void ShowAnimalInfo() {
		for (int i = 0; i < vetInfo.length; i++) {
			JOptionPane.showMessageDialog(null, "Customer" + i+1 + " animal's species is " + vetInfo[i].getSpecies());
			JOptionPane.showMessageDialog(null, "It breed is " + vetInfo[i].getBreed());
			JOptionPane.showMessageDialog(null, "Its gender is " + vetInfo[i].getGender());
			JOptionPane.showMessageDialog(null, "Its age is " + vetInfo[i].getAge());
			JOptionPane.showMessageDialog(null, "Its symptoms are " + vetInfo[i].getSymptoms());
		}
	}
	
}
