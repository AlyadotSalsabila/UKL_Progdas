package ukl2024;

import java.util.Scanner;

public class mudah3 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    System.out.println("Inputkan jumlah: ");
    int a = input.nextInt();

        do {
                if (a % 3 == 0) {
                    System.out.println(a + ". saya angkatan 33");
                   } else if (a % 3 == 1) {
                    System.out.println(a + ". saya anak wikusama");
                   } else {
                    System.out.println(a + ". saya anak moklet");
                   } a--;
            } 
        while (a >= 2);
        System.out.println("1. saya senang");
        
    }
}
