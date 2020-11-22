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
public class SubArrayDivision {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int length = input.nextInt();
        int[] choco = new int[length];
        
        for (int i = 0; i < length; i++) {
            choco[i] = input.nextInt();
        }
        
        int day = input.nextInt();
        int month = input.nextInt();
        int count = 0;
        
        for (int i = 0; i < length - month + 1 ; i++) {
            int sum = 0;
            for (int j = i; j < i+month; j++) {
                sum = sum + choco[j];
            }
            if (sum == day) {
                count++;
            }
        }
        System.out.println(count);
    }
}
