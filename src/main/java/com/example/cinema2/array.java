package com.example.cinema2;
import java.util.Scanner;
public class array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n]; // initialize the array
        boolean status = false;
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        int comp1 = scanner.nextInt();
        int comp2 = scanner.nextInt();
        for(int i = 0; i < n; i++){
            if(n != 2 && (comp1 == array[i] && comp2 == array[i-1]
                    || comp2 == array[i] && comp1 == array[i-1]
                    || comp2 == array[i] && comp1 == array[i])){
                status = false;
                break;
            } else if (n == 2 && ((comp1 == array[0] && comp2 == array[1]) || (comp1 == array[1] && comp2 == array[0]))) {
                status = false;
                break;

            } else{
                status = true;
            }
        }
        System.out.println(status);
    }
}