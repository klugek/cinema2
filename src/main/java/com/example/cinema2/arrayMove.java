package com.example.cinema2;
import java.util.Scanner;



public class arrayMove  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfChars = scanner.nextInt();
        int[] arrayChars = new int[countOfChars];
        for(int i = 0; i < countOfChars; i++){
            arrayChars[i] = scanner.nextInt();
        }
        int[] arraySave = arrayChars;
        for(int u = 1; u < countOfChars; u++){
            arrayChars[0] = arraySave[countOfChars -1];
            arrayChars[u] = arraySave[u - 1];
            System.out.println(arrayChars[u - 1]);
        }

    }
}
