package ukl2024;

public class sulit3 {
    public static void main(String[] args) {
        int [] array = {1, 2, 2, 3, 3, 3, 4};
        int target1 = 1;
        int target2 = 2;
        int target3 = 3;
        int target4 = 4;
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target1) {
                count1++;
            }
            if (array[i] == target2) {
                count2++;
            }
            if (array[i] == target3) {
                count3++;
            }
            if (array[i] == target4) {
                count4++;
            }
        }
        System.out.println(target1 + " muncul " + count1 + " kali ");
        System.out.println(target2 + " muncul " + count2 + " kali ");
        System.out.println(target3 + " muncul " + count3 + " kali ");
        System.out.println(target4 + " muncul " + count4 + " kali ");
    }
}
