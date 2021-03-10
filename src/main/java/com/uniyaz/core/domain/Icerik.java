package com.uniyaz.core.domain;



public class Icerik extends BaseDomain {


    public  int id;
    public  int kategori_id;
    public  String baslik;
    public  String aciklama;
    public  String foto;

    public Icerik() {
    }

    public Icerik(int id, int kategori_id, String baslik, String aciklama, String foto) {
        this.id = id;
        this.kategori_id = kategori_id;
        this.baslik = baslik;
        this.aciklama = aciklama;
        this.foto = foto;
    }



    public Icerik(int kategori_id, String baslik, String aciklama, String foto) {
        this.kategori_id = kategori_id;
        this.baslik = baslik;
        this.aciklama = aciklama;
        this.foto = foto;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKategori_id() {
        return kategori_id;
    }

    public void setKategori_id(int kategori_id) {
        this.kategori_id = kategori_id;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}

