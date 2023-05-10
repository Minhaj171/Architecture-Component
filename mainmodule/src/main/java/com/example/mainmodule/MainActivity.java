package com.example.mainmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import com.example.testappmodule.TestAppActivity;
import com.example.testmodule.testModuleActivity;
import com.example.utilsmodule.UtilsMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnClick);
        Button buttonUtils = findViewById(R.id.btnUtils);
        Button buttonLibrary = findViewById(R.id.btnLibrary);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, TestAppActivity.class);
            startActivity(intent);
        });
        buttonUtils.setOnClickListener(v -> {
            Intent intent = new Intent(this, UtilsMainActivity.class);
            startActivity(intent);
        });
        buttonLibrary.setOnClickListener(v -> {
            Intent intent = new Intent(this, testModuleActivity.class);
            startActivity(intent);
        });


    }
}