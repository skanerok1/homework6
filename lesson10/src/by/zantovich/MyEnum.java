package by.zantovich;

public enum MyEnum {

        BREAKFAST(new Menu("Овсянка, яйца жаренные, кофе, булочка")),
        LUNCH(new Menu(" Суп, салат, котлеты, рис")),
        DINNER(new Menu("Рыба, овощи, фрукты")),
        LATE_DINNER(new Menu("Пиво, водка, шлюхи"));

        private Menu menu;




        MyEnum(Menu menu) {
                this.menu = menu;
        }

        public Menu getMenu() {
                return menu;
        }
}
