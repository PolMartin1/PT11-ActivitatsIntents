package com.example.pt11_activitatsintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG="MainActivity";

    Button buttonEntry;
    Button buttonNew;
    Button buttonHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEntry=(Button) findViewById(R.id.btnBotoEntra);
        buttonNew=(Button) findViewById(R.id.btnBotoNou);
        buttonHelp=(Button) findViewById(R.id.btnBotoAjuda);

        Log.d(TAG,"debugging");
        Toast.makeText(this,"Benvinguts!", Toast.LENGTH_LONG).show();
    }

    public void onClickHelp(View v){

        Intent intent=new Intent(this,HelpActivity.class);
        startActivity(intent);

        //Crea un registre de l'ajuda
        Log.d(TAG,"Inici de l'ajuda.");
    }

    public void onClickRegistre(View view) {

        Intent intent=new Intent(this,Registro.class);
        startActivity(intent);

        //Crea un registre de l'usuari registrat.
        Log.d(TAG,"Inici del registre.");
    }
}
