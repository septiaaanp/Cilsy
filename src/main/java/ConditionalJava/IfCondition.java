package ConditionalJava;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        int belanja = 0;
        Scanner scan = new Scanner(System.in);
        // mengambil input
        System.out.print("Total Belanjaan: Rp ");
        belanja = scan.nextInt();
        // cek apakah dia belanja di atas 100000
        if ( belanja > 100000 ) {
            System.out.println("Selamat, anda mendapatkan hadiah!");
        }
        System.out.println("Terima kasih...");
    }
}
