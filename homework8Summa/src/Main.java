import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для рассчета суммы: ");
        int num = scanner.nextInt();
        System.out.println((num % 10) + (num / 10) % 10 + (num / 100));
    }
}
