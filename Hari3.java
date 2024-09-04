package ISC100Hari;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("m = ");
        int m = scanner.nextInt();
        
        System.out.println("n = ");
        int n = scanner.nextInt();
        
        if(m < n){
            for(int i = m+1; i < n; i++){
                System.out.print(i);
                if(i < n-1){
                    System.out.print(", ");
                }
            }
        }
        
        else if(n < m){
            for (int j = n+1; j<m; j++){
                System.out.print(j);
                if(j < m-1){
                    System.out.print(", ");
                }
            }
        }
    }
}
