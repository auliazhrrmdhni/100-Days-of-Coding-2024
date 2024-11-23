package ISC100Hari;

public class Day83 {
    public static void main(String[] args) {
        
        String hewan[] = new String[4];
        
        hewan[0] = "Kucing";
        hewan[1] = "Beruang";
        hewan[2] = "Bebek";
        hewan[3] = "Koala";
        
        for (int i = 0; i < hewan.length; i++) {
            System.out.println("Nama hewan pada index ke-" + i + ": " + hewan[i]);
        }
    }
}
