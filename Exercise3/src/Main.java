/*4.(Find the highest score) Write a program that prompts the user to enter the number
of students and each student’s name and score, and finally displays the name
of the student with the highest score.
*/
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
				
				Scanner input = new Scanner(System.in);

				int highestScore = 0; 			
				String highestScoreName = ""; 

				System.out.print("Enter the number of students: ");
				int numberOfStudents = input.nextInt();

				System.out.println("Enter each student’s name and score");
				for (int i = 0; i < numberOfStudents; i++) {
					System.out.print("Student: " + (i + 1) + "\n   Name: ");
					String name = input.next();
					System.out.print("   Score: ");
					int score = input.nextInt();

					if (score > highestScore)
					{
						highestScore = score;
						highestScoreName = name;
					}

				}

				System.out.println("Student with the highest score: " + highestScoreName);
			}
		

	}


