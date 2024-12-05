package ukl2024;

import java.util.Scanner;

public class sulit1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int nilai = 0, total = 0;

        System.out.println("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa ke- " + i);
            nilai = input.nextInt();
            total += nilai;
        }

        for (int j = 1; j <= jumlahSiswa; j++) {
            System.out.print(nilai);
            if (j < jumlahSiswa) {
                System.out.print(" + ");
            } else {
                System.out.println(" = " + total);
            }

        }
        
        double mean = total / jumlahSiswa;
        System.out.println("Jumlah siswa: " + jumlahSiswa);
        System.out.println("Rata-rata: " + mean);
    }
}
