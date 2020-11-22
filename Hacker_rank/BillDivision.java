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
public class BillDivision {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int k = input.nextInt();
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            int temp = input.nextInt();
            if (i != k) {
                sum += temp;
            }
        }
        
        int b = input.nextInt();
        if (sum/2 == b) {
            
            System.out.println("Bon Appetit");
        } else {
            
            System.out.println(b - sum / 2);
        }
    }
}
