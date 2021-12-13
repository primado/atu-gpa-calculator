package javaHandout;

import java.util.Scanner;

public class BodyMassIndex {
    double height, weight, bmi;
    String name;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your height: ");
        height = sc.nextDouble();

        System.out.print("Enter your weight: ");
        weight = sc.nextDouble();

    }

    public void manipulation() {
        bmi = weight / (height * 2) * 703;
        System.out.printf("Hello " + name + " your Body Mass Index is %.2f\n", bmi + ".");
    }

    public static void main(String[] args) {
        BodyMassIndex myObj = new BodyMassIndex();
        myObj.input();
        myObj.manipulation();
    }
}
