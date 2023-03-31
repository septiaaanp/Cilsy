package ForLoop;

public class JavaForLoop {
    public static void main(String[] args) {
        for (int hitungan = 1; hitungan <= 5; hitungan++) {
            System.out.println("*****");
        }

    // ==================================================================

        // membuat array
        int angka[] = {3,1,42,24,12};

        // menggunakan perulangan For each untuk menampilkan angka
        for( int x : angka ) {
            System.out.print(x + " ");
        }
//
//
    // ============================================================
        // membuat array
        String nama[] = {"budi","wahyu","syaiful", "anwar"};

        // menggunakan perulangan For each untuk menampilkan angka
        for( String x : nama ){
            System.out.println(x + " ");
        }

//
//    // ===========================================================
//        for (int i = 1; i <= 5; i++) { // melakukan iterasi sebanyak 5 kali, dimulai dari i = 1 dan berakhir pada i = 5
//            for (int j = 1; j <= i; j++) { // melakukan iterasi sebanyak i kali pada setiap baris
//                System.out.print("*"); // mencetak karakter "*"
//            }
//            System.out.println(); // berpindah ke baris baru setelah mencetak bintang pada setiap baris
//        }

    }
}
