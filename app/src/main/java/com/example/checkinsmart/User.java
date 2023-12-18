package com.example.checkinsmart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
public class User extends AppCompatActivity {

    private Button btn2;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        String welcome = getIntent().getStringExtra("pos");
        Toast.makeText(this, "Welcome "+welcome, Toast.LENGTH_LONG).show();
        btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            tv = (TextView)findViewById(R.id.textView5);
                Calendar Calender = null;
                Date dateAndTime = Calender.getInstance().getTime();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
                SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss", Locale.getDefault());
                String date = dateFormat.format(dateAndTime);
                String time = timeFormat.format(dateAndTime);
                tv.setText("Current Date - "+date+"\n\nCurrent Time - "+time);
                Toast.makeText(User.this, "Attendance Submitted", Toast.LENGTH_LONG).show();
            }
        });
    }
}