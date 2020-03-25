package by.zantovich;

public abstract class Vehicle {

    private String licensePlateNr;

    abstract void drive();

    public String getLicensePlateNr() {
        return licensePlateNr;
    }

    public void setLicensePlateNr(String licensePlateNr) {
        this.licensePlateNr = licensePlateNr;
    }



}
