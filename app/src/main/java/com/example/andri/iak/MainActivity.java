package com.example.andri.iak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username = (EditText)findViewById(R.id.et1);
        final EditText password = (EditText)findViewById(R.id.et2);
        Button login = (Button)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ambilnama = username.getText().toString();
                String ambilpassword = password.getText().toString();

                if (ambilpassword.equals("root"))

                {
                    Intent intent = new Intent(MainActivity.this, konfirmasi.class);
                    intent.putExtra("username", username.getText().toString());
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Username atau Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
