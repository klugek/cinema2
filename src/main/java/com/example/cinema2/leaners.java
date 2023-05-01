package com.example.cinema2;
import java.util.Scanner;
public class leaners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int votedNumber = scanner.nextInt();
       switch (votedNumber) {
           case 1 -> System.out.println("Yes!");
           case 2 -> System.out.println("No!");
           case 3-> System.out.println("No!");
           case 4 -> System.out.println("No!");
           default -> System.out.println("Unknown number");
       }
    }
}
