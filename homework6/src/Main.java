public class Main {

    public static void main(String[] args) {
        int a = 31;
        int b = 2;
        int c = 2020;
        if (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 ) {
            if (a >= 1 && a < 31) {
                a = a + 1;
                System.out.println(a + " " + b + " " + c);

            } else if (a == 31) {
                a = 1;
                b = b + 1;
                System.out.println(a + " " + b + " " + c);

            }

        } else if (b == 4 || b == 6 || b == 9 || b == 11) {
            if (a >= 1 && a < 30) {
                a = a + 1;
                System.out.println(a + " " + b + " " + c);

            } else if (a == 30) {
                a = 1;
                b = b + 1;
                System.out.println(a + " " + b + " " + c);
            }


        } else if (b == 2) {
            if (c % 400 == 0 || (c % 100 != 0 && c % 4 == 0)) {
                if (a >= 1 && a < 29) {
                    a = a + 1;
                    System.out.println(a + " " + b + " " + c);

                } else if (a == 29) {
                    a = 1;
                    b = b + 1;
                    System.out.println(a + " " + b + " " + c);
                } else {
                    if (a >= 1 && a < 28) {
                        a = a + 1;
                        System.out.println(a + " " + b + " " + c);

                    } else if (a == 28) {
                        a = 1;
                        b = b + 1;
                        System.out.println(a + " " + b + " " + c);
                    }


                }
            }

        }


        // write your code here
    }
}
