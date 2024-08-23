package homework;

import java.util.Scanner;

public class Baitap1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name, sex, major, hometown;
        int age, year;
        float gpa;

        System.out.println("Enter your name:");
        name = scanner.nextLine();

        System.out.println("Enter your sex:");
        sex = scanner.nextLine();

        System.out.println("Enter your major:");
        major = scanner.nextLine();

        System.out.println("Enter your hometown:");
        hometown = scanner.nextLine();

        System.out.println("Enter your age:");
        age = scanner.nextInt();

        System.out.println("Enter your year:");
        year = scanner.nextInt();

        System.out.println("Enter your GPA:");
        gpa = scanner.nextFloat();

        System.out.println("--- Information ---");
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Major: " + major);
        System.out.println("Hometown: " + hometown);
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("GPA: " + gpa);

        scanner.close();
    }
}

