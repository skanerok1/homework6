package by.zantovich;

public class Uber extends Vehicle implements Movable, Payable{

    public void move() {
        System.out.println("Uber is mooving");
    }

    @Override
    public void pay() {
        System.out.println("pay 7.00 BYN");

    }
    public void move(int i) {
        System.out.println("Uber is moving " + i + " km");
    }
    public void drive() {
        System.out.println("drive Uber");
    }
}
