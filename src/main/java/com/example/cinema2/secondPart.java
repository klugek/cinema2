package com.example.cinema2;
import java.util.Scanner;
public class secondPart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        int countOfSeats = rows * seats;
        int polovina = 0;
        int dollars = 0;
        if(rows % 2 == 0){
            polovina = rows/2;
        }else {
            polovina = (rows-1)/2;
        }
        int druhaPolovina = rows - polovina;
        if(countOfSeats <= 60){
            dollars = countOfSeats * 10;
            System.out.println("Total income:");
            System.out.println("$"+ dollars);
        } else{
            dollars = (polovina * seats * 10) + (druhaPolovina * seats * 8);
            System.out.println("Total income:");
            System.out.println("$"+ dollars);
            }
            


    }
}
