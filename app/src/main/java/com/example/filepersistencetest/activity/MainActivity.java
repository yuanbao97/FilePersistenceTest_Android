package com.example.filepersistencetest.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.filepersistencetest.R;
import com.example.filepersistencetest.framework.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}