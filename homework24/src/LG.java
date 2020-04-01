public class LG extends HomeApplianses {
    private double width;
    private double length;
    private double height;

    public LG(int power, String manufacturer, String name, double w, double l, double h) {
        super(power, manufacturer, name);
        width = w;
        length = l;
        height = h;
    }

    @Override
    void plugIn() {
        super.plugIn();
        System.out.println("Подключен к сети, Работает");
    }
}

