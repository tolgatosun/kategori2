package com.uniyaz.core.domain;

public class Kategori extends BaseDomain {


    public  int id;
    public  String ad;

    public Kategori(String ad) {
        this.ad = ad;
    }

    public Kategori(int id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
