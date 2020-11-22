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
public class CountingValleys {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int step = input.nextInt();
        String pathtemp = input.next();
        
        char[] path = pathtemp.toCharArray();
        
        int vally = 0;
        int count = 0;
        
        for (int i = 0; i < step; i++) {
            if (path[i]=='U') {
                count++;
                
            } else {
                count--;
            }
            if (count==0 && path[i]=='U') {
                vally++;
            }
        }
        System.out.println(vally);
    }
}
