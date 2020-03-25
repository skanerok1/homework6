public class Main {

    public static void main(String[] args) {
        int marks[] = new int[20];
        for (int i = 0; i < 20; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
            System.out.print(marks[i] + " ");

        }
        System.out.println();
        int x = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (x < marks[i]){
                x=marks[i];
            }
        }

        for(int i = 0; i<marks.length; i++ ) {
            if ( x == marks[i]) {
                System.out.println("Индекс максимального значения = " + i);

            }


        }
    }



}