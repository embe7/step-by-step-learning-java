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

         //Operator Asigment

            //operator asigment penjumlahan
                int e1 = 100;
                e1 += 10;
                    System.out.println("Nilai e1 adalah =" + e1 );

            //operator asigment pengurangan
                 int e2 = 100;
                 e2 -= 10;
                 System.out.println("Nilai e2 adalah =" + e2 );

            //operator asigment perkalian
                 int e3 = 100;
                  e3 *= 10;
                  System.out.println("Nilai e3 adalah =" + e3 );

            //operator asigment penjumlahan
                int e4 = 100;
                e4 /= 10;
                System.out.println("Nilai e4 adalah =" + e4 );

            //operator asigment penjumlahan
                int e5 = 100;
                e5 %= 10;
                System.out.println("Nilai e5 adalah =" + e5 );

         //Operator Komparasi (Akan Menghasilkan Nilai Dalam Bentuk Bolean)

        System.out.println("----------PERSAMAAN-------");
            int f1,f2;
            f1 = 10;
            f2 = 20;
            boolean HasilKomparasi = (f1 == f2);
                System.out.printf("%d == %d = %s \n",f1,f2,HasilKomparasi);

            int f3,f4;
            f3 = 10;
            f4 = 20;
            HasilKomparasi = (f3 != f4);
                System.out.printf("%d != %d = %s \n",f3,f4,HasilKomparasi);

        int f5,f6;
        f5 = 10;
        f6 = 10;
        HasilKomparasi = (f5 > f6);
        System.out.printf("%d > %d --> %s \n",f5,f6,HasilKomparasi);

            int f7,f8;
            f7 = 10;
            f8 = 20;
            HasilKomparasi = (f7 < f8);
                System.out.printf("%d < %d = %s \n",f7,f8,HasilKomparasi);

            int f9,f10;
            f9 = 10;
            f10 = 20;
            HasilKomparasi = (f9 >= f10);
                System.out.printf("%d >= %d = %s \n",f9,f10,HasilKomparasi);

            int f11,f12;
            f11 = 10;
            f12 = 20;
            HasilKomparasi = (f11 <= f12);
                System.out.printf("%d <= %d = %s \n",f11,f12,HasilKomparasi);



    }
}
