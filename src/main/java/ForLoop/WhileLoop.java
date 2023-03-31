package ForLoop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // membuat variabel dan scanner
//        boolean running = true;
//        int counter = 0;
//        String jawab;
//        Scanner scan = new Scanner(System.in);
//
//        // melakukan perulangan while selama variable running bernilai true
//        while (running) {
//            System.out.println("Apakah anda ingin keluar?");
//            System.out.print("Jawab [ya/tidak]> ");
//            jawab = scan.nextLine();
//
//            // cek jawabannya, jika "ya" maka mengubah variable running menjadi false dan keluar dari perulangan
//            if (jawab.equalsIgnoreCase("ya")) {
//                running = false;
//            }
//            counter++; // menambah nilai variable counter setiap kali perulangan dilakukan
//        }
//
//        // menampilkan hasil perulangan
//        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");

        //======================================================================================

//        int i = 0;
//        while (i <= 10) {
//            // blok kode yang akan diulang
//            System.out.println("Perulangan ke-" + i);
//            // increment nilai i
//            i++;
//        }
//
//        //=======================================================================================
//        // membuat variabel
//        int j = 0;
//        // melakukan perulangan do-while
//        do {
//        // mencetak pesan "perulangan ke-" dan nilai variabel i ke layar
//            System.out.println("perulangan ke-" + j);
//        // menginkremen nilai variabel i sebanyak 1
//            j++;
//        } while ( j <= 10); // melakukan perulangan hingga nilai variabel i kurang dari atau sama dengan 10

        // =====================================================================================

        for (int k = 1; k <= 5; k++) {
            for (int l = 1; l <= 3; l++) {

                System.out.println("Nilai i: " + k + ", Nilai j: " + l);
            }
        }
    }
}
