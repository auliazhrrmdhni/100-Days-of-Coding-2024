package D41;

import java.util.Scanner;

public class Aulia {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nilai1: ");
        String nilai1 = input.nextLine();
        System.out.print("Nilai2: ");
        String nilai2 = input.nextLine();
        
        int angka1 = Integer.parseInt(nilai1);
        int angka2 = Integer.parseInt(nilai2);
        
        int penjumlahan = angka1+angka2;
        int pengurangan = angka2-angka1;
        int perkalian = angka1*angka2;
        int pembagian = angka1/angka2;
        int modulo = angka1%angka2;
        
        boolean hasil = penjumlahan>perkalian;
        
        System.out.println("Penjumlahan: " + penjumlahan);
        System.out.println(Integer.toString(pengurangan));
        System.out.println(Integer.toString(perkalian));
        System.out.println(Integer.toString(pembagian));
        System.out.println(Integer.toString(modulo));
        System.out.println(Boolean.toString(hasil));
    }
}
