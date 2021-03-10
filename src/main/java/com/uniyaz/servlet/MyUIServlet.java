package com.uniyaz.servlet;

import com.uniyaz.ui.layout.FirstUi;
import com.uniyaz.ui.layout.LayoutUI;
import com.uniyaz.ui.layout.MyUI;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
@VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
public class MyUIServlet extends VaadinServlet {


}