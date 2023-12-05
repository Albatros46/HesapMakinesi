package com.example.hesapmakinesi;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.hesapmakinesi.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1Text;
    EditText number2Text;
    TextView resultText;
    Button topla;
    Button cikar;
    Button carp;
    Button bol;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Degiskenlerle View(görünüm) tarafindaki objeler eslestirildi.
         number1Text=findViewById(R.id.sayi1);
         number2Text=findViewById(R.id.sayi2);
         resultText=findViewById(R.id.sonuc);
         topla=findViewById(R.id.Topla);
         cikar=findViewById(R.id.Cikarma);
         carp=findViewById(R.id.Carpma);
         bol=findViewById(R.id.Bolme);
    }

    public void Toplama(View view){
        if (number1Text.getText().toString().matches("") ||
                number2Text.getText().toString().matches("")){
            resultText.setText("Enter Number!");
        }else{
            int sayi1=Integer.parseInt( number1Text.getText().toString());
            int sayi2=Integer.parseInt( number2Text.getText().toString());
            int result=sayi1+sayi2;
            resultText.setText("Result :"+result);
        }

    }
    public void Cikarma(View view){
        if (number1Text.getText().toString().matches("") ||
                number2Text.getText().toString().matches("")){
            resultText.setText("Enter Number!");
        }else{
            int sayi1=Integer.parseInt( number1Text.getText().toString());
            int sayi2=Integer.parseInt( number2Text.getText().toString());
            int result=sayi1-sayi2;
            resultText.setText("Result :"+result);
        }

    }
    public void Bolme(View view){
        if (number1Text.getText().toString().matches("") ||
                number2Text.getText().toString().matches("")){
            resultText.setText("Enter Number!");
        }else{
            int sayi1=Integer.parseInt( number1Text.getText().toString());
            int sayi2=Integer.parseInt( number2Text.getText().toString());
            int result=sayi1/sayi2;
            resultText.setText("Result :"+result);
        }

    }
    public void Carpma(View view){
        if (number1Text.getText().toString().matches("") ||
                number2Text.getText().toString().matches("")){
            resultText.setText("Enter Number!");
        }else{
            int sayi1=Integer.parseInt( number1Text.getText().toString());
            int sayi2=Integer.parseInt( number2Text.getText().toString());
            int result=sayi1*sayi2;
            resultText.setText("Result :"+result);
        }

    }
}