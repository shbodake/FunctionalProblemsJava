package com.blp.functionalproblems;
import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.println("Enter the X and Y to Find Euclidean distance");
        System.out.println(" Enter X:");
        x=scanner.nextInt();
        System.out.println(" Enter Y:");
        y=scanner.nextInt();
        scanner.close();
        double distance=  Math.sqrt((x * x) + (y * y));
        System.out.println("Euclidean distance from the point (x, y) to the origin ( 0 , 0) is : " + distance);
    }
}


