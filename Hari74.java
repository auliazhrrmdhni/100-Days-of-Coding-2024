package ISC100Hari;

import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
        
        System.out.println(kalimat+ " memiliki panjang "+ kalimat.length());
    }
}
