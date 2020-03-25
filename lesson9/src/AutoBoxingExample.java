public class AutoBoxingExample {
    public static void main(String[] args) {
        boolean b = true;
        Boolean bObj = b;
        System.out.println(b + " " + bObj);

        byte b1 = 1;
        Byte b1Obj = b1;
        System.out.println(b1 + "" + b1Obj);

        char c = 'c';
        Character cObj = c;
        System.out.println(c + " " + cObj);

        int i = 1;
        Integer iObj = i;
        iObj = 100;
        i = iObj;
        System.out.println(i);
        printSmth(iObj);
        printSmth(b1Obj);
    }

    static void printSmth(int i) {
        System.out.println(i);
    }
}
