package week1.day2;
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are old enough to vote!");
        } else {
            System.out.println("You are too young to vote.");
        }

        input.close();
    }
}