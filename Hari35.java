package ISC100Hari;

import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("Angka1: ");
        int angka1 = inputan.nextInt();
        System.out.print("Angka2: ");
        int angka2 = inputan.nextInt();
        
        int hasilJumlah = angka1+angka2;
        int hasilKurang = angka1-angka2;
        
        System.out.println("Hasil penjumlahannya adalah: "+hasilJumlah);
        System.out.println("Hasil pengurangannya adalah: "+hasilKurang);
        
    }
}
