package com.example.yuuta.medcen;

public class Poli {
    private String namaPoli;
    private String deskripsi;
    private String buka;

    public Poli(String namaPoli, String deskripsi, String buka){
        this.namaPoli = namaPoli;
        this.deskripsi = deskripsi;
        this.buka = buka;
    }

    public String getNamaPoli(){
        return this.namaPoli;
    }

    public void setNamaPoli(String namaPoli){
        this.namaPoli = namaPoli;
    }

    public String getDeskripsi(){
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }

    public String getBuka(){
        return this.buka;
    }

    public void setBuka(String buka){
        this.buka = buka;
    }
}
