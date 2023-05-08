package com.example.cinema2;
import java.util.Scanner;
public class thirdPart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        System.out.println();
        int chooseFrommenu = -1;
        while (chooseFrommenu != 0) {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("0. Exit");
            chooseFrommenu = scanner.nextInt();
            switch (chooseFrommenu) {
                case 1:
                    System.out.println();
                    System.out.println("Cinema:");
                    for (int i = 0; i <= seats; i++) {
                        if (i == 0){
                            System.out.print("  ");
                        } else if (i == seats) {
                            System.out.print(i);
                        }
                        else {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    for (int j = 1; j <= rows; j++) {
                        System.out.print(j + " ");
                        for (int h = 0; h < seats; h++) {
                            if (h == seats -1){
                                System.out.print("S");
                            } else {
                                System.out.print("S ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int countOfSeats = rows * seats;
                    System.out.println();
                    System.out.println("Enter a row number:");
                    int rowsRes = scanner.nextInt();
                    System.out.println("Enter a seat number in that row:");
                    int seatsRes = scanner.nextInt();
                    System.out.println();

                    int polovina = 0;
                    int dollars = 0;
                    if(rows % 2 == 0){
                        polovina = rows/2;
                    }else {
                        polovina = (rows-1)/2;
                    }
                    int druhaPolovina = rows - polovina;
                    if (countOfSeats <= 60){
                        dollars = 10;
                        System.out.println("Ticket price: $" + dollars);
                    } else if (rowsRes < druhaPolovina){
                        dollars = 10;
                        System.out.println("Ticket price: $" + dollars);
                    } else if (rowsRes >= druhaPolovina){
                        dollars = 8;
                        System.out.println("Ticket price: $" + dollars);
                    }
                    System.out.println();
                    System.out.println("Cinema:");
                    for (int i = 0; i <= seats; i++) {
                        if (i == 0){
                            System.out.print("  ");
                        } else if (i == seats) {
                            System.out.print(i);
                        }
                        else {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    for (int j = 1; j <= rows; j++) {
                        System.out.print(j + " ");
                        for (int h = 0; h < seats; h++) {
                            if (j == rowsRes && h == seatsRes - 1) {
                                System.out.print("B ");
                                h = h + 1;

                            }
                            if (h == seats -1){
                                System.out.print("S");
                            } else {
                                System.out.print("S ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }
        }
    }
}


