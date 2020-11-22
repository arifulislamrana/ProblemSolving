
package Hacker_rank;

import java.util.Scanner;

public class Kangaroo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int x1,v1;
        x1 = in.nextInt();
        v1 = in.nextInt();
        
        int x2,v2;
        x2 = in.nextInt();
        v2 = in.nextInt();
        
        int k1 = x1;
        int k2 = x2;
        
        if(x2>x1&&v2>v1){           
            System.out.println("NO");
        }
        else{
            for(int i=0;i<10000;i++){
                 k1+=v1;
                 k2+=v2;
                 if(k1==k2){
                    System.out.println("YES");
                    System.exit(0);
                }
             }
            System.out.print("NO");
        }
    }
}
