package ISC100Hari;

public class Day64 {
    public static void main(String[] args) {
        
        int[] angka = {3, 9, 15, 14, 11};
        
        cariGenap:
        for(int nilai: angka){
            System.out.println("Memeriksa angka: "+nilai);
            
            if(nilai %2 == 0){
                System.out.println("Terdapat angka genap: "+nilai);
                break cariGenap;
            }
        }
    }
}
