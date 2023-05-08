package com.example.cinema2;
import java.util.Scanner;
public class fourthPart {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
    int columns = scanner.nextInt();
    String[][] cinemaPlaces = new String[rows][columns];
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            cinemaPlaces[i][j] = "S";
        }
    }
    int selectedValue = -1;
        while (selectedValue != 0) {
        System.out.println();
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("0. Exit");
        selectedValue = scanner.nextInt();
        switch (selectedValue) {
            case 1:
                showTheSits(cinemaPlaces);
                break;
            case 2:
                buyTicket(cinemaPlaces);
                break;
        }
    }
}

    private static void showTheSits(String[][] cinemaPlaces) {
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i <= cinemaPlaces[0].length; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < cinemaPlaces.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < cinemaPlaces[i].length; j++) {
                System.out.print(" " + cinemaPlaces[i][j]);
            }
            System.out.println();
        }
    }

    private static void buyTicket(String[][] cinemaPlaces){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a row number:");
        int selectedRow = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int selectedColumn = scanner.nextInt();
        cinemaPlaces[selectedRow-1][selectedColumn-1] = "B";
        checkTicketPrice(cinemaPlaces, selectedRow);
    }

    private static void checkTicketPrice(String[][] cinemaPlaces, int selectedRow) {
        int numbersSeats = cinemaPlaces.length * cinemaPlaces[0].length;
        int price = 0;
        if (numbersSeats < 60) {
            price = 10;
        } else {
            int r2 = cinemaPlaces.length / 2;
            if (selectedRow > r2) {
                price = 8;
            } else {
                price = 10;
            }
        }
        System.out.println("Ticket price: $" + price);
}
}
