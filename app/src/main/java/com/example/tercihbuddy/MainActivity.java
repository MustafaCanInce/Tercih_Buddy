package com.example.tercihbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.firestore.FirebaseFirestore;


public class MainActivity extends AppCompatActivity {

    private Button tercihlistem_button;
    private Button aramakriterleri_button;
    private Button alanlarbolumler_button;
    private Button sehirveuniversitesecimi_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FirebaseFirestore db = FirebaseFirestore.getInstance();

        sehirveuniversitesecimi_button = findViewById(R.id.sehir_ve_universite_secimi_button);
        tercihlistem_button = findViewById(R.id.tercih_listem);
        aramakriterleri_button = findViewById(R.id.arama_kriterleri_button);
        alanlarbolumler_button = findViewById(R.id.alanlar_bölümler_button);

        sehirveuniversitesecimi_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,sehirveuniversitesecimi.class);
                startActivity(intent);
            }
        });
        tercihlistem_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tercihlistemactivityopen();
            }
        });
        aramakriterleri_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aramakriterleri_activityyopen();
            }
        });
        alanlarbolumler_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alanlarbolumler_activityopen();
            }
        });

    }

    public void opensehirveuniversitesecimi() {

    }
    public void tercihlistemactivityopen() {
        Intent intent = new Intent(this, Tercih_Listem.class);
        startActivity(intent);
    }
    public void aramakriterleri_activityyopen() {
        Intent intent = new Intent(this, arama_kriterleri.class);
        startActivity(intent);
    }

    public void alanlarbolumler_activityopen() {
        Intent intent = new Intent(this, alanlarbolumler.class);
        startActivity(intent);
    }

}