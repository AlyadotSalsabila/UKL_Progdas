package ukl2024;

import java.util.Random;
import java.util.Scanner;

public class sedang3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random rand = new Random();

        boolean teruskuis = true;

        do {
            int bilanganPertama = rand.nextInt(10) + 1; //bilangan acak antara 0 - 10
            int operator = rand.nextInt (3); //nilai acak 0, 1, 2
            int bilanganKedua = rand.nextInt(10) + 1;

            
            System.out.print(bilanganPertama + " " + pilihOperator(operator) + " " + bilanganKedua + " = ");
            int jawaban = input.nextInt();

            int benar = hitungHasil(bilanganPertama, bilanganKedua, pilihOperator(operator));
            if (jawaban == benar) {
                System.out.println("Jawaban benar!");
            } else {
                System.out.println("Jawaban salah, yang benar adalah " + benar);
            }

            System.out.print("Apakah anda ingin melanjutkan kuis? (y/n) : ");
            char lanjutTidak = input.next().charAt(0);
            if (lanjutTidak == 'n' || lanjutTidak == 'N') {
                teruskuis = false;
                System.out.println("Sampai jumpa lagi!");
            } else{
                teruskuis = true;
            }
        } while (teruskuis == true);
    }

static char pilihOperator(int operator) { 
    switch (operator) { 
        case 0: 
        return '*'; // Perkalian 
        case 1: 
        return '/'; // Pembagian 
        case 2: 
        return '%'; // Modulus 
        default: 
        return ' ';  // Tidak mungkin terjadi, tetapi sebagai pengaman
        }
    }

static int hitungHasil(int bilanganPertama, int bilanganKedua, char operator) {
        switch (operator) {
            case '*' :
            return bilanganPertama * bilanganKedua;
            case '/' :
            return bilanganPertama / bilanganKedua;
            case '%' :
            return bilanganPertama % bilanganKedua;
            default :
            return 0;
        }
    
}
}