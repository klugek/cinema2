package com.example.cinema2;
import java.util.Scanner;
public class TheLenghtOfTheSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = 1;
        int i = -1;
        while (end != 0){
            end = scanner.nextInt();
            i++;
        }
        System.out.println(i);
    }
}
