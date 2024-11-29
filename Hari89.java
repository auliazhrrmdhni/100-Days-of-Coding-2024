package ISC100Hari;

import java.util.Scanner;

public class Day89 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = scanner.nextInt();
        scanner.nextLine();
        
        String[] teman = new String[elemen];
        
        for(int i = 0; i < elemen; i++){
            System.out.print("Masukkan nama teman: ");
            teman[i] = scanner.nextLine();
        }
        
        System.out.println("\nDaftar nama teman: ");
        for(int j = 0; j < teman.length; j++){
            System.out.println(teman[j]);
        }
        
        System.out.print("\nIndeks ke berapa yang ingin diubah? ");
        int indeks = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Nilai baru: ");
        teman[indeks] = scanner.nextLine();
        
        System.out.println("\nDaftar baru: ");
        for(int k = 0; k < teman.length; k++){
            System.out.println(teman[k]);
        }
    }
}
