import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int marks[] = {100, 123, 31, 0, 1, 0, 1, 9, 444, 1};
        System.out.println(Arrays.toString(marks));
        boolean go = true;
        while (go) {
            go = false;
            for (int i = 1; i < marks.length; i++) {
                if (marks[i] > marks[i - 1]) {
                    int a = marks[i];
                    marks[i] = marks[i - 1];
                    marks[i - 1] = a;
                    go = true;
                }
            }

        }
        System.out.println(Arrays.toString(marks));


    }
}

