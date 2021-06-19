package com.example.ptsgenap_rpl2_01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email;
    EditText password;
    TextView btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        btn = (TextView) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("Aaliyah") &&
                        password.getText().toString().equals("panyolaaliyah")) {
                    Toast.makeText(MainActivity.this, "Sukses Login", Toast.LENGTH_SHORT).show();

                    Intent intent= new Intent(getApplicationContext(), DashboardMenu.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "Toast", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}