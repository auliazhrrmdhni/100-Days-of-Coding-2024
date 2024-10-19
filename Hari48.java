package ISC100Hari;

import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Jumlah kaki: ");
        int kaki = scanner.nextInt();
        
        if(kaki == 4){
            System.out.println("Jumlah kakinya ada 4");
        }else{
            System.out.println("Jumlah kakinya bukan 4");
        }
        
    }
}
