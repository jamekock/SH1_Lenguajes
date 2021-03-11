package com.sh1.lenguajes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView lblTitle;
    CheckBox chkJava;
    CheckBox chkJavaScript;
    CheckBox chkGo;
    CheckBox chkKotlin;
    CheckBox chkPython;
    CheckBox chkC_CSharp;
    CheckBox chkScala;
    CheckBox chkRuby;
    CheckBox chkSwift;
    CheckBox chkDart;
    ArrayList<String> lista = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblTitle = findViewById(R.id.lblTitle);
        chkJava = findViewById(R.id.chkJava);
        chkJavaScript = findViewById(R.id.chkJavascript);
        chkGo = findViewById(R.id.chkGo);
        chkKotlin = findViewById(R.id.chkKotlin);
        chkPython = findViewById(R.id.chkPython);
        chkC_CSharp = findViewById(R.id.chkC_CSharp);
        chkScala = findViewById(R.id.chkScala);
        chkRuby = findViewById(R.id.chkRuby);
        chkSwift = findViewById(R.id.chkSwift);
        chkDart = findViewById(R.id.chkDart);

    }
        public void prueba(View v){
            if(!chkJava.isChecked()){
                lista.remove(chkJava.getText().toString());
            }
            if(!chkJavaScript.isChecked()){
                lista.remove(chkJavaScript.getText().toString());
            }
            if(!chkGo.isChecked()){
                lista.remove(chkGo.getText().toString());
            }
            if(!chkKotlin.isChecked()){
                lista.remove(chkKotlin.getText().toString());
            }
            if(!chkPython.isChecked()){
                lista.remove(chkPython.getText().toString());
            }
            if(!chkC_CSharp.isChecked()){
                lista.remove(chkC_CSharp.getText().toString());
            }
            if(!chkScala.isChecked()){
                lista.remove(chkScala.getText().toString());
            }
            if(!chkRuby.isChecked()){
                lista.remove(chkRuby.toString());
            }
            if(!chkSwift.isChecked()){
                lista.remove(chkSwift.getText().toString());
            }
            if(!chkDart.isChecked()){
                lista.remove(chkDart.getText().toString());
            }

            if(chkJava.isChecked()){
                lista.add(chkJava.getText().toString());
            }
            if(chkJavaScript.isChecked()){
                lista.add(chkJavaScript.getText().toString());
            }
            if(chkGo.isChecked()){
                lista.add(chkGo.getText().toString());
            }
            if(chkKotlin.isChecked()){
                lista.add(chkKotlin.getText().toString());
            }
            if(chkPython.isChecked()){
                lista.add(chkPython.getText().toString());
            }
            if(chkC_CSharp.isChecked()){
                lista.add(chkC_CSharp.getText().toString());
            }
            if(chkScala.isChecked()){
                lista.add(chkScala.getText().toString());
            }
            if(chkRuby.isChecked()){
                lista.add(chkRuby.getText().toString());
            }
            if(chkSwift.isChecked()){
                lista.add(chkSwift.getText().toString());
            }
            if(chkDart.isChecked()){
                lista.add(chkDart.getText().toString());
            }

            for(String item : lista){
                Toast.makeText(getApplicationContext(),item,Toast.LENGTH_SHORT).show();
            }
        }
    
    

}