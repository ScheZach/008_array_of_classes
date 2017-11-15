package arrayClassesPackage;

public class runner {

	public static void main(String[] args) {
		
		//learn how to use arrays of a class
		StudentArray myStudentArray = new StudentArray();
		myStudentArray.buildArray();
		myStudentArray.showArray();
		
		AnimalArray myAnimalArray = new AnimalArray();
		myAnimalArray.CreateAnimalInfo();
		myAnimalArray.ShowAnimalInfo();
		
		
		/*
		 * Graded assignment
		 * 
		 * 1. (learn arrays - for large data ALWAYS use a database, JDBC Java Data Base Connectivity to, for example MYSQL)
		 * 2. You work in a vet's office, you want a check-in tag for the vet, and this is a procedure and billing record.
		 * 3. Record:
		 * -species
		 * -breed
		 * -gender (include unknown)
		 * -age
		 * -symptoms
		 * 
		 *for practice, let's set our array size to ten
		 */

	}

}
