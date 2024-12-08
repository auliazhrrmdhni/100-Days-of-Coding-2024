package ISC100Hari;

import java.util.Scanner;

public class Day98 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int x = 4;
        System.out.print("x: "+x);
        
        int y = 23;
        System.out.print("\ny: "+y);
        
        int hasil = 0;
        
        for(int i = x; i <= y; i++){
            if(i % 2 == 0){
                hasil+=i;
            }
        }
        System.out.println("\nHasil penjumlahan bilangan genap dari x ke y adalah: "+hasil);
    }
}
