package me.fleka.mvpwithdagger.di.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.fleka.mvpwithdagger.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
