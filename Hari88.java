package ISC100Hari;

import java.util.ArrayList;
import java.util.Scanner;

public class Day88 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();
        
        ArrayList<String> namaMhs = new ArrayList<String>();
        
        for(int i = 1; i <= jumlah; i++){
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = scanner.nextLine();
            namaMhs.add(nama);
        }
        System.out.println("Daftar nama: "+namaMhs);
    }
}
