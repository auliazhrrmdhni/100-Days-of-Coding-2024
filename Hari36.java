package ISC100Hari;

public class Day36 {
    public static void main(String[] args) {
        
        byte angka1 = 12;
        byte angka2 = 4; 
        byte angka = 5;
        
        int hasilKali = angka2*angka;
        int hasilBagi = angka1/angka2;
        int modulo = angka1%angka;
        
        System.out.printf("Hasil perkalian dari %d dikali %d adalah %d%n", angka2, angka, hasilKali);
        System.out.printf("Hasil bagi dari %d dibagi %d adalah %d%n", angka1, angka2, hasilBagi);
        System.out.printf("Sisa bagi dari %d dibagi %d adalah %d%n", angka1, angka, modulo);
    }
}
