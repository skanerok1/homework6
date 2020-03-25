package by.zantovich;

public class Main {
    public static void main(String[] args) {
       //Movable movable = new Movable();

        Movable movable1 = new Car();
        //movable1.move();

        Movable movable2 = new Bus();
        //movable2.move();

        Passenger passenger = new Passenger(movable1);
        passenger.driveToHome();

        passenger.setMovable(movable2);
        passenger.driveToHome();
        passenger.payForUsage((Bus)movable2);


        Uber uber = new Uber();
        passenger.setMovable(uber);
        passenger.driveToHome();
        passenger.payForUsage(uber);
    }
}
