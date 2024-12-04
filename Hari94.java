package ISC100Hari;

public class Day94 {
    public static void main(String[] args) {
        
        int segitiga = 5;
 
        for (int l = 1; l <= segitiga; l++) {
            for (int m = 1; m <= segitiga-l; m++) {
                System.out.print(" ");
            }
            for (int n = 1; n <= l; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
