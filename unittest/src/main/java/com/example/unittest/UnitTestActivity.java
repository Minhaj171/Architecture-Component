package com.example.unittest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.utilsmodule.UtilsMainActivity;

public class UnitTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_test);

        Intent intent = new Intent(this, UtilsMainActivity.class);
        startActivity(intent);
    }
}