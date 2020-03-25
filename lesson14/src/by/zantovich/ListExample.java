package by.zantovich;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<Car> list= new ArrayList<>();
        list.add(new Car("BMW", "X5", "1", 123456.45));
        System.out.println(list + " " + list.size());
        list.add(null);
        list.add(2, new Car("Audu", "A6", "3", 4455.44));
        System.out.println(list);

        list.set(1, new Car("VW", "Polo", "2", 16000.99));
        System.out.println(list);

        Car car2 = list.get(2);
        System.out.println(car2);
    }


}

class Car implements Comparable<Car> {
    private String carBrand;
    private String carModel;
    private String vinNr;
    private Double price;

    public Car(String carBrand, String carModel, String vinNr, Double price) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.vinNr = vinNr;
        this.price = price;
    }

    public String getCarModel() {
        return carModel;
    }


    public String getCarBrand() {
        return carBrand;
    }

    public String getVinNr() {
        return vinNr;
    }

    public Double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", vinNr='" + vinNr + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Car car) {
        if (this.price > car.price) {
            return 1;

        }else if (this.price < car.price) {
            return -1;
        }
        return 0;
    }
}
