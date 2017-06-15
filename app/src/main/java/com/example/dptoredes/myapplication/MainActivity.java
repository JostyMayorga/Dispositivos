package com.example.dptoredes.myapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Hola mundo", " onCreate");
        setContentView(R.layout.activity_main);
        Button boton = (Button) findViewById(R.id.buttonLogin);

        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                abrirAcercaDe();

            }
        });

    }


    @Override
    protected void onRestart() {
        Log.d("Hola mundo", " onRestart");
        super.onRestart();
    }

    protected void onDestroy(){
        Log.d("Hola mundo", " onDestroy");
        super.onDestroy();

    }

    protected void onPause(){
        super.onPause();
        Log.d("Hola mundo", " onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Hola mundo", " onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Hola mundo", " onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Hola mundo", " onStop");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("Hola mundo", " onPostResume");
    }



    public void abrirAcercaDe() {

        //Intent intent = new Intent(this, AcercaDe.class);
        //Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:962849347"));
        //startActivity(intent);
        TextView texto1 = (EditText) findViewById( R.id.username );
        TextView texto2 = (EditText) findViewById( R.id.pass );

        Intent explicit_intent = new Intent(this, AcercaDe.class);
        String auxTexto1= texto1.getText().toString();
        String auxTexto2= texto2.getText().toString();

        explicit_intent.putExtra("usuario",auxTexto1);
        explicit_intent.putExtra("pass",auxTexto2);

        startActivity(explicit_intent);
    }
}
