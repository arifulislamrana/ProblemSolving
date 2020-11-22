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
public class CatsAndAMouse {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            int A =  input.nextInt();
            int B = input.nextInt();
            int C = input.nextInt();
            
            if (abs(C-A)<abs(C-B)) {
                System.out.println("Cat A");
            }
            
            else if (abs(C-A)>abs(C-B)) {
                System.out.println("Cat B");
            }
            
            else{
                System.out.println("Mouse C");
            }
            
           
        }
    }
}
