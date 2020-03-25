package by.zantovich;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        int[] ints = new int[10];

        for (int i = 0; i < ints.length; i++) {
            Random random = new Random();
            ints[i] = random.nextInt(100);

        }
        System.out.println(Arrays.toString(ints));

        System.out.println(searchNumber(5, ints));

        Arrays.sort(ints);
        System.out.println();
    }

    static int searchNumber(int target, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }

}
