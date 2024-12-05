package ukl2024;

import java.util.Scanner;

public class Mudah1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
        
        int biayaJarakBiasa = 4250;
        int biayaPlus10 = 6000;
        int biayaVolumePlus100 = 50000;
        int jarakMax = 10;
        int volumeMax = 100;

        System.out.println("Masukkan jarak tempuh: ");
        int jarak = input.nextInt();
        System.out.println("Masukkan berat paket: ");
        int berat = input.nextInt();
        System.out.println("Masukkan panjang paket: ");
        int panjang = input.nextInt();
        System.out.println("Masukkan lebar paket: ");
        int lebar = input.nextInt();
        System.out.println("Masukkan tinggi paket: ");
        int tinggi = input.nextInt();

        int volume = panjang * lebar * tinggi;

        if (jarak <= jarakMax) {
            int harga1 = biayaJarakBiasa * berat;
            if (volume > volumeMax) {
                int harga1plus = harga1 + biayaVolumePlus100;
                System.out.println("Biaya total pengiriman adalah Rp" + harga1plus);
            } else {
                System.out.println("Biaya total pengiriman adalah Rp" + harga1);
            }
        } else {
            int harga2 = biayaPlus10 * berat;
            if (volume > volumeMax) {
                int harga2plus = harga2 + biayaVolumePlus100;
                System.out.println("Biaya total pengiriman adalah Rp" + harga2plus);
            } else {
                System.out.println("Biaya total pengiriman adalah Rp" + harga2);
            }
    }
}
}
