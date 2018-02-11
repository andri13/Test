package com.example.andri.iak;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Hasil extends AppCompatActivity {

    TextView mtvHasilAkhir;
    Button depan;
    Button keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

      mtvHasilAkhir = (TextView)findViewById(R.id.tvSkorAkhir);
      keluar = (Button)findViewById(R.id.exit);
      depan = (Button)findViewById(R.id.home);

      setSkor();

      depan.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent i = new Intent(Hasil.this, MainActivity.class);
              startActivity(i);
          }
      });

      keluar.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              finish();
          }
      });

    }

    public void setSkor() {
        String activity = getIntent().getStringExtra("activity");
        String skorPilGan = getIntent().getStringExtra("skorAkhir");

        if (activity.equals("Pilihan Ganda")) {
            mtvHasilAkhir.setText("SKOR : "+skorPilGan);
        }
    }


    public void onBackPressed(){
        Toast.makeText(this, "Tidak Bisa Kembali, Silahan Tekan Menu", Toast.LENGTH_SHORT).show();
    }

}
