package ISC100Hari;

import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan warna lampu lalu lintas: ");
        String lampu = scanner.nextLine();

        switch(lampu){
            case "merah":
                System.out.println("Mohon berhenti!");
                break;
            case "kuning":
                System.out.println("Hati-hati");
                break;
            case "hijau":
                System.out.println("Silahkan jalan");
                break;
            default:
                System.out.print("Warna salah");
        }
    }
}
