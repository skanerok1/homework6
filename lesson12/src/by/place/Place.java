package by.place;

import by.parking.Car;

public class Place {

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public boolean isEmpty() {
        return car == null;
    }
}
