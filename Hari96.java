package ISC100Hari;

public class Day96 {
    public static void main(String[] args) {
        
        int baris = 5;
        
        for (int i = 0; i  <  baris; i++) {
            for (int j = baris - 1; j  >  i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k  <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int m = 1; m  <  baris; m++) {
            for (int n = 0; n  <  m; n++) {
                System.out.print(" ");
            }
            for (int o = baris - 1; o  >= m; o--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
