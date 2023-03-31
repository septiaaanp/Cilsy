package Cilsy;

public class LatihanJava1 {

    //CONTOH PUBLIC METHOD
    public int myPublicVar; // public variable
    public void myPublicMethod() { // public method
        System.out.println("This is a public method.");
    }


    //CONTOH PRIVATE METHOD
    private int myPrivateVar; // private variable
    private void myPrivateMethod() { // private method
        System.out.println("This is a private method.");
    }

    //CONTOH PROTECTED METHOD
    protected String name;
    protected void introduce() {
        System.out.println("Hello, my name is " + name);
    }

    //CONTOH RETURN VOID tipe data kosong yang tidak mengembalikan nilai apapun
    public void printHello() {
        System.out.println("Hello!");
    }
    //CONTOH RETURN INT tipe data integer yang mengembalikan nilai integer
    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
    //CONTOH RETURN DOUBLE tipe data yang mengembalikan nilai desimal
    public double divideNumbers(double a, double b) {
        double result = a / b;
        return result;
    }
    //CONTOH RETURN STRING tipe data yang mengembalikan nilai string
    public String getName() {
        String name = "John";
        return name;
    }
    //CONTOH RETURN BOOLEAN tipe data yang mengembalikan nilai boolean (true/false)
    public boolean isEven(int num) {
        if(num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //CONTOH PROPERTY TYPE STRING
    private String text; // mendeklarasikan variabel text dengan tipe data String
    public String getText(){ // membuat method getText dengan tipe data kembalian String
        return text; // mengembalikan nilai dari variabel text
    }
    public void setText(){ // membuat method setText dengan tipe data void
        String text2 = "text2"; // contoh local variable
        this.text = "latihan cilsy"; // memberikan nilai "text" pada variabel text menggunakan kata kunci this
    }

    public static void main(String[] args) {
        LatihanJava1 dp = new LatihanJava1(); // membuat objek dari kelas LatihanJava1 dengan nama variabel dp
        dp.setText(); // memanggil method setText dari objek dp
        System.out.println("text : " + dp.getText()); // menampilkan nilai dari variabel text menggunakan method getText dari objek dp



    }
}
