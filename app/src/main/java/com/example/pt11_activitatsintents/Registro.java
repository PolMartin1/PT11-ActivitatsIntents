package com.example.pt11_activitatsintents;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

public class Registro extends AppCompatActivity {

    public static final String TAG="Registro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_registro);
    }

    public void onClickHelp(View v){

        Intent intent=new Intent(this,HelpActivity.class);
        startActivity(intent);

        //Crea un registre de l'ajuda
        Log.d(TAG,"Inici de l'ajuda.");
    }

}
