
//Task 2
// STUDENTS GARADE CALCULATOR

package codesoft.com.task2;
import java.util.Scanner;



public class StudentMarksCalculator {

    public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
           System.out.println("Enter the number of subjects: ");
		   int numberOfSubjects = scanner.nextInt();
           int[] marks = new int[numberOfSubjects];

			        
			        for (int i = 0; i < numberOfSubjects; i++) {
			            System.out.println("Ente the mark subject " + (i + 1) + ": ");
			            marks[i] = scanner.nextInt();
			        }

			        // total marks
			        int totalMarks = 0;
			        for (int mark : marks) {
			            totalMarks += mark;
			        }

			       // Average
			        float averagePercentage = (float) totalMarks / numberOfSubjects;
                    String grade;
			        if (averagePercentage >= 90) {
			            grade = "A";
			        } else if (averagePercentage >= 80) {
			            grade = "B";
			        } else if (averagePercentage >= 70) {
			            grade = "C";
			        } else if (averagePercentage >= 60) {
			            grade = "D";
			        } else {
			            grade = "F";
			        }

			        // Display  results
			        System.out.println("Total marks: " + totalMarks+"/"+(numberOfSubjects*100));
			        System.out.println("Average percentage: " + averagePercentage);
			        System.out.println("Grade: " + grade);
			        scanner.close();
			    }
			}

		

