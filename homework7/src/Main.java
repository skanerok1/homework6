public class Main {

    public static void main(String[] args) {

        int a = 5, b = 3, c = 4, d = 2, e = 9, f = 5;
        if((e >= (a + c)) && (f >= b && f >= d)) {
            System.out.println("На данном участке поместится 2 участка");
        }   else if((f >= (b + d)) && (e >= a && e >= c)) {
            System.out.println("На данном участке поместится 2 участка");
        }   else if((f >= (a + c)) && (e >= b && e >= d)) {
            System.out.println("На данном участке поместится 2 участка");
        }   else if((f >= (a + d)) && (e >= c && e >= b)) {
            System.out.println("На данном участке поместится 2 участка");
        }   else if((f >= (c + b)) && (e >= d && e >= a)) {
            System.out.println("На данном участке поместится 2 участка");
        }   else if((f >= (b + d)) && (e >= (a + c))) {
            System.out.println("На данном участке поместится 2 участка");
        }   else if((f >= (a +c)) && (e >= (b + d))) {
            System.out.println("На данном участке поместится 2 участка");
        }   else if(((f >= b + c)) && (e >= (a + d))) {
            System.out.println("На данном участке поместится 2 участка");
        }
        else
            System.out.println("Не получается разместить два дома на данном участке");

        }
    }