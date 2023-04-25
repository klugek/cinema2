package com.example.cinema2;
import java.util.Scanner;
public class SquaresOfNatNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;
        while(i <= number){
            if(Math.sqrt(i)%1 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
