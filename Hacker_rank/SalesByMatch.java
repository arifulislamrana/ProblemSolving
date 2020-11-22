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
public class SalesByMatch {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
       int n = input.nextInt();
       int[] index = new int[n+100];
       
        for (int i = 0; i < n; i++) {
            int temp = input.nextInt();
            index[temp]++;
        }
        int count =0;
        for (int i = 0; i < n+100; i++) {
            count = count + index[i]/2;
        }
        
        System.out.println(count);
    }
}
