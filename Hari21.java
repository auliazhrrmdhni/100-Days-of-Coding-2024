package ISC100Hari;

import java.util.Arrays;

public class Day21 {
    public static void main(String[] args){
        Short[] harga = {null};
        Short[] price = harga;
        
        price[0]=1500;
        
        System.out.println(Arrays.toString(price));
    }
}
