package com.example.cinema2;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int school = scanner.nextInt();
        switch (school) {
            case 1 -> System.out.println("You have chosen a square");
            case 2 -> System.out.println("You have chosen a circle");
            case 3 -> System.out.println("You have chosen a triangle");
            case 4 -> System.out.println("You have chosen a rhombus");
            default -> System.out.println("There is no such shape!");
        }

    }
}