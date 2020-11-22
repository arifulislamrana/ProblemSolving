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
public class DivisibleSumPairs {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int length = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[length];
        
        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }
        
        int count = 0;
        
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ((arr[i]+arr[j])%k == 0) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
        
    }
}
