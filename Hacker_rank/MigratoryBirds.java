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
public class MigratoryBirds {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int length = input.nextInt();
        int[] arr = new int[5];
        
        for (int i = 0; i < length; i++) {
            int type = input.nextInt();
            arr[type-1]++;
        }
        
        int max = 0;
        int count = 0;
        
        for (int i = 0; i < 5; i++) {
            if (count < arr[i]) {
                max = i+1;
                count = arr[i];
            }
        }
        
        System.out.println(max);
        

    }
}
