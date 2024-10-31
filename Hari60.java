package ISC100Hari;

import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan angka: ");
        int angka = scanner.nextInt();
        
        int i = 1;
        System.out.println("Bilangan genap: ");
        do{
            if(i %2==0){
                System.out.println(i);
            }
            i++;
        }
        while(i <= angka);
    }
}
