package com.example.daniel.primeraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.example.daniel.primeraapp.LoginActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int cont=0,cont2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void BotonEntrando(View v){
        //Toast miTostada = Toast.makeText(getApplicationContext(),"Hee Hee Ayuwoki!!",Toast.LENGTH_LONG);
        //miTostada.show();
        //setContentView(R.layout.activity_login);
        TextView texto = (TextView)findViewById(R.id.textEntrando);

        cont++;
        texto.setText(Integer.toString(cont));
    }

    public void BotonSaliendo (View v){
        TextView texto= (TextView)findViewById(R.id.textSaliendo);
        cont2++;
        texto.setText(Integer.toString(cont2));
    }


}
