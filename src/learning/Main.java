package learning;

public class Main {

    public static void main(String[] args) {
        String name ="Suhendri";
        String age ="22 years old";
        String address ="Takengon, Arul Gele. Aceh Tengah";

        System.out.println("Name = " + name);
        System.out.println("Age  = " + age );
        System.out.println("My Address = " + address);

     // variabel Asigment & Deklarasi
            //Variabel Assigment
            int a = 100;
                System.out.printf("Nilai Assigment dari variabel a adalah %d \n",a);

             //Variabel Deklarasi
            int a1;
            a1 = 50;
                System.out.printf("Nilai Deklarasi dari variabel a1 adalah %d \n",a1);

     // Operator Aritmatika
        /* Penjumlahan
           Pengurangan
           Perkalian
           Pembagian
           Modulus
         */

            int b1 = 10;
            int b2 = 5;
            int hasil;

            hasil = b1 + b2; //Operator Aritmatika Penjumlahan
                System.out.printf("%d + %d = %d \n",b1,b2,hasil);

            hasil = b1 - b2; //Operator Aritmatika Pengurangan
                System.out.printf("%d - %d = %d \n",b1,b2,hasil);

            hasil = b1 * b2; //Operator Aritmatika Perkalian
                System.out.printf("%d * %d = %d \n",b1,b2,hasil);

            hasil = b1 / b2; //Operator Aritmatika Pembagian
                System.out.printf("%d / %d = %d \n",b1,b2,hasil);

             int b3 = 7;
             int b4 = 4;
             hasil = b3 % b4; //Operator Aritmatika Modulus
                System.out.printf("%d %% %d = %d \n",b3,b4,hasil);

        //Konveri Tipe data Numeric
            int NilaiInt = 14;
                System.out.println("Nilai Integer adalah = " + NilaiInt);
             //konversi ke tipe data yang lebih besar
            long NilaiLong = NilaiInt;
                System.out.println("Nilai Long adalah = " +NilaiLong);
             //Konversi Ke Tipe data yang lebih kecil
            byte Nilaibyt = (byte)NilaiInt;
                System.out.println("Nilai Byte adalah = " + Nilaibyt);

                //Casting Pembagian
                    int c1 = 10;
                    int c2 = 4;
                    float c3 = (float)c1 / c2;
                        System.out.printf("%d / %d = %f \n",c1,c2,c3);

         //Operator Unary (Decrement dan Increment)
            //Unary adalah Operasi yang dilakukan pada satu variabel

            //Unary + dan -
            int d1 = 10;
                System.out.printf("Ini adalah nilai Unary Plus didepan %d = %d \n",d1,+d1); //ini tidak akan merubah nilai apapun
                System.out.printf("Ini adalah nilai Unary Minus didepan %d = %d \n",d1,-d1);// ini akan merubah nilai menjadi minus

            //Unary dengan Increment dan Decrement
            int d2 = 10;
            d2++;
                System.out.println("Unary dengan '++' didepan akan menjadi = " + d2);

            int d3 = 10;
            d3--;
                System.out.println("Unary dengan '--' didepan akan menjadi = " + d3);

                //prefix dan postfix
                int d4 = 5;
                    System.out.printf("Nilai dengan '++' prefix akan menjadi %d \n",++d4);
                int d5 = 5;
                    System.out.printf("Nilai dengan '++' postfix akan menjadi %d \n",d5++);
                    System.out.println("Setelah postfix dipanggil yang ke 2 kali =" + d5);

                 //Unary boolean dengan ! untuk negasi
                    boolean suhen = true;
                        System.out.println(suhen);
                        System.out.println(!suhen);


    }
}
