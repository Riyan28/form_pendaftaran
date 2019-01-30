package com.riyan.form_pendaftaran;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menambahkan fungsi componen
        final Button Simpan = (Button) findViewById(R.id.btSimpan);
        final Button Reset = (Button) findViewById(R.id.btReset);
        final EditText Nama = (EditText) findViewById(R.id.etNama);
        final EditText Alamat = (EditText) findViewById(R.id.etAlamat);
        final RadioGroup Kelas = (RadioGroup) findViewById(R.id.rg_kelas);
        final CheckBox Hobi = (CheckBox) findViewById(R.id.ch_musik);
        final Bundle bundle = new Bundle();

        //Click Simpan
        Simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new
                        AlertDialog.Builder(MainActivity.this);
                alertDialogBuilder.setMessage("Simpan Data ini ?");
                alertDialogBuilder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Yes", Toast.LENGTH_SHORT).show();
                        //final
                        bundle.putString("nama", Nama.getText().toString());
                        bundle.putString("alamat", Alamat.getText().toString());
                        //bundle.putString("kelas", Kelas.getTag().toString());
                        bundle.putString("hobi", Hobi.getText().toString());

                         Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                        intent = intent.putExtras(bundle);
                        startActivity(intent);

                    }
                });
                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        //Click Reset
        Reset.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Nama.setText("");
            Alamat.setText("");
            }
        }));
    }
}
