package com.example.administrator.lx513_screenadapter;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Configuration configuration = getResources().getConfiguration();
        int smallestScreenWidthDp = configuration.smallestScreenWidthDp;
        int screenWidthDp = configuration.screenWidthDp;
        int screenHeightDp = configuration.screenHeightDp;
        int densityDpi = configuration.densityDpi;
        int layoutDirection = 0;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR1) {
            layoutDirection = configuration.getLayoutDirection();
        }
        int touchscreen = configuration.touchscreen;

        System.out.println("-----smallestScreenWidthDp="+smallestScreenWidthDp);
        System.out.println("-----screenWidthDp="+screenWidthDp);
        System.out.println("-----screenHeightDp="+screenHeightDp);
        System.out.println("-----densityDpi="+densityDpi);
        System.out.println("-----layoutDirection="+layoutDirection);
        System.out.println("-----touchscreen="+touchscreen);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int widthPixels = displayMetrics.widthPixels;
        int heightPixels = displayMetrics.heightPixels;
        System.out.println("-----widthPixels="+widthPixels);
        System.out.println("-----heightPixels="+heightPixels);
    }
}
