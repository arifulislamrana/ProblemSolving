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
public class DrawingBook {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int p = input.nextInt();
        
        int res = pageCount(n, p);
        System.out.println(res);
    }
    
    public static int pageCount(int n, int p){
        int output_mini = (n/2)-(p/2);
        
        if (p/2 < output_mini) {
            
            output_mini = p/2;
        }
        
        return output_mini;
    }
}
