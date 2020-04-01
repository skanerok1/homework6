public class Main {
    public static void main(String[] args) {
        Philips robotCleaner = new Philips(110, "China", 4.20, "X20", 400);
        LG refrigerator = new LG(220, "Vietnam", "Refrigerator", 0.750, 0.750, 1.8);

        robotCleaner.plugIn();
        refrigerator.plugIn();
        System.out.println("Мощность холодильника : " + refrigerator.getPower() + " Wt");


    }
}
