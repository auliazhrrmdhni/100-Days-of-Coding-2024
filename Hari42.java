package ISC100Hari;

import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nilai1: ");
        byte nilai1 = input.nextByte();
        
        System.out.print("Nilai2: ");
        byte nilai2 = input.nextByte();
        
        int penjumlahan = nilai1+nilai2;
        int pengurangan = nilai2-nilai1;
        int perkalian = nilai1*nilai2;
        
        boolean hasil1 = penjumlahan==pengurangan;
        boolean hasil2 = penjumlahan != perkalian;
        
        System.out.println("Penjumlahan: "+penjumlahan);
        System.out.println("Pengurangan: "+pengurangan);
        System.out.println("Perkalian: "+perkalian);
        System.out.println("Apakah hasil penjumlahan sama dengan hasil pengurangan: "+hasil1);
        System.out.println("Apakah hasil penjumlahan tidak sama dengan hasil perkalian: "+hasil2);
    }
}
