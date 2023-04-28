package com.example.cinema2;
import java.util.Scanner;
public class symethric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String res = null;
        int  n = scanner.nextInt();
        int [][] matrix = new int[n][n];
        for (int row = 0 ;row < matrix.length; row++){
            for (int col = 0; col< matrix[row].length; col++){
                matrix[row][col] = scanner.nextInt();
            }
        }
        for (int i = 0; i< matrix.length; i++) {
            for (int j = 0;j<matrix[i].length; j++) {
                if (matrix[i][j] == matrix[j][i]) {
                    res = "YES";

                }
                else {
                    res = "NO";
                    break;
                }
            }
            if(res == "NO"){
             break;
            }

        }
        System.out.println(res);
    }
}

