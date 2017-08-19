package me.fleka.mvpwithdagger.di.main;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import me.fleka.mvpwithdagger.R;

public class MainActivity extends DaggerAppCompatActivity implements MainContract.View{

    @Inject
    MainContract.Presenter presenter;

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
    }

    @Override
    public void showNewText(String newText) {
        textView.setText(newText);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.subscribe();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.unsubscribe();
    }
}
