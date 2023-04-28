package com.example.cinema2;

import java.util.Scanner;

public class itAr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrayOrigin = new int[n];
        for(int i = 0; i < n; i++){
            arrayOrigin[i] = scanner.nextInt();
        }
        int numHig = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(arrayOrigin[i] > numHig){
                sum = sum + arrayOrigin[i];
            }


        }
        System.out.println(sum);
}}
