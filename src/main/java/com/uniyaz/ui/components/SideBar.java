package com.uniyaz.ui.components;

import com.sun.xml.internal.messaging.saaj.soap.impl.TextImpl;
import com.uniyaz.core.domain.Icerik;
import com.uniyaz.core.domain.Kategori;
import com.uniyaz.core.service.IcerikService;
import com.uniyaz.core.service.KategoriService;
import com.vaadin.server.*;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.*;

import javax.xml.soap.Text;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by AKARTAL on 8.3.2021.
 */
public class SideBar extends VerticalLayout {

    private Content content;
    private GridLayout gridLayout;

    public SideBar(Content content) {
        this.content = content;
        buildLayout();
    }

    private void buildLayout() {

        KategoriService kategoriService = new KategoriService();
        List<Kategori> kategoriList = kategoriService.findAll();
        Button btnKategori = null;

        for (int i = 0; i < kategoriList.size(); i++) {

            Kategori kategori = kategoriList.get(i);
            btnKategori = new Button();
            btnKategori.setId(String.valueOf(kategori.id));
            btnKategori.setCaption(kategori.ad);
            btnKategori.setSizeFull();
            btnKategori.addClickListener(new MenuButtonClickListener());
            addComponent(btnKategori);
        }


    }

    private class MenuButtonClickListener implements Button.ClickListener {

        @Override
        public void buttonClick(Button.ClickEvent clickEvent) {
            int btnId = Integer.parseInt(clickEvent.getButton().getId());
            IcerikService icerikService = new IcerikService();
            List<Icerik> icerikList = icerikService.findIcerikByKategoriId(btnId);

            gridLayout = new GridLayout();
            gridLayout.addStyleName("outlined");
            gridLayout.setSizeFull();
            gridLayout.removeAllComponents();

            double rowCount = icerikList.size() / 3d;
            int rowCount2 = (int) Math.ceil(rowCount);
            gridLayout.setRows(rowCount2);
            gridLayout.setColumns(3);
            icerikFill(icerikList);
            content.addComponent(gridLayout);

        }

        private void icerikFill(List<Icerik> icerikList) {
            int counter = 0;
            for (int row = 0; row < gridLayout.getRows(); row++) {
                for (int col = 0; col < gridLayout.getColumns(); col++) {
                    if (counter < icerikList.size()) {
                        Icerik icerik = icerikList.get(counter);
                        PanelComponent panelComponent = new PanelComponent(icerik);
                        gridLayout.addComponent(panelComponent);
                        gridLayout.setRowExpandRatio(row, 0.0f);
                        gridLayout.setColumnExpandRatio(col, 0.0f);
                        //gridLayout.setHeight("1500px");
                        counter++;
                    }
                }
            }
        }
    }
}
