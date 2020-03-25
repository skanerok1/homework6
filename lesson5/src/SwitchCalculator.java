
import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        int value1 = readNumber("Enter value 1: ");
        int value2 = readNumber("Enter value 2: ");

        System.out.println("value 1 = " + value1);
        System.out.println("value 2 = " + value2);

        System.out.println(doOperation(value1, value2));
    }


    static int readNumber(String msg) {
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();


    }

    static double doOperation(int v1, int v2) {
        int operation = selectOperation();
        double resultOfOperation = 0;
        switch (operation) {
            case 1: {
                resultOfOperation = v1 + v2;
                break;
            }
            case 2: {
                resultOfOperation = v1 - v2;
                break;
            }
            case 3: {
                resultOfOperation = v1 * v2;
                break;
            }
            case 4: {
                resultOfOperation = (double) v1 / v2;
                break;
            }
            case 5: {
                resultOfOperation = v1 % v2;
                break;
            }
            default: {
                System.out.println("Unknown operation");
            }


        }
        return resultOfOperation;
    }


        static int selectOperation () {
            System.out.println("1: +");
            System.out.println("2: -");
            System.out.println("3: *");
            System.out.println("4: /");
            System.out.println("5: %");
            return readNumber("Please select operation:");

        }

4
}
