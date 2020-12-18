package studentLibrary;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCurses = 600;
    private static int id = 1000;

    // Constructor : prompt user to enter student's name d year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first Name:");
        this.firstName = in.nextLine();

        System.out.println("Enter student Last Name:");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();
        setStudentID();


    }


    // Generate an ID
    private void setStudentID() {

        //Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses

    public void enrollID(){
        // Get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll(Q to quit):");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCurses;
            } else {
                break;
            }
        } while (1 != 0);

    }

    // View balance and pay tuition
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner scn = new Scanner(System.in);
        int payment = scn.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    // Status show

    public String toString(){
        return "Name:" + firstName + " " + lastName + "\nGrade Level:" + gradeYear + "\nStudent ID:" + studentID + "\nCourses Enrolled:" + courses + "\nBalance: $" + tuitionBalance;
    }
}
