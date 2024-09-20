package ISC100Hari;

import java.util.Arrays;

public class Day19 {
    public static void main(String[] args) {
        
        String[] bulan = {"Mei", "September", "Februari"};
        String[] bulanLain = bulan;
        
        bulanLain[0] = "Oktober";
        
        System.out.println(Arrays.toString(bulan));
        System.out.println(Arrays.toString(bulanLain));
    }
}
