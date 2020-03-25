import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        long i = n.nextLong(); //
        String s =  Long.toString(i % 10);
        i = i / 10;
        byte t = 1;
        for (long k = i; i / 10 != 0; k = i) {
            s +=i % 10;
            i = i/10;
            if (t == 2) {
                s += (" ");
                t = 0;
            }
            else t++;
        }
        s += i;
        System.out.println(s);

        for (i = s.length()-1;i>=0;i--)
            System.out.println();

	// write your code here
    }
}
