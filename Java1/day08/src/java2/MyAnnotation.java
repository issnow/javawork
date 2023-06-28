package java2;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface MyAnnotation {
  String value() default "hello";
}
