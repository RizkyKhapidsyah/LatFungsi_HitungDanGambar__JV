package com.rk.lfhdg;

import java.util.Scanner;

public class MenggunakanCaraBiasa {
    public static void main(String[] args) {
        int P, L;
        int S;
        int i, j;

        String Astrk = "* ";
        Scanner InputUser = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("CONTOH 1: MEMBUAT GAMBAR PERSEGI PANJANG (Menggunakan Cara Biasa)");
        System.out.println("-----------------------------------------------------------------");

        Mulai:
        System.out.print("Masukkan Nilai Panjang(P)  : ");
        P = InputUser.nextInt();
        System.out.print("Masukkan Nilai Lebar(L)    : ");
        L = InputUser.nextInt();

        if ((P <= L) || (P <= 0) || (L <= 0)) {
            System.out.println("\nInput Salah!");
        } else {
            System.out.println("\n");

            for (i = 0; i < L; i++) {
                for (j = 0; j < P; j++) {
                    System.out.print(Astrk);
                }
                System.out.print("\n");
            }
        }

        System.out.println("Luas       = " + (P * L) + " cm2");
        System.out.println("Keliling   = " + ((2 * P) + (2 * L)) + " cm");

        System.out.println("\n");

        System.out.println("---------------------------------------------------------------");
        System.out.println("CONTOH 2: MEMBUAT GAMBAR BUJUR SANGKAR (Menggunakan Cara Biasa)");
        System.out.println("---------------------------------------------------------------");

        Mulai:
        System.out.print("Masukkan Nilai Sisi(S)  : ");
        S = InputUser.nextInt();

        System.out.println("\n");

        if (S <= 0) {
            System.out.println("\nInput Salah!");
        } else {
            for (i = 1; i <= S; i++) {
                for (j = 1; j <= S; j++) {
                    System.out.print(Astrk);
                }
                System.out.print("\n");
            }
        }

        System.out.println("Luas       = " + (S * S) + " cm2");
        System.out.println("Keliling   = " + (4 * S) + " cm");

    }
}
