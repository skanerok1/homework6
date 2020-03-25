package by.zantovich;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {


    public static void main(String[] args) {
        Set<Car> set = new TreeSet<>();

        set.add(new Car("BMW", "X5", "1", 123456.45));
        set.add(new Car("Audu", "A6", "3", 4455.44));
        set.add(new Car("VW", "Polo", "2", 16000.99));

        System.out.println(set);
    }
}
