package by.zantovich;

import java.util.Arrays;

public class TestMyEnum {

    public static void main(String[] args) {
        MyEnum myEnum1 = MyEnum.BREAKFAST;
        System.out.println(myEnum1 + " " + myEnum1.ordinal()
                + " " + myEnum1.getMenu().toString());
        System.out.println(myEnum1 + " " + myEnum1.ordinal());

        MyEnum myEnum2 = MyEnum.valueOf("DINNER");
        myEnum2.getMenu();
        System.out.println(myEnum2 + " " + myEnum2.ordinal()
                + " " + myEnum2.getMenu().toString());


        System.out.println(Arrays.toString(MyEnum.values()));


    }

}
