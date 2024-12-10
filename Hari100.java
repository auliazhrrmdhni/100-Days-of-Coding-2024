package ISC100Hari;

import java.util.Scanner;
import java.time.LocalTime;

public class Day100 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nama: ");
        String nama = scanner.nextLine();
        
        LocalTime sekarang = LocalTime.now();
        String salam;
        
        if(sekarang.isBefore(LocalTime.of(12, 0))){
            salam = "Selamat pagi";
        }else if(sekarang.isBefore(LocalTime.of(17, 0))){
            salam = "Selamat siang";
        }else{
            salam = "Selamat Malam";
        }
        
        for (int i = 0; i < 50; i++) {
            System.out.print("=");
        }
        
        System.out.println("\n"+salam+", "+nama);
        System.out.println("Program Anda Telah Selesai");
        
        for (int i = 0; i < 50; i++) {
            System.out.print("=");
        }
    }
}
