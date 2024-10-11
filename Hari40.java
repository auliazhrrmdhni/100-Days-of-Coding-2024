package ISC100Hari;

import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Umur: ");
        int umur = scanner.nextInt();
        
        int pemilih = 17;
        
        if(umur >= pemilih){
            System.out.println("Dapat memilih");
        }else{
            System.out.println("Belum bisa memilih");
        } 
    }
}
