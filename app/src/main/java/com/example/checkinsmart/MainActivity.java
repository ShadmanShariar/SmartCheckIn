package com.example.checkinsmart;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button loginbutton;
    private EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbutton = (Button) findViewById(R.id.button);
        email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        password = (EditText) findViewById(R.id.editTextTextPassword);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chkemail = email.getText().toString().trim();
                if(chkemail.equals("rahim@gmail.com")) {
                    Intent intent = new Intent(MainActivity.this, Admin.class);
                    intent.putExtra("pos",  email.getText().toString().trim().split("@")[0]);
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent(MainActivity.this, User.class);
                    intent.putExtra("pos",  email.getText().toString().trim().split("@")[0]);
                    startActivity(intent);
                }
            }
        });

    }
}