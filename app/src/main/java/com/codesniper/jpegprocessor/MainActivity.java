package com.codesniper.jpegprocessor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.codesniper.processor.NativeLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NativeLoader nativeLoader=new NativeLoader();
        String str=nativeLoader.stringFromJNI();
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }
}
