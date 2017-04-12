package arrays;

import java.util.Scanner;

public class AddingValuesToArrays {
	static String[] _studentName = new String[5]; //Global variables can be accessed anywhere in the class
	static int[] _studentRollNo = new int[5]; 
	
	static void addToArray(String stdName, int rollNumber){
		_studentName[rollNumber]= stdName;
		_studentRollNo[rollNumber]= rollNumber;
		
	}
	
	static void printStdDetails()
	{
		for(int i =0; i< 5; i++)
		{
			System.out.println("student Name: "+_studentName[i]);
			System.out.println("Roll number: "+_studentRollNo[i]);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // to read values from the console. import from java.util.Scanner;
		for(int i =0; i<5; i++){		//to read values 5 times
		System.out.println("Please enter student Name: ");  //to ask for name 
		String stdName =scanner.nextLine(); //reading value and store in a variable
		addToArray(stdName, i); //calling method to add
		}
		 
		printStdDetails();
		System.out.println("*********End******");
		
		
	}
	
	

}
