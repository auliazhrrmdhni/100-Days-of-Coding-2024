package ISC100Hari;

public class Day66 {
    public static void main(String[] args) {
        
        int baris = 4;
        int kolom = 8;
        
        //persegi 
        for(int i = 1; i <= baris; i++){
            for(int j = 1; j <= baris; j++){
                System.out.print("+ ");
            }
            System.out.println();
        }
        
        System.out.println();
        //persegi panjang
        for(int k = 1; k <= baris; k++){
            for(int l = 1; l <= kolom; l++){
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
}
