public class HomeApplianses extends Applianses {

    private String name;

    public HomeApplianses(int power, String manufacturer, String name) {
        super(power, manufacturer);
        this.name = name;
    }

    @Override
    void plugIn() {
        isOn = true;
    }
}
