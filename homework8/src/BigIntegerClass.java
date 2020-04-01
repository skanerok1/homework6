import java.math.BigInteger;
import java.io.*;
import java.util.Scanner;


public class BigIntegerClass {
    public static BigInteger fact (int n) {
        BigInteger bi = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            bi = bi.multiply(BigInteger.valueOf(i));
        }


        return bi;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите N");
        int n=sc.nextInt();
        System.out.println(fact(n));

    }54




}

