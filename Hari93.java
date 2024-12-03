package ISC100Hari;

public class Day93 {
    public static void main(String[] args) {
        
        int baris = 5; 
        
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < (baris-i-1); j++){
                System.out.print(" ");
            }
            System.out.print("*");
            
            for(int k = 0; k < (2*i); k++){
                System.out.print(" ");
            }
            
            if(i != 0){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
