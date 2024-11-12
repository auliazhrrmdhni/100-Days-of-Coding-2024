package ISC100Hari;

public class Day72 {
    public static int jumlahSeluruh(int nilai){
        if(nilai == 1){
            return 1;
        }else{
            return nilai + jumlahSeluruh(nilai-1);
        }
    }
    
    public static void main(String[] args) {
        int angka = 7;
        int jumlah = jumlahSeluruh(angka);
        System.out.printf("Jumlah seluruh angka dari %d sampai 1 ialah: %d%n", angka, jumlah);
    }
}
