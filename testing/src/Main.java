import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvod");
        String input = sc.nextLine();
        int count = 0;
        if (input.length() != 0) {
            for(int i = 0; i < input.length(); i++) {
                count++;
                if(input.charAt(i) = ' ') {
                    count++;
                }
            }
        }
    }

}