package a.com.annotation;

/**
 * Created by Administrator on 2018/3/7.
 */

public @interface Swordsman1 {
    String name() default "aaaa";
    int age() default 1;
}
