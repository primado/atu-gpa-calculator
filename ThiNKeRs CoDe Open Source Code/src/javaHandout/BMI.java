package javaHandout;

import java.util.Scanner;

public class BMI {
    double weight, height, bmi, new_Weight, new_height;
    double weight2, height2, cat, new_weight2, new_height2;
    String name1, name2;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name1 = sc.nextLine();
        System.out.print("Enter your weight: ");
        weight = sc.nextDouble();
        System.out.print("Enter your height: ");
        height = sc.nextDouble();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("The second person should enter his/her data");
        System.out.print("Enter your name: ");
        name2 = sc1.nextLine();
        System.out.println();
        System.out.print("Enter your weight: ");
        weight2 = sc1.nextDouble();
        System.out.println();
        System.out.print("Enter your height: ");
        height2 = sc1.nextDouble();
    }

    public void manipulation() {
        /*new_Weight = weight * 0.45359237;
        new_height = height * 0.39370;
        new_weight2 = weight2 * 0.45359237;
        new_height2 = height2 * 0.39370;*/

        bmi = weight / (height * height) * 703;
        cat = weight2 / (height2 * height2) * 703;
    }

    /*public static double bmi(double new_height, double new_Weight) {
        return (new_Weight * 703 / new_height / new_height);
    }
    public static double cat(double new_weight2, double new_height2) {
        return (new_weight2 * 703 / new_height2 / new_height2);
    }*/

    public void compare() {
        System.out.println("This program reads data of two people and  out the BMI and status of the individuals");
        System.out.printf(name1 +" your BMI is %.2f\n", bmi);
        if (bmi > 18.5) {
            System.out.println("You\'re underweight.");
        } else if (bmi < 25) {
            System.out.println("Normal weight.");
        } else if (bmi < 30) {
            System.out.println("Sorry you\'re overweight");
        } else {
            System.out.println("Obese");
        }
    }
    public void compare2() {
        System.out.printf(name2 +" your BMI is %.2f", cat);
        if (cat > 18.5) {
            System.out.println("You\'re underweight.");
        } else if (cat < 25) {
            System.out.println("Normal weight.");
        } else if (cat < 30) {
            System.out.println("Sorry you\'re overweight");
        } else {
            System.out.println("Obese");
        }
    }

    public static void main(String[] args) {
        BMI myObj = new BMI();
        myObj.input();
        myObj.manipulation();
        myObj.compare();
        myObj.compare2();
    }
}
