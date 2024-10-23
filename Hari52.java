package ISC100Hari;

public class Day52 {
    public static void main(String[] args) {
        
        int angka = 15;
        
        String nilai = (angka % 2 == 0)? "Genap": "Ganjil";
        System.out.printf("%d adalah bilangan %s%n", angka, nilai);
    }
}
