package ConditionalJava;

import java.util.Scanner;

public class Derajat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam derajat Celsius: ");
        int suhu = input.nextInt();

        if (suhu <= 0) {
            System.out.println("Suhu " + suhu + " derajat Celsius termasuk kategori BEKU.");
        } else if (suhu >= 1 && suhu <= 10) {
            System.out.println("Suhu " + suhu + " derajat Celsius termasuk kategori DINGIN.");
        } else if (suhu >= 11 && suhu <= 20) {
            System.out.println("Suhu " + suhu + " derajat Celsius termasuk kategori SEJUK.");
        } else if (suhu >= 21 && suhu <= 25) {
            System.out.println("Suhu " + suhu + " derajat Celsius termasuk kategori SEDANG.");
        } else if (suhu >= 26 && suhu <= 99) {
            System.out.println("Suhu " + suhu + " derajat Celsius termasuk kategori PANAS.");
        } else if (suhu >= 100) {
            System.out.println("Suhu " + suhu + " derajat Celsius termasuk kategori MENDIDIH.");
        } else {
            System.out.println("Masukkan suhu dalam derajat Celsius yang valid.");
        }

        // =========================================================================================================

        System.out.print("Input Suhu : ");
        int suhu2 = input.nextInt();

        // membuat objek suhu2 untuk mendapatkan kategori suhu2 dengan memanggil method getCategory
        String category = new Derajat().getCategory(suhu2);

        // menggunakan switch untuk mencetak hasil sesuai dengan kategori suhu2
        switch (category) {
            case "BEKU":
                System.out.println("Suhu " + suhu2 + " derajat Celsius termasuk kategori BEKU.");
                break;
            case "DINGIN":
                System.out.println("Suhu " + suhu2 + " derajat Celsius termasuk kategori DINGIN.");
                break;
            case "SEJUK":
                System.out.println("Suhu " + suhu2 + " derajat Celsius termasuk kategori SEJUK.");
                break;
            case "SEDANG":
                System.out.println("Suhu " + suhu2 + " derajat Celsius termasuk kategori SEDANG.");
                break;
            case "PANAS":
                System.out.println("Suhu " + suhu2 + " derajat Celsius termasuk kategori PANAS.");
                break;
            case "MENDIDIH":
                System.out.println("Suhu " + suhu2 + " derajat Celsius termasuk kategori MENDIDIH.");
                break;
            default:
                System.out.println("suhu2 yang anda masukkan salah");
                break;
        }
    }

    private String getCategory(int suhu2) {
        if (suhu2 <= 0)
            return "BEKU";
        else if (suhu2 >= 1 && suhu2 <= 10)
            return "DINGIN";
        else if (suhu2 >= 11 && suhu2 <= 20)
            return "SEJUK";
        else if (suhu2 >= 21 && suhu2 <= 25)
            return "SEDANG";
        else if (suhu2 >= 26 && suhu2 <= 99)
            return "PANAS";
        else if (suhu2 >= 100)
            return "MENDIDIH";
        else
            return "Invalid";
    }
}
