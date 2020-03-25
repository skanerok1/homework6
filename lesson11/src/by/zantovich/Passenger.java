package by.zantovich;

public class Passenger {

    private Movable movable;


    public Passenger (Movable movable) {
        this.movable = movable;

    }
    public Movable getMovable(){
        return movable;
    }

    public void setMovable(Movable movable) {
        this.movable = movable;
    }


    public void driveToHome() {
        System.out.println("Im going home...");
        movable.move();

    }
    public void payForUsage(Payable payable) {
        payable.pay();
    }

}
