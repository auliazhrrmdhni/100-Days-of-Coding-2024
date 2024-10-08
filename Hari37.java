package ISC100Hari;

import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Angka1: ");
        int angka1 = scanner.nextInt();
        System.out.print("Angka2: ");
        int angka2 = scanner.nextInt();
        
        angka1+=angka2;
        System.out.println("Hasil penjumlahan keduanya adalah "+angka1);
        
        System.out.print("Nilai1: ");
        int nilai1 = scanner.nextInt();
        System.out.print("Nilai2: ");
        int nilai2 = scanner.nextInt();
        
        nilai1-=nilai2;
        System.out.println("Hasil kurang dari keduanya adalah "+nilai1);        
    }
    
}
