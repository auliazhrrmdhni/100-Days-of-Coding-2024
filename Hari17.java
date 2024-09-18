package ISC100Hari;

import java.util.Scanner;

public class Day17 {
    public static void main(String[] args){
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        
        char inisial = nama.charAt(0);
        System.out.println("Inisial: "+inisial);
    }
}
