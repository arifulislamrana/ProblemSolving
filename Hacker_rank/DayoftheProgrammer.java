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
public class DayoftheProgrammer {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int year = input.nextInt();
        
        if (year == 1918) {
            
            System.out.println("26.09."+year);
            
        } else {
            
            if (((year <= 1917) && (year%4 == 0)) || ((year > 1918) && (year%400 == 0 || ((year%4 == 0) && (year%100 != 0))))) {
                System.out.println("12.09."+year);
            } else {
                System.out.println("13.09."+year);
            }
        }
    }
}
