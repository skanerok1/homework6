public class Main {
public static void main(String[] args) {
        int val = 911;
        int sum1 = 0;
        int a, b, c;
        while (val % 10 != 0) {
        while (val != 0) {
        sum1 += val % 10;
        val = val / 10;
        }
        System.out.println();

        System.out.println("Sum of digits of number = " + sum1);
        }
        }
        }

