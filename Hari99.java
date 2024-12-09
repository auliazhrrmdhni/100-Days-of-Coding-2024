package ISC100Hari;

import java.util.Scanner;

public class Day99 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Angka1: ");
        int angka1 = scanner.nextInt();
        
        
        System.out.println("Operator: ");
        char operator = scanner.next().charAt(0);
        
        System.out.println("Angka2: ");
        int angka2 = scanner.nextInt();

        double hasil;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.printf("Hasil: %d %c %d = %.2f%n", angka1, operator, angka2, hasil);
                break;

            case '-':
                hasil = angka1 - angka2;
                System.out.printf("Hasil: %d %c %d = %.2f%n", angka1, operator, angka2, hasil);
                break;

            case '*':
                hasil = angka1 * angka2;
                System.out.printf("Hasil: %d %c %d = %.2f%n", angka1, operator, angka2, hasil);
                break;

            case '/':
                if (angka2 != 0) {
                    hasil = (double) angka1 / angka2;
                    System.out.printf("Hasil: %d %c %d = %.2f%n", angka1, operator, angka2, hasil);
                } else {
                    System.out.println("Kesalahan: angka kedua tidak boleh nol.");
                }
                break;

            default:
                System.out.println("Kesalahan: Operator tidak valid. Gunakan (+, -, *, /).");
        }
    }
}
