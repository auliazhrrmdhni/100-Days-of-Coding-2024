package ISC100Hari;

import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nilai1: ");
        int nilai1 = scanner.nextInt();
        
        System.out.print("Nilai2: ");
        int nilai2 = scanner.nextInt();
        
        if(nilai1 > nilai2){
            System.out.println("Nilai1 lebih besar dari nilai2");
        }else if(nilai2 > nilai1){
            System.out.println("Nilai2 lebih besar dari nilai1");
        }else{
            System.out.println("Nilai keduanya sama");
        }
    }
}
