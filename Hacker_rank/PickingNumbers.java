
package Hacker_rank;

import static java.lang.Integer.max;
import static java.lang.Math.abs;
import java.util.Scanner;
import java.util.Stack;


public class PickingNumbers {
    
    public static void main(String[] args) {
        
        Scanner input  = new Scanner(System.in);
        
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]<=arr[j] && abs(arr[i]-arr[j])<= 1) {
                    stack1.push(arr[j]);
                }
                if (arr[i]>=arr[j] && abs(arr[i]-arr[j])<= 1) {
                    stack2.push(arr[j]);
                }
            }
            temp = max(stack1.size(), stack2.size());
            if (temp>length) {
                length = temp;
            }
            stack1.clear();
            stack2.clear();
        }
        
        System.out.println(length);
    }
}
