package by.zantovich;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Car> map = new HashMap<>();

        map.put("1", new Car("BMW", "X5", "1", 123456.45));
        map.put("2", new Car("Audu", "A6", "3", 4455.44));
        map.put("3", new Car("VW", "Polo", "2", 16000.99));

        System.out.println(map);

        map.remove("2");
        System.out.println(map);
    }

}
