package com.example.a3activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.a3activity.databinding.ActivityMainBinding;
import com.example.a3activity.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    static final int REQUESTCODE = 123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySecondBinding binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_second);
        setContentView(binding.getRoot());
        binding.d2t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivityForResult(intent, REQUESTCODE );
            }
        });
        binding.d2t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivityForResult(intent, REQUESTCODE );
            }
        });
    }
}