package com.longs7.androidlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView tvUsername = findViewById(R.id.txtUserName);
        TextView tvPassword = findViewById(R.id.txtPassword);

        findViewById(R.id.btnLogin).setOnClickListener(v -> {
            Toast.makeText(this, "Username: " + tvUsername.getText() + ", password: " + tvPassword.getText(), Toast.LENGTH_LONG).show();
        });
    }
}
