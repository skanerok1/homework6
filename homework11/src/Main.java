import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean sostav = false;
        for(int i = 2; i<a; i++) {
            if ( i % a == 0)
                sostav = true;
        }
        if (sostav = true)
            System.out.println("Данное число является составным");
        else
            System.out.println("Данное число является простым");


	// write your code here
    }
}
