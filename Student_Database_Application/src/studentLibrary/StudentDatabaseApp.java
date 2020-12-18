package studentLibrary;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args){


        //  Ask how many new users we want to add
        System.out.println("Enter Number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfSudents = in.nextInt();
        Student[] students = new Student[numOfSudents];

        // Create n number of new students
        for(int n=0; n<numOfSudents; n++){
            students[n] = new Student();
            students[n].enrollID();
            students[n].payTuition();

        }
        for(int n=0; n<numOfSudents; n++){
            System.out.println(students[n].toString());
        }
    }
}
