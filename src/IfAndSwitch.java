import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class IfAndSwitch {
    public static void main(String[] args) {
// deklarasi Judul / Tittle dalam bentuk String
        final String Title1 = "Perhitungan Grade Mahasiswa";
        final String Title2 = "..............................";
        final String Title3 = "Penilaian";

        Scanner myInput = new Scanner(System.in); // deklarasi 'myInput' sebagai variable input dari user
        System.out.println(Title1);
        System.out.println(Title2);


        System.out.println("Masukkan NIM : ");
        String myNIM = myInput.nextLine(); // memasukkan input NIM ke variable 'myNIM'
        System.out.println(" Masukkan Nama : ");
        String myName = myInput.nextLine(); // memasukkan input nama ke variable 'myName'
        System.out.println("Masukkan Kelas");
        String myClass = myInput.nextLine(); // memasukkan input kelas ke variable 'myClass'

        System.out.println("\n" + Title3); // Cetak Title3
        System.out.println(Title2); // Cetak Title2

        double nilai; // deklarasi variable 'nilai' sebagai DOUBLE
        String textLulus;

        double[] myScore = new double[4]; // deklarasi variable 'myScore' sebagai ARRAY bertipe DOUBLE
        System.out.println("Nilai Algoritma = ");
        nilai = myInput.nextDouble(); // memasukkan input nilai Algoritma ke variable 'nilai'
        myScore[0] = nilai; //memasukkan isi dari variabel 'nilai' ke dalam ARRAY 'myScore' alamat ke 0

        System.out.println("Nilai Sistem Basis Data");
        nilai = myInput.nextDouble();
        myScore[1] = nilai;// memasukkan isi dari variable 'nilai' ke dalam ARRAY 'myScore' alamat ke 1

        System.out.println("Nilai Aljabar Linear = ");
        nilai = myInput.nextDouble();
        myScore[2] = nilai;// memasukkan isi dari variable 'nilai' ke dalam ARRAY 'myScore' alamat ke 2

        System.out.println("Nilai Math Diskrit = ");
        nilai = myInput.nextDouble();
        myScore[3] = nilai;// memasukkan isi dari variable 'nilai' ke dalam ARRAY 'myScore' alamat ke 3

        System.out.println(" \n Hasil Grade Penilaian = ");
        System.out.println(Title2);

        if(myScore[0] > 70) { // mengecek apakah isi ARRAY 'myScore' alamat index ke 0 lebih besar dari 70
            textLulus = "Lulus";
        } else {
            textLulus = "Gagal";
        }
        System.out.println("Nilai Algoritma Anda " + " = " +myScore[0]+ " " +textLulus);



        if(myScore[1] > 70) { // mengecek apakah isi ARRAY 'myScore' alamat index ke 1 lebih besar dari 70
            textLulus = "Lulus";
        } else {
            textLulus = "Gagal";
        }
        System.out.println("Nilai Sistem Basis Data Anda = " +myScore[1]+ " " +textLulus);


        if(myScore[2] > 70) { // mengecek apakah isi ARRAY 'myScore' alamat index ke 2 lebih besar dari 70
            textLulus = "Lulus";
        } else {
            textLulus = "Gagal";
        }
        System.out.println("Nilai SAljabar Linear Anda = " +myScore[2]+ " " +textLulus);


        if(myScore[3] > 70) { // mengecek apakah isi ARRAY 'myScore' alamat index ke 3 lebih besar dari 70
            textLulus = "Lulus";
        } else {
            textLulus = "Gagal";
        }
        System.out.println("Nilai Math Diskrit Anda = " +myScore[3]+ " " +textLulus);



    }

}
