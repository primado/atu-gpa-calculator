package javaHandout;

import java.util.Scanner;

public class ATU_Report_Slip {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner in_01 = new Scanner(System.in);

        String student_name, student_ID, semester, program, program_level;
        int num_course;
        double gpa, total_credit_hours = 0;

        System.out.print("Hello Student, enter your name: ");
        student_name = in.nextLine();
        System.out.print("Enter your student ID: ");
        student_ID = in.next();
        System.out.print("Enter your program title: ");
        program = in_01.nextLine();
        System.out.print("Enter Department: Dept Of ");
        String department = in_01.nextLine();
        System.out.print("Enter program Level: ");
        program_level = in_01.nextLine();
        System.out.print("Enter semester: ");
        semester = in_01.nextLine();

        System.out.println();
        System.out.print("Enter the number of courses registered: ");
        num_course = in.nextInt();


        System.out.println();
        String[] course_name = new String[num_course];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the course code starting from the top just as it appears in registration slip.");
        for (int i = 0; i < num_course; i++) {
            System.out.print("Course No.  " + (i + 1) + ": ");
            course_name[i] = sc.nextLine();
        }
        System.out.println();
        System.out.println("Enter the grade you had for each course in order as entered above: ");
        String[] course_grade = new String[num_course];
        for (int i = 0; i < num_course; i++) {
                System.out.print("Course grade  " + (i + 1) + ": ");
                course_grade[i] = in.next();
        }

        System.out.println();
        System.out.println("Enter your the credit hours for each course in order as entered above: ");
        double sum = 0;
        int[] course_credit_hour = new int[num_course];
        for (int i = 0; i < num_course; i++) {
                System.out.print("course credit hour " + (i + 1) + ": ");
                course_credit_hour[i] = in.nextInt();
                total_credit_hours = total_credit_hours + course_credit_hour[i];
        }
        System.out.println("The total credit hours is: "+ total_credit_hours);

        double totalGP = 0;

        for (int i = 0; i < course_grade.length; i++) {
            switch (course_grade[i]) {
                case "A+":
                    totalGP = totalGP + (5.0 * course_credit_hour[i]);
                    break;
                case "A":
                    totalGP = totalGP + (4.5 * course_credit_hour[i]);
                    break;
                case "B+":
                    totalGP = totalGP + (4.0 * course_credit_hour[i]);
                    break;
                case "B":
                    totalGP = totalGP + (3.5 * course_credit_hour[i]);
                    break;
                case "C+":
                    totalGP = totalGP + (3.0 * course_credit_hour[i]);
                    break;
                case "C":
                    totalGP = totalGP + (2.5 * course_credit_hour[i]);
                    break;
                case "D+":
                    totalGP = totalGP + (2.0 * course_credit_hour[i]);
                    break;
                case "D":
                    totalGP = totalGP + (1.5 * course_credit_hour[i]);
                    break;
                case "F":
                    totalGP = totalGP + (0.0 * course_credit_hour[i]);
                    break;
                default:
                    System.out.println("Invalid output");
                    break;
            }


        }

        /*System.out.println();
        gpa = totalGP / total_credit_hours;
        System.out.printf("Your GPA is: %.2f\n", + gpa);*/

        for (int i = 0; i < 90; i++) {
            System.out.print("=");
        }
        System.out.println();

        System.out.println("\t\t\t\tACCRA TECHNICAL UNIVERSITY\n" + "\t\t\t\tStudent Results Slip");
        for (int i = 0; i < 80; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("Student Name: "+student_name + "\n" + "Student ID: "+ student_ID + "\n"+
         "\n" + "Department: Dept Of "+department + "\n" + "Semester: "+semester + "\n" + "Program Level: "+ program_level + "\n" + "Program: "+program);

        for (int i = 0; i < 80; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.print("Course Code\t\t\t\t"+ "CR\t\t\t\t" + "Grade");
        System.out.println();
        for (int i = 0; i < num_course; i++) {
            System.out.println(course_name[i] + "\t\t\t\t\t" + course_credit_hour[i] + "\t\t\t\t  " + course_grade[i]);
        }

        System.out.println();
        System.out.println("Total Credit Hours: "+total_credit_hours);
        gpa = totalGP / total_credit_hours;
        System.out.printf("Your GPA is: %.2f\n", + gpa);
        System.out.println();

        if (gpa > 4.00) {
            System.out.println(student_name+" you are a First Class Student, Congratulations!");
        } else if (gpa >= 3.00 && gpa <= 3.99) {
            System.out.println(student_name+" you are a Second Class Upper Student, Congratulations!");
        } else if (gpa >= 2.00 && gpa <= 2.99) {
            System.out.println(student_name+" you are a Second Class Lower Student, Congratulations!");
        } else if (gpa >= 1.50 && gpa <= 1.99) {
            System.out.println(student_name+" you had a pass, work very hard next time.");
        } else {
            System.out.println(student_name+" sorry you have failed, work extra hard next time.");
        }

    }

}