package com.example.cinema2;
import java.util.Scanner;
public class arrayNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrayOrigin = new int[n];
        for(int i = 0; i < n; i++){
            arrayOrigin[i] = scanner.nextInt();
        }
        int[] arrayB = new int[n];


        for(int y = 0; y < n; y++){
            if(y == 0) {
                arrayB[y] = arrayOrigin[n - 1];
                System.out.print(arrayB[y]  + " ");
            }
            else{
                arrayB[y] = arrayOrigin[y-1];
                System.out.print(arrayB[y] + " ");
            }

        }


    }
}