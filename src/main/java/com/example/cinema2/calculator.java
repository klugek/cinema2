package com.example.cinema2;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long firstNumber = scanner.nextLong();
        String operator = scanner.next();
        long secondNumber = scanner.nextLong();
        if (secondNumber == 0) {
            System.out.println("Division by 0!");
        } else {
            switch (operator) {
                case "+" -> System.out.println(firstNumber + secondNumber);
                case "-" -> System.out.println(firstNumber - secondNumber);
                case "/" -> System.out.println(firstNumber / secondNumber);
                case "*" -> System.out.println(firstNumber * secondNumber);
                default -> System.out.println("Unknown operator");
        } }
    }
}
