package arrayClassesPackage;

public class StudentArray {

	student[] myStudents = new student[3];
	
	public void buildArray() {
		myStudents[0] = new student();
		myStudents[0].setFname("Tyler");
		myStudents[0].setLname("Smith");
		myStudents[0].setYearInSchool(11);
		
		myStudents[1] = new student();
		myStudents[1].setFname("James");
		myStudents[1].setLname("Tamber");
		myStudents[1].setYearInSchool(10);
		
		myStudents[2] = new student();
		myStudents[2].setFname("Jaiden");
		myStudents[2].setLname("Thomson");
		myStudents[2].setYearInSchool(12);
		
		//System.out.println("First Name: " + myStudents[0].getFname());
		//System.out.println("Last Name: " + myStudents[0].getLname());
	}

	public void showArray() {
		for (int i = 0; i < myStudents.length; i++) {
			System.out.println(myStudents[i].getFname());
			System.out.println(myStudents[i].getLname());
			System.out.println(myStudents[i].getYearInSchool());
		}
	}

}
