/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hacker_rank;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author Ariful Islam
 */
public class FormingMagicSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] s = new int[9];
        
        
        int[][] solns = {
            {2, 7, 6, 9, 5, 1, 4, 3, 8},
            {6, 7, 2, 1, 5, 9, 8, 3, 4},
            {4, 3, 8, 9, 5, 1, 2, 7, 6},
            {8, 3, 4, 1, 5, 9, 6, 7, 2},
            {2, 9, 4, 7, 5, 3, 6, 1, 8},
            {4, 9, 2, 3, 5, 7, 8, 1, 6},
            {6, 1, 8, 7, 5, 3, 2, 9, 4},
            {8, 1, 6, 3, 5, 7, 4, 9, 2}
                
        };
        
        for (int i = 0; i < 9; i++) {
            s[i] = input.nextInt();
        }
        
        int min = 9999;
        
        for (int i = 0; i < 8; i++) {
            int sum = 0;
            for (int j = 0; j < 9; j++) {
                sum = sum + abs((solns[i][j] - s[j]));
            }
            if (sum < min) {
                min = sum;
            }
        }
        
        System.out.println(min);
    }
}
