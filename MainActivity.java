package com.example.profilpribadiapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // pastikan file activity_main.xml ada
    }

    // Fungsi ketika tombol "Biodata" diklik
    public void bukaBiodata(View view) {
        startActivity(new Intent(this, BiodataActivity.class));
    }

    // Fungsi ketika tombol "Pendidikan" diklik
    public void bukaPendidikan(View view) {
        startActivity(new Intent(this, PendidikanActivity.class));
    }

    // Fungsi ketika tombol "Aktivitas" diklik
    public void bukaAktivitas(View view) {
        startActivity(new Intent(this, AktivitasActivity.class));
    }
}
