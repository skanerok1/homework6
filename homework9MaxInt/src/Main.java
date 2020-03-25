import java.util.Random;


public class Main {

    public static void main(String[] args) {

        int n = 10;
        Random rand = new Random();
        int [] mas  = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(20);
            System.out.println(mas[i]);
        }
        int    kmax = 0;

        System.out.println("");

        for (int i = 0; i < mas.length; i++) {
            if(mas[kmax] < mas[i]) kmax = i;
        }

        System.out.println("Самое большое число: "+mas[kmax]);

    }
	// write your code here
}
