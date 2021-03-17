package learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Membuat User Input..

        System.out.println("==== Silahkan Input Username ====");
        Scanner UserName = new Scanner(System.in);
        String Nama;

        System.out.print("Input Nama = ");
        Nama = UserName.next();
        System.out.println("Selamat datang " + Nama);

        // variabel Asigment & Deklarasi
        //Variabel Assigment
        int a = 100;
        System.out.printf("Nilai Assigment dari variabel a adalah %d \n", a);

        //Variabel Deklarasi
        int a1;
        a1 = 50;
        System.out.printf("Nilai Deklarasi dari variabel a1 adalah %d \n", a1);

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
        System.out.printf("%d + %d = %d \n", b1, b2, hasil);

        hasil = b1 - b2; //Operator Aritmatika Pengurangan
        System.out.printf("%d - %d = %d \n", b1, b2, hasil);

        hasil = b1 * b2; //Operator Aritmatika Perkalian
        System.out.printf("%d * %d = %d \n", b1, b2, hasil);

        hasil = b1 / b2; //Operator Aritmatika Pembagian
        System.out.printf("%d / %d = %d \n", b1, b2, hasil);

        int b3 = 7;
        int b4 = 4;
        hasil = b3 % b4; //Operator Aritmatika Modulus
        System.out.printf("%d %% %d = %d \n", b3, b4, hasil);

        //Konveri Tipe data Numeric
        int NilaiInt = 14;
        System.out.println("Nilai Integer adalah = " + NilaiInt);
        //konversi ke tipe data yang lebih besar
        long NilaiLong = NilaiInt;
        System.out.println("Nilai Long adalah = " + NilaiLong);
        //Konversi Ke Tipe data yang lebih kecil
        byte Nilaibyt = (byte) NilaiInt;
        System.out.println("Nilai Byte adalah = " + Nilaibyt);

        //Casting Pembagian
        int c1 = 10;
        int c2 = 4;
        float c3 = (float) c1 / c2;
        System.out.printf("%d / %d = %f \n", c1, c2, c3);

        //Operator Unary (Decrement dan Increment)
        //Unary adalah Operasi yang dilakukan pada satu variabel

        //Unary + dan -
        int d1 = 10;
        System.out.printf("Ini adalah nilai Unary Plus didepan %d = %d \n", d1, +d1); //ini tidak akan merubah nilai apapun
        System.out.printf("Ini adalah nilai Unary Minus didepan %d = %d \n", d1, -d1);// ini akan merubah nilai menjadi minus

        //Unary dengan Increment dan Decrement
        int d2 = 10;
        d2++;
        System.out.println("Unary dengan '++' didepan akan menjadi = " + d2);

        int d3 = 10;
        d3--;
        System.out.println("Unary dengan '--' didepan akan menjadi = " + d3);

        //prefix dan postfix
        int d4 = 5;
        System.out.printf("Nilai dengan '++' prefix akan menjadi %d \n", ++d4);
        int d5 = 5;
        System.out.printf("Nilai dengan '++' postfix akan menjadi %d \n", d5++);
        System.out.println("Setelah postfix dipanggil yang ke 2 kali =" + d5);

        //Unary boolean dengan ! untuk negasi
        boolean suhen = true;
        System.out.println(suhen);
        System.out.println(!suhen);

        //Operator Asigment

        //operator asigment penjumlahan
        int e1 = 100;
        e1 += 10;
        System.out.println("Nilai e1 adalah =" + e1);

        //operator asigment pengurangan
        int e2 = 100;
        e2 -= 10;
        System.out.println("Nilai e2 adalah =" + e2);

        //operator asigment perkalian
        int e3 = 100;
        e3 *= 10;
        System.out.println("Nilai e3 adalah =" + e3);

        //operator asigment penjumlahan
        int e4 = 100;
        e4 /= 10;
        System.out.println("Nilai e4 adalah =" + e4);

        //operator asigment penjumlahan
        int e5 = 100;
        e5 %= 10;
        System.out.println("Nilai e5 adalah =" + e5);

        //Operator Komparasi (Akan Menghasilkan Nilai Dalam Bentuk Bolean)

        System.out.println("----------PERSAMAAN-------");
        int f1, f2;
        f1 = 10;
        f2 = 20;
        boolean HasilKomparasi = (f1 == f2);
        System.out.printf("%d == %d = %s \n", f1, f2, HasilKomparasi);

        int f3, f4;
        f3 = 10;
        f4 = 20;
        HasilKomparasi = (f3 != f4);
        System.out.printf("%d != %d = %s \n", f3, f4, HasilKomparasi);

        int f5, f6;
        f5 = 10;
        f6 = 10;
        HasilKomparasi = (f5 > f6);
        System.out.printf("%d > %d --> %s \n", f5, f6, HasilKomparasi);

        int f7, f8;
        f7 = 10;
        f8 = 20;
        HasilKomparasi = (f7 < f8);
        System.out.printf("%d < %d = %s \n", f7, f8, HasilKomparasi);

        int f9, f10;
        f9 = 10;
        f10 = 20;
        HasilKomparasi = (f9 >= f10);
        System.out.printf("%d >= %d = %s \n", f9, f10, HasilKomparasi);

        int f11, f12;
        f11 = 10;
        f12 = 20;
        HasilKomparasi = (f11 <= f12);
        System.out.printf("%d <= %d = %s \n", f11, f12, HasilKomparasi);

        //Operator Logika (Oprasi yang dapat kita lakukan pada tipe data Boolean
        //OR,AND,XOR,NOT

        boolean g1, g2, g3;
        System.out.println("==== OR (||) =====");
        g1 = false;
        g2 = false;
        g3 = (g1 || g2);
        System.out.println(g1 + " || " + g2 + " = " + g3);

        g1 = false;
        g2 = true;
        g3 = (g1 || g2);
        System.out.println(g1 + " || " + g2 + " = " + g3);

        g1 = true;
        g2 = false;
        g3 = (g1 || g2);
        System.out.println(g1 + " || " + g2 + " = " + g3);

        g1 = true;
        g2 = true;
        g3 = (g1 || g2);
        System.out.println(g1 + " || " + g2 + " = " + g3);


        System.out.println("==== AND (&&) =====");
        g1 = false;
        g2 = false;
        g3 = (g1 && g2);
        System.out.println(g1 + " && " + g2 + " = " + g3);

        g1 = false;
        g2 = true;
        g3 = (g1 && g2);
        System.out.println(g1 + " && " + g2 + " = " + g3);

        g1 = true;
        g2 = false;
        g3 = (g1 && g2);
        System.out.println(g1 + " && " + g2 + " = " + g3);

        g1 = true;
        g2 = true;
        g3 = (g1 && g2);
        System.out.println(g1 + " && " + g2 + " = " + g3);

        System.out.println("==== XOR (^) =====");
        g1 = false;
        g2 = false;
        g3 = (g1 ^ g2);
        System.out.println(g1 + " ^ " + g2 + " = " + g3);

        g1 = false;
        g2 = true;
        g3 = (g1 ^ g2);
        System.out.println(g1 + " ^ " + g2 + " = " + g3);

        g1 = true;
        g2 = false;
        g3 = (g1 ^ g2);
        System.out.println(g1 + " ^ " + g2 + " = " + g3);

        g1 = true;
        g2 = true;
        g3 = (g1 ^ g2);
        System.out.println(g1 + " ^ " + g2 + " = " + g3);

        System.out.println("==== Negasi (!) ====");
        g1 = true;
        g3 = !g1;
        System.out.println(g1 + " ---> " + g3);

        g1 = false;
        g3 = !g1;
        System.out.println(g1 + " ---> " + g3);

        //Latihan Membuat Aplikasi Menghitung Luas Persegi Panjang

        System.out.println("==== Aplikasi Menghitung Luas Persegi Panjang ====");

        Scanner UserInput = new Scanner(System.in);
        int panjang;
        int lebar;
        int luas;

        System.out.print("Input Panjang = ");
        panjang = UserInput.nextInt();
        System.out.print("Input Lebar = ");
        lebar = UserInput.nextInt();
        luas = panjang * lebar;
        System.out.println("luas = " + luas);

        //Latihan Operasi Logika

        //Membuat Aplikasi Menebak Angka

        Scanner tebakAngka = new Scanner(System.in);

        int nilaiBenar = 10;
        int tebakan;
        boolean statusTebakan;

        System.out.print("Masukkan Nilai Tebakan = ");
        tebakan = tebakAngka.nextInt();

        statusTebakan = (nilaiBenar == tebakan);
        System.out.println("Hasil = " + statusTebakan);

        // IF Else Statement

        int h = 10;

        if (h == 11) {
            System.out.println("Ini adalah jalur true");
        } else {
            System.out.println("Ini adalah jalur false");
        }

        // IF Else IF Statement

        String i = "suhendri";

        if (i == "suhendri") {
            System.out.println("Ini adalah aksi satu");
        } else if (i == "fahri") {
            System.out.println("ini adalah aksi dua");
        } else {
            System.out.println("ini adalah aksi tiga");
        }

        // IF Bersarang

        int j1 = 10;
        int j2 = 7;

        if (j2 == 7){
            if (j1 == 10){
                System.out.println("jawaban j1 dan j2 benar");
            }else {
                System.out.println("hanya j1 benar j2 salah");
            }
        }else{
            System.out.println("kedua jawaban salah");
        }

        //Switch Case
        String siswa;
        Scanner inputSiswa = new Scanner(System.in);

        System.out.print("Masukkan Nama Siswa = ");

                siswa = inputSiswa.next();

                switch (siswa){
                    case "suhendri":
                        System.out.println(siswa + " Hadir buk" );
                        break;
                     case "fahri":
                         System.out.println(siswa + " Hadir buk");
                         break;
                    default:
                        System.out.println(siswa + "Tidak hadir buk");
                }

        //Latihan Membuat Kalkulator Menggunakan IF ELSE

        Scanner inputBilangan = new Scanner(System.in);

                float bilA;
                float bilB;
                float hasilKalkulator;
                char operator;

        System.out.print("Masukkan bilangan A = ");
        bilA = inputBilangan.nextFloat();

        System.out.print("Masukkan Operator = ");
        operator = inputBilangan.next().charAt(0);

        System.out.print("Masukkan Bilangan B = ");
        bilB = inputBilangan.nextFloat();

        System.out.println(bilA + "" + operator + " " + bilB);

        if (operator == '+'){
            //penjumlahan
            hasilKalkulator = bilA + bilB;
            System.out.println("Hasil = " + hasilKalkulator);
        }else if (operator == '-'){
            //pengurangan
            hasilKalkulator = bilA - bilB;
            System.out.println("Hasil = " + hasilKalkulator);
        }else if (operator == '*'){
            //perkalian
            hasilKalkulator = bilA * bilB;
            System.out.println("Hasil = " + hasilKalkulator);
        }else if (operator == '/'){
            //pembagian
            hasilKalkulator = bilA / bilB;
            System.out.println("Hasil = " + hasilKalkulator);
        }else {
            System.out.println("Operator Tidak ditemukan");
        }

    // Latihan Membuat Kalkulator Menggunakan Sweat Case

        Scanner inputBilangan2 = new Scanner(System.in);

        float bilC;
        float bilD;
        float hasil2;
        String operator2;

        System.out.print("Masukkan Bilangan pertama = ");
        bilC = inputBilangan2.nextFloat();

        System.out.print("Masukkan Operator = ");
        operator2 = inputBilangan2.next();

        System.out.print("Masukkan Bilangan kedua = ");
        bilD = inputBilangan2.nextFloat();

        System.out.println(bilC + " " + operator2 + " " + bilD);

        switch (operator2){
            case "+":
                //penjumlahan
                hasil2 = bilC + bilD;
                System.out.println("Hasil = " + hasil2);
                break;

            case "-":
                //pengurangan
                hasil2 = bilC - bilD;
                System.out.println("Hasil = " + hasil2);
                break;

            case "*":
                //perkalian
                hasil2 = bilC * bilD;
                System.out.println("Hasil = " + hasil2);
                break;

            case "/":
                //pembagian
                hasil2 = bilC / bilD;
                System.out.println("Hasil = " + hasil2);
                break;

            default:
                System.out.println("operator " + operator2 + " Tidak Ditemukan");
        }


    //While Loop

        int k = 0;
        boolean kondisi = true;

        System.out.println("Ini Adalah Program While");

        while (kondisi){
            System.out.println("Ini pengulangan yang ke-" + k);
            k++;
            if (k == 10){
                kondisi = false;
            }
        }
        System.out.println("ini adalah akhir perulangan");

        // Latihan Program Kalkulatar IF

        Scanner test = new Scanner(System.in);

        float bilX;
        float bilY;
        float hasilZ;
        char operatorX;
        boolean ulang = true;

        System.out.println("Ini adalah Program Tes Kalkulator menggunakan While Looping");

        System.out.print("Masukkan Bilangan = ");
        bilX = test.nextFloat();

        System.out.print("Masukkan Operator Aritmatika = ");
        operatorX = test.next().charAt(0);

        System.out.print("Masukkan Bilangan Ke-2 = ");
        bilY = test.nextFloat();

        System.out.println(bilX + " " + operatorX + " " + bilY + " =");

        if (operatorX == '+'){
            //penjumlahan
            hasilZ = bilX + bilY;
            System.out.println("Hasil = " + hasilZ);
        }else if (operatorX == '-'){
            //pengurangan
            hasilZ = bilX - bilY;
            System.out.println("Hasil = " + hasilZ);
        }else if (operatorX == '*'){
            //perkalian
            hasilZ = bilX * bilY;
            System.out.println("Hasil = " + hasilZ);
        }else if (operatorX == '/'){
            //pembagian
            hasilZ = bilX / bilY;
            System.out.println("Hasil = " + hasilZ);
        }else{
            System.out.println("operator tidak ditemukan");
        }

    //Do While
        int l = 0;
        boolean kondisi1 = true;

        do {
            l++;
            System.out.println("do while ke-" + l);
            if (l == 10){
                kondisi1 = false;
            }
        }while (kondisi1);

        System.out.println("ini adalah akhir program");

    // Mengulang While Loop

        int k1 = 0;
        boolean kondisii = true;

        while (k1 == 0){
            System.out.println("ini adalah while loop k1 yang ke " + k1);
            k1++;
            if (k1 == 10){
                kondisii = false;
            }
        }
        System.out.println("Ini adalah Akhir Program");


        }

    }