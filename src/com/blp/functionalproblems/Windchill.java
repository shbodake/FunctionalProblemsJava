package com.blp.functionalproblems;
import java.util.Scanner;
public class Windchill {
    public static void main(String[] args) {
        int t, v;
        double wc;
        System.out.println("Calculating WindChill using Equation");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of temperature 't' (<50) in Fahrenheit");
        t = scanner.nextInt();
        System.out.println("Enter the value of speed 'v' (3<'v'<120) in Fahrenheit");
        v = scanner.nextInt();
        scanner.close();

        if (t < 50 && v > 3 && v < 120) {
            wc = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
            System.out.println("WindChill is : " + wc);
        } else {
            System.out.println("Enter the values of temperature and speed in specified range");
        }

    }
}
