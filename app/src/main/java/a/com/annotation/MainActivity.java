package a.com.annotation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //基本注解
    @Swordsman
    //带成员变量的注解
    @Swordsman1(name = "qqqq",age = 11)
    //运行时注解
    @Swordsman2
    public void getData(){

    }



    public void outPut(){
        Method []methods=Test.class.getDeclaredMethods();
        for (int i=1;i<methods.length;i++){
            GET get=methods[i].getAnnotation(GET.class);
            Log.d(TAG, get.value());
        }

    }
}
