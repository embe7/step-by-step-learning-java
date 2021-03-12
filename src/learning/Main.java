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
    }
}
