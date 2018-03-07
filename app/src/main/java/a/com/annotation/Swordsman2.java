package a.com.annotation;

import android.webkit.WebSettings;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2018/3/7.
 */
@Retention(RetentionPolicy.RUNTIME)//运行时注解
@Target(ElementType.METHOD)//修饰于方法
public @interface Swordsman2 {
    String name()default "a";
    int age()default 1;
}
