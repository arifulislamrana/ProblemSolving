/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hacker_rank;

import java.util.Scanner;

/**
 *
 * @author Ariful Islam
 */
public class BreakingTheRecords {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int match = input.nextInt();
        
        int[] score = new int[match];
        
        for (int i = 0; i < match; i++) {
            score[i] = input.nextInt();
        }
        
        int highest = score[0];
        int lowest = score[0];
        int lowbrk = 0, highbrk = 0;
        
        for (int i = 1; i < score.length; i++) {
            if (score[i] < lowest) {
                lowest = score[i];
                lowbrk++;
            }
            if (score[i] > highest) {
                highest = score[i];
                highbrk++;
            }
        }
        
        System.out.print(+highbrk+" "+lowbrk+" ");
        
    }
}
