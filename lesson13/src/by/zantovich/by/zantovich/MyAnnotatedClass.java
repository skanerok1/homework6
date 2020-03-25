package by.zantovich.by.zantovich;

import by.zantovich.MyFirstAnnotation;
@MyFirstAnnotation(version = 3, description = "test annotation class")
public class MyAnnotatedClass {

    private String className;

    @MyFirstAnnotation(version = 2, description = "constructor")
    public MyAnnotatedClass(String className) {
        this.className = className;
    }

    @MyFirstAnnotation(description = "getter", version =1)
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
