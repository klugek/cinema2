package com.example.cinema2;
import java.util.Scanner;

public class powerNumbers {


    public static double divide(long a, long b) {
        double resultOfDivision = (double) a / b;
        return resultOfDivision;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        System.out.println(divide(a, b));
    }
}

