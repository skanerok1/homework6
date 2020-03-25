package by.zantovich;

public class Bus extends Vehicle implements Movable, Payable {


    public void move() {
        System.out.println("Bus is moving");


    }
    @Override
    public void drive() {
        System.out.println("drive bus");

    }



    public void pay() {
        System.out.println("pay 0.70 BYN");



    }
}
