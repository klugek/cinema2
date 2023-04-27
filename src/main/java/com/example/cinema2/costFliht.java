package com.example.cinema2;
import java.util.Scanner;
public class costFliht{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
                int days = scanner.nextInt();
                int food = scanner.nextInt() * days;
                int fligt = 2 * scanner.nextInt();
                int numberOfNights = (scanner.nextInt()) * (days -1);
                System.out.println(food + fligt + numberOfNights);
        }
}
