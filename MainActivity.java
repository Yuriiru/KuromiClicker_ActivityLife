package com.example.myclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnAddHearts(View view) {
        counter++;
        TextView counterView = (TextView) findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
        if (counter >= 100) {
            TextView layout = findViewById(R.id.txt_counter);
            ViewGroup.LayoutParams rectangle = layout.getLayoutParams();
            rectangle.height = 200;
            rectangle.width = 250;
            layout.setLayoutParams(rectangle);
        }
        if (counter >= 1000) {
            TextView layout = findViewById(R.id.txt_counter);
            ViewGroup.LayoutParams rectangle = layout.getLayoutParams();
            rectangle.height = 200;
            rectangle.width = 300;
            layout.setLayoutParams(rectangle);
        }
        if (counter >= 10000) {
            TextView layout = findViewById(R.id.txt_counter);
            ViewGroup.LayoutParams rectangle = layout.getLayoutParams();
            rectangle.height = 200;
            rectangle.width = 450;
            layout.setLayoutParams(rectangle);
        }
    }
}