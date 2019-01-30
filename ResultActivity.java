package com.riyan.form_pendaftaran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //Back Button
        getSupportActionBar().setTitle("Back");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final TextView tvNama = (TextView) findViewById(R.id.tv_Nama);
        final TextView tvAlamat = (TextView) findViewById(R.id.tv_Alamat);
        final TextView tvKelas = (TextView) findViewById(R.id.tv_Kelas);
        final TextView tvHobi = (TextView) findViewById(R.id.tv_Hobi);

        //ambil bundle
        Bundle bundle = null;
        bundle = this.getIntent().getExtras();

        //letakan
        tvNama.setText(bundle.getString("nama"));
        tvAlamat.setText(bundle.getString("alamat"));
        tvKelas.setText(bundle.getString("kelas"));
        tvHobi.setText(bundle.getString("hobi"));


    }
}
