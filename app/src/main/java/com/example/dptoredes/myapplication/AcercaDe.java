package com.example.dptoredes.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AcercaDe extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        TextView txu = (TextView) findViewById(R.id.txtuser);
        txu.setText((String) getIntent().getExtras().get("usuario"));
        TextView txp = (TextView) findViewById(R.id.txtpass);
        txp.setText((String) getIntent().getExtras().get("pass"));


    }
}
