package by.zantovich;

public class ForExample {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 10; i++) {
            if (i % 2 != 0) continue;
            System.out.println("Inside for i=" + i);
            // Do something
            if (i == 6) break;

        }
        returnFromFor(9);
        returnFromFor(10);
        returnFromFor(11);

    }
    static void returnFromFor(int count) {
        for (int i = 0; i < count; i++) {
            if (i == 10) return;
        }
        System.out.println("Count=" + count);
    }

}
