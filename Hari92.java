package ISC100Hari;

public class Day92 {
    public static void main(String[] args) {
        
        int baris = 5;
        
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            
            for(int k = 0; k < (2*(baris-i-1)); k++){
                System.out.print(" ");
            }
            if(i != baris-1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
