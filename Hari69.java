package ISC100Hari;

import java.util.Scanner;

public class Day69 {
        public static int hasilPerkalian(){
            return 2*5; 
        }
    
    public static void main(String[] args) {
        //nomor 1
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nomor 1");
        
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();
        
        int hasil = 1;
        System.out.print(angka+"! = ");
        for(int i=angka ; i > 0; i--){
            hasil*=i;
            System.out.print(i);
            if(i >1){
                System.out.print(" x ");
            }
        }
        System.out.println(" = "+hasil);
        System.out.println();
        
        //nomor 2
        System.out.println("Nomor 2");
        int segitiga = 1;
        for(int j = 1; j <= 4; j++){
            for(int k = 1; k <=j; k++){
                System.out.print(segitiga+" ");
                segitiga++;
            }
            System.out.println();
        }
        System.out.println();

        //nomor 3
        System.out.println("Nomor 3");
        int nilai;

        do {
            System.out.print("Masukkan angka: ");
           nilai = scanner.nextInt();

            if (nilai % 2 == 0 && nilai % 3 == 0) {
                System.out.println("Angka adalah kelipatan 2 dan kelipatan 3. Masukkan angka lagi");
            } else if (nilai % 2 == 0) {
                System.out.println("Angka adalah kelipatan 2.");
                break;
            } else if (nilai % 3 == 0) {
                System.out.println("Angka adalah kelipatan 3.");
                break;
            } else {
                System.out.println("Angka bukan kelipatan 2 atau 3.");
                break;
            }
        } while (nilai % 2 == 0 && nilai % 3 == 0);
        System.out.println();

        //nomor 4
        System.out.println("Nomor 4");
        int perkalian = Day69.hasilPerkalian();
        System.out.println("Hasil perkalian = "+ perkalian);
        System.out.println();

       //nomor 5
        System.out.println("Nomor 5");
       int segitigaSamaKaki = 5;
 
        for (int l = 1; l <= segitigaSamaKaki; l++) {
            for (int m = 1; m <= segitigaSamaKaki-l; m++) {
                System.out.print(" ");
        }
        for (int n = 1; n <= l; n++) {
        System.out.print("* ");
        }
         System.out.println();
        }
        System.out.println();
    }
}
