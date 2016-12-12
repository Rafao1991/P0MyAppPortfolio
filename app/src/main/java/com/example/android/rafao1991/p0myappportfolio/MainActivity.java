package com.example.android.rafao1991.p0myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonPopularMovies = (Button) findViewById(R.id.button_popular_movies);
        buttonPopularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(buttonPopularMovies.getText().toString().toLowerCase());
            }
        });
        final Button buttonStockHawk = (Button) findViewById(R.id.button_stock_hawk);
        buttonStockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(buttonStockHawk.getText().toString().toLowerCase());
            }
        });
        final Button buttonBuildItBigger = (Button) findViewById(R.id.button_build_it_bigger);
        buttonBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(buttonBuildItBigger.getText().toString().toLowerCase());
            }
        });
        final Button buttonMakeYourAppMaterial =
                (Button) findViewById(R.id.button_make_your_app_material);
        buttonMakeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(buttonMakeYourAppMaterial.getText().toString().toLowerCase());
            }
        });
        final Button buttonGoUbiquitous = (Button) findViewById(R.id.button_go_ubiquitous);
        buttonGoUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(buttonGoUbiquitous.getText().toString().toLowerCase());
            }
        });
        final Button buttonCapstone = (Button) findViewById(R.id.button_capstone);
        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(buttonCapstone.getText().toString().toLowerCase());
            }
        });
    }

    public void showToast(String toastText) {
        toastText = getResources().getString(
                R.string.main_activity_toast_text).replace("change", toastText);
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }
}
