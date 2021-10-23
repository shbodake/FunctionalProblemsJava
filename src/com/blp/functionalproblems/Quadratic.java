package com.blp.functionalproblems;
import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, Delta;
        float root1, root2;
        System.out.println("Calculating Quadratic Roots of Equation");
        System.out.println("Enter the value of 'a' in Quadratic equation:");
        a = scanner.nextInt();
        System.out.println("Enter the value of 'b' in Quadratic equation:");
        b = scanner.nextInt();
        System.out.println("Enter the value of 'c' in Quadratic equation:");
        c = scanner.nextInt();
        System.out.println("The roots of the equation " + a + "x^2+" + b + "x+" + c + " are ");
        scanner.close();
        Delta = b * b - 4 * a * c;
        System.out.println("Value of Delta =" + Delta);
        if (Delta >= 0) {
            root1 = (float) (-b + Math.sqrt(Delta)) / (2 * a);
            root2 = (float) (-b - Math.sqrt(Delta)) / (2 * a);
            System.out.println("root1: " + root1 + " & root2: " + root2);
        } else {
            System.out.println("No real solution, Roots are imaginary");
        }
    }
}
