package ISC100Hari;

import java.util.Arrays;
import java.util.Scanner;

public class Day88 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();
        
        String[] namaMhs = new String[jumlah];
        
        for(int i = 0; i < jumlah; i++){
            System.out.print("Masukkan nama mahasiswa: ");
            namaMhs[i] = scanner.nextLine();
        }
        System.out.println("Daftar nama mahasiswa: "+Arrays.toString(namaMhs));
    }
}
