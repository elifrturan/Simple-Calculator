package com.elifr.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText txtbirinciSayi, txtikinciSayi;
    public Button btnTopla, btnCikar, btnCarp, btnBol;
    public TextView txtSonuc;
    public int sayi1, sayi2, sonuc;
    public String birinciSayi, ikinciSayi;
    public Hesapla hesap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtbirinciSayi = (EditText) findViewById(R.id.editTextOne);
        txtikinciSayi = (EditText) findViewById(R.id.editTextTwo);
        btnTopla = (Button) findViewById(R.id.btnToplam);
        btnCikar = (Button) findViewById(R.id.btnCikar);
        btnCarp = (Button) findViewById(R.id.btnCarpma);
        btnBol = (Button) findViewById(R.id.btnBolme);
        txtSonuc = (TextView) findViewById(R.id.txtSonuc);

    }

    public void btnTopla(View v){

        birinciSayi = txtbirinciSayi.getText().toString();
        ikinciSayi = txtikinciSayi.getText().toString();

        if((TextUtils.isEmpty(birinciSayi)) && (TextUtils.isEmpty(ikinciSayi))){

            txtSonuc.setText("Null value cannot be entered!");

        }else{

            sayi1 = Integer.parseInt(birinciSayi);
            sayi2 = Integer.parseInt(ikinciSayi);
            hesap = new Hesapla(sayi1,sayi2);

            sonuc = hesap.toplam();
            txtSonuc.setText("Result: " + String.valueOf(sonuc));
        }
    }

    public void btnCikart(View v){

        birinciSayi = txtbirinciSayi.getText().toString();
        ikinciSayi = txtikinciSayi.getText().toString();

        if((TextUtils.isEmpty(birinciSayi)) && (TextUtils.isEmpty(ikinciSayi))){

            txtSonuc.setText("Null value cannot be entered!");

        }else{

            sayi1 = Integer.parseInt(birinciSayi);
            sayi2 = Integer.parseInt(ikinciSayi);
            hesap = new Hesapla(sayi1,sayi2);

            sonuc = hesap.fark();
            txtSonuc.setText("Result: " + String.valueOf(sonuc));
        }
    }

    public void btnCarpma(View v){

        birinciSayi = txtbirinciSayi.getText().toString();
        ikinciSayi = txtikinciSayi.getText().toString();

        if((TextUtils.isEmpty(birinciSayi)) && (TextUtils.isEmpty(ikinciSayi))){

            txtSonuc.setText("Null value cannot be entered!");

        }else{

            sayi1 = Integer.parseInt(birinciSayi);
            sayi2 = Integer.parseInt(ikinciSayi);
            hesap = new Hesapla(sayi1,sayi2);

            sonuc = hesap.carpim();
            txtSonuc.setText("Result: " + String.valueOf(sonuc));
        }
    }

    public void btnBolme(View v){

        birinciSayi = txtbirinciSayi.getText().toString();
        ikinciSayi = txtikinciSayi.getText().toString();

        if((TextUtils.isEmpty(birinciSayi)) && (TextUtils.isEmpty(ikinciSayi))){

            txtSonuc.setText("Null value cannot be entered!");

        }else{

            sayi1 = Integer.parseInt(birinciSayi);
            sayi2 = Integer.parseInt(ikinciSayi);
            hesap = new Hesapla(sayi1,sayi2);

            sonuc = hesap.bolum();
            txtSonuc.setText("Result: " + String.valueOf(sonuc));
        }
    }
}