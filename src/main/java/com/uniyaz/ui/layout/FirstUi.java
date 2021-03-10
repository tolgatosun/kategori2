package com.uniyaz.ui.layout;

import com.uniyaz.core.domain.Kategori;
import com.uniyaz.core.service.KategoriService;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

import java.util.List;

/**
 * Created by AKARTAL on 8.3.2021.
 */
@Theme("mytheme")
@Widgetset("com.uniyaz.MyAppWidgetset")
public class FirstUi extends UI {


    private VerticalLayout verticalLayout;
    private HorizontalLayout horizontalLayout;
    private TextField textAdField;
    private Button button;
    private HorizontalLayout sampleHorizontalLayout;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        //Main main = new Main();
        //setContent(main);

        verticalLayout = new VerticalLayout();
        verticalLayout.setSizeFull();

//        buildHorizontalLayout();
//        verticalLayout.addComponent(horizontalLayout);

        textAdField = new TextField();
        textAdField.setCaption("Kategori Adı");
        verticalLayout.addComponent(textAdField);

        bıildButton();
        verticalLayout.addComponent(button);

        setContent(verticalLayout);

    }


//    private void buildHorizontalLayout() {
//        horizontalLayout = new HorizontalLayout();
//        horizontalLayout.setSizeFull();
//        horizontalLayout.addComponent(new Label("LABEL1"));
//        horizontalLayout.addComponent(new Label("LABEL2"));
//    }

    private void bıildButton() {
        button = new Button();
        button.setCaption("Kaydet");
        button.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {

                KategoriService kategoriService = new KategoriService();
                kategoriService.addKategori(textAdField.getValue());
                List<Kategori> kategoriList = kategoriService.findById(3);



                Notification.show("Kategori Kaydedildi");
            }


        });
    }

    private void buildSampleHorizontalLayout() {
        sampleHorizontalLayout = new HorizontalLayout();
        sampleHorizontalLayout.addStyleName("outlined");
        sampleHorizontalLayout.setSpacing(false);
        sampleHorizontalLayout.setMargin(false);
        sampleHorizontalLayout.setSizeFull();

        for (int i = 0; i < 3; i++) {
            ComboBox comboBox = new ComboBox();
            sampleHorizontalLayout.addComponent(comboBox);
        }
    }

}
