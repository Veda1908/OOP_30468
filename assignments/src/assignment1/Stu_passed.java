package assignment1;
import java.util.Scanner;

public class Stu_passed {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        String[] studentNames = new String[numStudents];
        int[][] marks = new int[numStudents][numSubjects];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            sc.nextLine();
            studentNames[i] = sc.nextLine();

            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter marks in subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nStudents who passed in all subjects:");
        for (int i = 0; i < numStudents; i++) {
            boolean passedAll = true;
            for (int j = 0; j < numSubjects; j++) {
            	if (marks[i][j] < 35) {
            	    passedAll = false;
            	    break;
            	}
            	}
            	if (passedAll)
            	    System.out.println(studentNames[i]);
            	}
            	sc.close();
            	}
            	}
