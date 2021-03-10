package com.uniyaz.ui.components;

import com.uniyaz.core.domain.Icerik;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.Resource;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.*;

import java.util.List;

/**
 * Created by AKARTAL on 8.3.2021.
 */
public class  PanelComponent extends Panel{

    public PanelComponent(Icerik icerik) {
        Resource resource = new ExternalResource(icerik.foto);
        Image image = new Image("", resource);
        Label label = new Label(icerik.baslik, ContentMode.HTML);

        VaLinkButton linkButton = new VaLinkButton(icerik.baslik);
        linkButton.setId(String.valueOf(icerik.id));
        linkButton.addClickListener(new MenuButtonClickListener());

        //Panel panel = new Panel("");
        //panel.setHeight(300.0f, Unit.PIXELS);
        final VerticalLayout contentLayout = new VerticalLayout();
        //contentLayout.setWidth(250, Unit.PIXELS);
        contentLayout.setSizeFull();
        contentLayout.setSpacing(false);
        contentLayout.addComponent(image);
        contentLayout.setComponentAlignment(image, Alignment.MIDDLE_CENTER);
        contentLayout.addComponent(label);
        contentLayout.setComponentAlignment(label, Alignment.BOTTOM_CENTER);
        setContent(contentLayout);
    }

    private class MenuButtonClickListener implements Button.ClickListener {

        @Override
        public void buttonClick(Button.ClickEvent clickEvent) {
//            Label contentLabel = new Label();
//            contentLabel.setCaption(clickEvent.getButton().getCaption());
//            contentLabel.setSizeUndefined();
//            content.addComponent(contentLabel);
        }
    }


}
