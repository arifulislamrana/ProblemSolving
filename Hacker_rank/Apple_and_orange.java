
package Hacker_rank;

import java.util.Scanner;

public class Apple_and_orange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] house =new int[2];
        house[0]=in.nextInt();
        house[1]=in.nextInt();
        
        int[] tree = new int[2];
        tree[0]=in.nextInt();
        tree[1]=in.nextInt();
        
        int[] fruits = new int[2];
        fruits[0] = in.nextInt();
        fruits[1] = in.nextInt();
        
        int[] apple = new int[fruits[0]];
        int[] orange = new int[fruits[1]];
        
        int app=0,org=0;
        
        for(int i=0; i<fruits[0]; i++){
            apple[i]=in.nextInt();
            apple[i]=apple[i]+tree[0];
            if(apple[i]>=house[0] && apple[i]<=house[1]){
                app++;
            }
        }
        for(int i=0; i<fruits[1]; i++){
            orange[i]=in.nextInt();
            orange[i]=orange[i]+tree[1];
            if(orange[i]>=house[0] && orange[i]<=house[1]){
                org++;
            }
        }
        System.out.println(app);
        System.out.println(org);
    }
}
