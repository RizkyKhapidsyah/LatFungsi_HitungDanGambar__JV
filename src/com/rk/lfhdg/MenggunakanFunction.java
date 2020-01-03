package com.rk.lfhdg;

import java.util.Scanner;

public class MenggunakanFunction {
    private static String Astrk = "* ";

    public static void main(String[] args) {
        Scanner InputUser = new Scanner(System.in);
        int P, L, S;

        System.out.println("---------------------------------------------------------------");
        System.out.println("CONTOH 1: MEMBUAT GAMBAR PERSEGI PANJANG (Menggunakan Function)");
        System.out.println("---------------------------------------------------------------");
        System.out.print("Masukkan Nilai Panjang(P)  : ");
        P = InputUser.nextInt();
        System.out.print("Masukkan Nilai Lebar(L)    : ");
        L = InputUser.nextInt();

        Gambar_PersegiPanjang(P, L);
        Luas_PersegiPanjang(P, L);
        Keliling_PersegiPanjang(P, L);

        System.out.println("\n-------------------------------------------------------------");
        System.out.println("CONTOH 2: MEMBUAT GAMBAR BUJUR SANGKAR (Menggunakan Function)");
        System.out.println("-------------------------------------------------------------");
        System.out.print("Masukkan Nilai Sisi(S)  : ");
        S = InputUser.nextInt();

        Gambar_BujurSangkar(S);
        Luas_BujurSangkar(S);
        Keliling_BujurSangkar(S);
    }

    public static void Gambar_PersegiPanjang(int Pparam, int Lparam) {
        System.out.println("\n");

        if ((Pparam <= Lparam) || (Pparam <= 0) || (Lparam <= 0)) {
            System.out.println("\nInput Salah!");
        } else {
            System.out.println("\n");

            for (int i = 0; i < Lparam; i++) {
                for (int j = 0; j < Pparam; j++) {
                    System.out.print(Astrk);
                }
                System.out.print("\n");
            }
        }
    }

    public static int Luas_PersegiPanjang(int Pparam, int Lparam) {
        int Hasil = Pparam * Lparam;
        System.out.println("Luas      = " + Hasil + " cm2");
        return Hasil;
    }

    public static int Keliling_PersegiPanjang(int Pparam, int Lparam) {
        int Hasil = (2 * Pparam) + (2 * Lparam);
        System.out.println("Keliling  = " + Hasil + " cm");
        return Hasil;
    }

    public static void Gambar_BujurSangkar(int Sparam) {
        System.out.println("\n");

        if (Sparam <= 0) {
            System.out.println("\nInput Salah!");
        } else {
            for (int i = 1; i <= Sparam; i++) {
                for (int j = 1; j <= Sparam; j++) {
                    System.out.print(Astrk);
                }
                System.out.print("\n");
            }
        }
    }

    public static int Luas_BujurSangkar(int Sparam) {
        int Hasil = Sparam * Sparam;
        System.out.println("Luas      = " + Hasil + " cm2");
        return Hasil;
    }

    public static int Keliling_BujurSangkar(int Sparam) {
        int Hasil = 4 * Sparam;
        System.out.println("Keliling  = " + Hasil + " cm");
        return Hasil;
    }

}
