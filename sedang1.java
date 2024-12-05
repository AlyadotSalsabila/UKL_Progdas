package ukl2024;

import java.util.Scanner;

public class sedang1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int a;
        int hasil = 1;

        System.out.println("Masukkan bilangan bulat positif: ");
        int angka = input.nextInt();

        if (angka > 0) {
            for (a = 1; a <= angka; a++) {
                System.out.print(a);
                if (a < angka) {
                    System.out.print(" x ");
                } else {
                    System.out.print(" = ");
                }
                hasil *= a;
            }
            System.out.println(hasil);
            System.out.println("Hasil dari " + angka + "! adalah " + hasil);

        } else {
            System.out.println("Inputan salah");
        }

    }
}
