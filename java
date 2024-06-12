package calc.Grade.Student;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("      Student Grade Calculator.   ");
		System.out.println("--------------------------------------");
		System.out.println();
		
		System.out.print("Enter num of subject : ");
		int numOfSubject = sc.nextInt();
		System.out.println();
		System.out.print("Enter marks obtained out of 100 marks...");
		System.out.println();
		
		int[] marks = new int[numOfSubject];
		int totalMarks = 0;
		for(int i=0; i<numOfSubject; i++) {
			System.out.println();
			System.out.print("Enter marks for subject " + (i+1) + " : ");
			marks[i] = sc.nextInt(); 
			totalMarks += marks[i];     // Total marks
		}
		System.out.println("-------------------------------------------------");
		System.out.println();
		   // Average percentage
		double averagePercentage = totalMarks / (double)numOfSubject;
		  // Grade calculation
		   char grade;
		   if(averagePercentage >=90.0 && averagePercentage <= 100.0) {
			   System.out.println();
			   System.out.println("Outstanding performance ! Keep going");
			   grade = 'A';
		   } else if(averagePercentage >= 80.0 && averagePercentage <= 90.9) {
			   System.out.println();
			   System.out.println("Great job ! Aim for top tier");
			   grade = 'B';
		   } else if(averagePercentage >= 70.0 && averagePercentage <= 80.9) {
			   System.out.println();
			   System.out.println("Solid effort ! Keep honing your skills");
			   grade = 'C';
		   } else if(averagePercentage >= 60.0 && averagePercentage <= 70.9) {
			   System.out.println();
			   System.out.println("Good ! Need more focus");
			   grade = 'D';
		   } else if(averagePercentage >= 50.0 && averagePercentage <= 60.9) {
			   System.out.println();
			   System.out.println("Fair ! Need more improvement");
			   grade = 'E';
		   } else {
			   System.out.println();
			   System.out.println("Fail ! Very poor performance! improve yourself");
			   grade = 'F';
		   }
		   
		   // Display results
		     System.out.println("-------------------------------------------------");
		     System.out.println();
		     System.out.println("Total marks : " + totalMarks);
		     System.out.println("Average Percentage : " + averagePercentage);
		     System.out.println("Grade achieved by student : " + grade);
		     System.out.println();
		     System.out.println("-------------------------------------------------");

		
		
	}

}
