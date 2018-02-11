package com.example.andri.iak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class konfirmasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi);

        Button lanjutkan = (Button)findViewById(R.id.lanjutkan);


        TextView textView=(TextView)findViewById(R.id.text1);
        Intent intent=getIntent();
        textView.setText(intent.getStringExtra("username"));



        lanjutkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent geser = new Intent(konfirmasi.this, soal1.class);
                startActivity(geser);

            }
        });
    }
}
