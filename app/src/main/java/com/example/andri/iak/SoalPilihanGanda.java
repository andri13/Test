package com.example.andri.iak;

/**
 * Created by andri on 01/02/18.
 */

public class SoalPilihanGanda {

    public String pertanyaan[] = {
            "Apa nama Ibukota Indonesia ?",
            "Siapa pencipta lagu Indonesia Raya ?",
            "Apa simbol negara Indonesia ?",
            "Kapan diperingatinya Hari Pahlawan ?",
            "Siapa presiden pertama Republik Indonesia ?"
    };

    private String pilihanJawaban[] [] = {
            {"Surabaya", "Yogyakarta", "Medan", "Jakarta"},
            {"Suhud", "R.A Kartini", "W.R Supratman", "Ibu Sud"},
            {"Burung Garuda", "Burung Elang", "Macan Asia", "Harimau Malaya"},
            {"1 Mei", "17 Agustus", "10 November", "1 Januari"},
            {"Megawati Soekarno Putri", "Ir. Soekarno", "B.J Habibie", "Joko Widodo"},
    };

    private String jawabanBenar[] = {
            "Jakarta",
            "W.R Supratman",
            "Burung Garuda",
            "10 November",
            "Ir. Soekarno",
    };

    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //Jawaban 1

    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //Jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //Jawaban3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //Jawaban 4
    public String getPilihanJawaban4(int x){
        String jawaban4 = pilihanJawaban[x][3];
        return jawaban4;
    }

    public String getJawabanBenar (int x) {
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
