public class Philips extends AnotherHomeApplianses {

    private String model;
    private double price;

    public Philips(int power, String manufacturer, double weigth, String model, double price) {
        super(power, manufacturer, weigth);
        this.model = model;
        this.price = price;
    }

    @Override
    void plugIn() {
        super.plugIn();
        System.out.println("Подключен к сети , но не работает");
    }
}