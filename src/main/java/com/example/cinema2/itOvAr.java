package com.example.cinema2;
import java.util.Scanner;
public class itOvAr {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] array = new int[x];
        for (int i = 0; i < x; i++) {
            array[i] = scanner.nextInt();
        }
        int numberSearchFor = scanner.nextInt();
        boolean rigtOrNot = false;
        for(int j: array){
        if (j == numberSearchFor){
            rigtOrNot = true;
            break;
        }
        }
        System.out.print(rigtOrNot);
}}
