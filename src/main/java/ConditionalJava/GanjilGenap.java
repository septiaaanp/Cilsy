package ConditionalJava;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        System.out.println("========G A N J I L - G E N A P========");
        System.out.println("===================================================");

        // membuat scanner untuk input dari user
        Scanner input = new Scanner(System.in);

        // meminta user untuk memasukkan sebuah bilangan
        System.out.print("Input Bilangan : ");
        int value = input.nextInt();

        // memeriksa apakah bilangan tersebut ganjil atau genap
        if(value % 2 > 0) { // jika sisa bagi bilangan dengan 2 lebih besar dari 0, maka bilangan tersebut ganjil
            System.out.println(value + " merupakan bilangan ganjil");
        } else { // jika sisa bagi bilangan dengan 2 sama dengan 0, maka bilangan tersebut genap
            System.out.println(value + " merupakan bilangan genap");
        }
    }
}
