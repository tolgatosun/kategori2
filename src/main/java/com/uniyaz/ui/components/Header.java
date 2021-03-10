package com.uniyaz.ui.components;

import com.vaadin.ui.*;

/**
 * Created by AKARTAL on 8.3.2021.
 */
public class Header extends HorizontalLayout {

    ComboBox comboKategori;

    public Header() {
        setSizeFull();

        buildLayout();
    }

    private void buildLayout() {


//        KategoriService kategoriService = new KategoriService();
//        List<Kategori> countriesData = kategoriService.findAll();
//
//        comboKategori = new ComboBox("Kategori Seçiniz", countriesData);
//        comboKategori.addContainerProperty("ad", String.class, null);
//        comboKategori.addContainerProperty("id", Integer.class, 0);
//        comboKategori.setItemCaptionPropertyId("ad");
//        comboKategori.setItemCaptionMode(AbstractSelect.ItemCaptionMode.PROPERTY);
//
//        addComponent(comboKategori);

        MenuBar barmenu = new MenuBar();

        MenuBar.MenuItem kategoriler = barmenu.addItem("Kategoriler", null, null);
        MenuBar.MenuItem kategoriEkle = kategoriler.addItem("Kategori Ekle", null, null);
        MenuBar.MenuItem KategoriListe = kategoriler.addItem("Kategori Liste", null, null);

        MenuBar.MenuItem Icerik = barmenu.addItem("İçerikler", null, null);
        MenuBar.MenuItem icerikEkle = Icerik.addItem("İçerik Ekle", null, null);
        MenuBar.MenuItem icerikListe = Icerik.addItem("İçerik Liste", null, null);


        addComponent(barmenu);

    }
}
