package com.example.cinema2;
import java.util.Scanner;
public class checkNubers {

    public static int sign(int number) {
        int finalNumber = 0;
        if (number < 0) {
            finalNumber = -1;
        } else if (number > 0) {
            finalNumber = 1;
        }
        return finalNumber;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }


}
