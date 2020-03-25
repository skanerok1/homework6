package by.zantovich;

public class TestParameters {

    public static void main(String[] args) {
        int value1 = 100;
        Parameter parameter = new Parameter();
        parameter.value = 50;
        TestParameters test = new TestParameters();
        // primiteve type
        test.print(value1);
        value1 += 1;
        test.print(value1);
        //reference type
        Parameter parametr = new Parameter();
        parameter.value = 100;
        test.print(parameter);
        parameter.value += 1;
        test.print(parameter);

    }

    void print(int i) {
        System.out.println(i);
        i++;
    }
    void print(Parameter p) {
        System.out.println(p.value);
        p.value++;
    }

}

class Parameter {
    int value;
}
