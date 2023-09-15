package com.elifr.calculator;

public class Hesapla {

    public int birinciSayi, ikinciSayi;

    public Hesapla(int birinciSayi, int ikinciSayi){
        this.birinciSayi = birinciSayi;
        this.ikinciSayi = ikinciSayi;
    }

    public int toplam(){ return birinciSayi+ikinciSayi; }

    public int fark(){ return birinciSayi-ikinciSayi; }

    public int carpim(){ return birinciSayi*ikinciSayi; }

    public int bolum(){ return birinciSayi/ikinciSayi; }
}
