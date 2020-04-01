import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите пожалуйста свое предложение: ");
            String str = scanner.nextLine();
            int count = 0;
            char az;
            for (int i = 0; i < str.length(); i++) {
                az = str.charAt(i);
                if (az == ',' || az == '.' || az == '!' || az == '?' || az == '-' || az == ':' || az == ';' || az == '(' || az == ')' || az == '"')
                    count++;
            }
            System.out.println("В строке " + count + " знаков припинания");
        }
    }
}