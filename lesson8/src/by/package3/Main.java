package by.package3;
import by.package1.Car;
import org.junit.Assert;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        by.package2.Car car2 = new by.package2.Car();
        by.package1.Car car3 = new by.package1.Car();

        Assert.fail();

    }
}
