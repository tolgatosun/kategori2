package com.uniyaz.core.service;

import com.uniyaz.core.data.IcerikDao;
import com.uniyaz.core.data.KategoriDao;
import com.uniyaz.core.domain.Icerik;
import com.uniyaz.core.domain.Kategori;

import java.util.List;

public class IcerikService {

    IcerikDao icerikDao = new IcerikDao();

    public void addKategori(Icerik icerik)
    {
        icerikDao.addIcerik(icerik);
    }

    public void deleteKategori(Icerik icerik)
    {
        icerikDao.deleteIcerik(icerik);
    }

    public List<Icerik> findById(int icerikId)
    {
       return  icerikDao.findIcerikBIcerikId(icerikId);
    }

    public List<Icerik> findIcerikByKategoriId(int kategoriId)
    {
        return  icerikDao.findIcerikByKategoriId(kategoriId);
    }

    public List<Icerik> findAll()
    {
        return  icerikDao.findAll();
    }

}
