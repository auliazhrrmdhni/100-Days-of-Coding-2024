public class KonserTiket {
    
    public static void main(String[] args) {
        
        final int MAX_TIKET = 5000; //final variabel digunakan pada varibel MAX_TIKET untuk mendeklarasikan jumlah maksimal tiket yang tersedia
        short tiketTerjual = 3200; //Menginisialisasi variabel tiketTerjual digunakan untuk menyatakan jumlah tiket yang telah terjual 
        tiketTerjual +=150; //Dilakukan update pada varibel tiketTerjual dengan menambahkan 150 tiket baru yang terjual 
        int sisaTiket = MAX_TIKET-tiketTerjual; //Dibuat varibel baru yaitu sisaTiket untuk nilai dari sisa tiket yang tersedia
        System.out.println("Sisa tiket yang tersedia: "+sisaTiket); //Mencetak sisa tiket yang tersedia pada variabel sisaTiket 
        
        //Mencetak jumlah tiket yang tersedia dari total tiket yang disediakan dengan menggunakan format 
        System.out.printf("Tiket yang tersisa adalah: %d dari %d tiket total %n", sisaTiket, MAX_TIKET); 
        
        
    }
}
