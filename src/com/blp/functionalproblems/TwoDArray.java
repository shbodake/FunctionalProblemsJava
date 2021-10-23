package com.blp.functionalproblems;
import java.util.Scanner;
public class TwoDArray {
    Scanner scanner = new Scanner(System.in);
    public static void printTwoDArray(int rows, int column) {
        int[][] arr = new int[rows][column];
        int z = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = z;
                System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + "  ");
                z++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Creating a 2 Dimensional Array");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no.of Rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the no.of Columns: ");
        int column = scanner.nextInt();
        scanner.close();
        printTwoDArray(rows, column);
    }
}

