package com.uniyaz.core.service;

import com.uniyaz.core.data.KategoriDao;
import com.uniyaz.core.domain.Kategori;

import java.util.List;

public class KategoriService {

    KategoriDao kategoriDao = new KategoriDao();

    public void addKategori(String KategoriAdi)
    {
        kategoriDao.addKategori(KategoriAdi);
    }

    public void deleteKategori(Kategori kategori)
    {
        kategoriDao.deleteKategori(kategori);
    }

    public List<Kategori> findById(int kategoriId)
    {
       return  kategoriDao.findKategoriByKategoriId(kategoriId);
    }

    public List<Kategori> findAll()
    {
        return  kategoriDao.findAll();
    }

}
