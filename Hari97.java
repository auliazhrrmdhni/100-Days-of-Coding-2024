package ISC100Hari;

import java.util.Scanner;

public class Day97 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int n = scanner.nextInt();

        System.out.println("Bilangan prima dari 1 sampai " + n + " adalah:");

        for (int i = 2; i <= n; i++) {
            if (prima(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean prima(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
