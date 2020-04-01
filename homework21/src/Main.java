public class Main {

    static double t, t1 = 0, t2 = 0;


    static String str = "1 java speed ";
    static int n = 2;

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(str);

        for (int i = 0; i < 99; i++) {
            t = System.currentTimeMillis();
            str += n + " java speed ";
            n++;
            t1 += System.currentTimeMillis() - t;
        }
        int n = 2;
        for (int i = 0; i < 99; i++) {
            t = System.currentTimeMillis();
            stringBuilder.append(n + " java speed ");
            n++;
            t2 += System.currentTimeMillis() - t;
        }
        System.out.println(str);
        System.out.println("String max speed: " + t1);
        System.out.println(stringBuilder);
        System.out.println("StringBuilder max speed: " + t2);
    }
    }
