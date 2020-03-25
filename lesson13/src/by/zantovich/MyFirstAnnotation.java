package by.zantovich;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.RUNTIME)

public @interface MyFirstAnnotation {

    int version = 0;

    int version ();

    String description() default  "";

}
