package com.example.checkinsmart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        String welcome = getIntent().getStringExtra("pos");
        Toast.makeText(this, "Welcome "+welcome, Toast.LENGTH_LONG).show();
    }
}