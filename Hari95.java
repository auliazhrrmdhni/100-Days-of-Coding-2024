package ISC100Hari;

public class Day95 {
    public static void main(String[] args) {
        
        int baris = 5;
        
        System.out.println("Segitiga siku kanan");
        for(int i = 1; i <= baris; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Segitiga siku kiri");
        for(int k = 1; k <= baris; k++){
            for(int l = 4; l >= k; l--){
                System.out.print(" ");
            }
            for(int m = 1; m <= k; m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
