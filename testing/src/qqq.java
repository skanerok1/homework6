import java.util.Scanner;

public class qqq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        if(input.length() != 0) {
            count++;
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) = ' ') {
                    count++;
                }
            }
        }
    }
}
