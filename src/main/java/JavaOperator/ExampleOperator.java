package JavaOperator;

public class ExampleOperator {
    public static void main(String[] args) {
        int value = 8;

//        System.out.println(value++); // Output: 8, karena nilai value ditampilkan terlebih dahulu, kemudian baru diincrement
//        System.out.println(value); // Output: 9, karena nilai value telah diincrement sebelumnya
//        System.out.println(++value); // Output: 10, karena nilai value telah diincrement terlebih dahulu, kemudian ditampilkan
//        System.out.println(value); // Output: 10, karena nilai value belum diincrement sejak baris sebelumnya
//
//        System.out.println(value--);// Output: 10, karena nilai value ditampilkan terlebih dahulu, kemudian baru didecrement
//        System.out.println(value);// Output: 9, karena nilai value telah didecrement sebelumnya
//        System.out.println(--value);// Output: 8, karena nilai value telah didecrement terlebih dahulu, kemudian ditampilkan
//        System.out.println(value);// Output: 8, karena nilai value belum didecrement sejak baris sebelumnya

        // ============================================================================================================
        int value1 = 8;
        int value2 = 4;
        boolean isGreaterThanSix;


        // Operator && dengan short-circuit evaluation
        // Karena value2 > 6 adalah false, value1++ > 6 tidak akan dievaluasi, sehingga value1 tetap 8
//        isGreaterThanSix = (value2 > 6) && (value1++ > 6);
//        System.out.println(value1); // Output: 8
//        System.out.println(value2); // Output: 4
//        System.out.println(isGreaterThanSix); // Output: false
//
//        // Operator & tanpa short-circuit evaluation
//        // Karena value2 > 6 adalah false, value1++ > 6 tetap akan dievaluasi, sehingga value1 akan menjadi 9
//        isGreaterThanSix = (value2 > 6) & (value1++ > 6);
//        System.out.println(value1); // Output: 9
//        System.out.println(value2); // Output: 4
//        System.out.println(isGreaterThanSix); // Output: false

        // Operator || dengan short-circuit evaluation
        // Karena value2 > 6 adalah false, value1++ > 6 tetap akan dievaluasi, sehingga value1 akan menjadi 9
        isGreaterThanSix = (value2 > 6) || (value1++ > 6);
        System.out.println(value1); // Output: 9
        System.out.println(value2); // Output: 4
        System.out.println(isGreaterThanSix); // Output: true

        // Operator | tanpa short-circuit evaluation
        // Karena value2 > 6 adalah false, value1++ > 6 tetap akan dievaluasi, sehingga value1 akan menjadi 10

        isGreaterThanSix = (value2 > 6) | (value1++ > 6);
        System.out.println(value1); // Output: 10
        System.out.println(value2); // Output: 4
        System.out.println(isGreaterThanSix); // Output: true
//
//        // ============================================================================================================
//
        int Ten = 10;
        int Twenty = 20;
        int Thirty = 30;
        boolean bValue;
        int iValue;

//        bValue = (Thirty == Twenty + Ten) ? true: false;
//        System.out.println( "The boolean value of the variable 'bValue' is : " +  bValue ); //true

        iValue = ((Thirty > Twenty + Ten)) ? 50: 100;
        System.out.println( "The int Value of the variable iValue is : " + iValue ); //50

//        //This is a use of Not Logical Operator
//        iValue = (!(Thirty == Twenty + Ten)) ? 50: 100;
//        System.out.println( "The int Value of the variable iValue is : " + iValue ); //100	}}

    }
}
