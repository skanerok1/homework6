package by.zantovich;

public class Menu {

    private String description;


    public Menu(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Menu{" +
                "description='" + description + '\'' +
                '}';
}
}

