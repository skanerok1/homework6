public class Main {

    public static void main(String[] args) {
        int mas[] = new int[10];
        int i;
        for(i = 0;i < mas.length;i++){
            mas[i] = (int)(Math.random()*10);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for(i = mas.length - 1;i >= 0;i--){
            System.out.print(mas[i] + " ");
        }
    }
}
