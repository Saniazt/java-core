package advancedJava.Annotations1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE}) // ограничили для только методов, type - class||interface||enum;
@Retention(RetentionPolicy.RUNTIME) //будт пропадать во время компеляции? или оставаться в байт коде
public @interface MethodInfo {
    String author() default "Olek";
    int dateOfCreation()default 2019;
    String purpose();
}
