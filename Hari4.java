package ISC100Hari;

import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        /*System.out.print digunakan untuk mencetak teks ataupun nilai 
         *tanpa penambahan garis baru setelah output
         */
        System.out.print("number: ");
        int angka = scanner.nextInt();
        
        /*System.out.printf digunakan untuk mencetak output dengan format tertentu,
         *sehingga kita dapat mengendalikan outputnya seperti yang diinginkan.
         */
        
        /* %s digunakan untuk mencetak string
         * %d digunakan untuk mencetak bilangan bulat/integer
         * %f digunakan untuk mencetak bilangan desimal
         */
        String kota = "IKN";
        int merdeka = 79;
        System.out.printf("Pada Kemerdekaan RI yang ke-%d tahun upacara dilaksanakan di %s%n", merdeka, kota);
        
        /*kita dapat mengontrol berapa banyak angka dibelakang koma yang ingin diinginkan pada 
         *contoh di bawah menggunakan %.2f yang artinya yang dicetak hanya dua angka dibelakang koma
        */
        double pi = 3.14159;
        System.out.printf("Nilai pi adalah %f tapi, jika ingin mengambil hanya dua angka dibelakang koma bisa menjadi %.2f", pi, pi);
        
    }
}
