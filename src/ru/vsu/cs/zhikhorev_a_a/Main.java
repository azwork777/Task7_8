package ru.vsu.cs.zhikhorev_a_a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[readLengthOfArray()];
        readArray(array);
        printArray(array);
        printResults(Solution.findMaxSumOfConsecutiveElements(array));
    }

    private static int readLengthOfArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int a = scanner.nextInt();
        if (a < 1) {
            System.out.println("The length of array cannot be less than 1. Please retry ");
            return readLengthOfArray();
        }
        return a;
    }

    private static void readArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter %d element of array: ", (i + 1));
            arr[i] = scanner.nextInt();
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void printResults(int result) {
        System.out.println("The maximum sum of consecutive elements is " + result);
    }

}