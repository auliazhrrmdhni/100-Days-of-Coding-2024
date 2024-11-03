package ISC100Hari;

import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nilai: ");
        int nilai = scanner.nextInt();
        
        for(int i = 0; i <= nilai; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
