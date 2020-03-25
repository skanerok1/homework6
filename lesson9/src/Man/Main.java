package Man;

public class Main {
    public static void main(String[] args) {
        Man man = new Man();
        System.out.println(man.getHead().getHairLength());
        int currentHairLength = man.getHead().getHairLength(); // тлько для чтения строка
        currentHairLength -=1;
        System.out.println(currentHairLength);

        man.getHead().setHairLength(currentHairLength);

        System.out.println(man.getHead().getHairLength());
    }
}
