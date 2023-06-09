package com.example.application.views.mygit;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;

@PageTitle("My Git")
@Route(value = "My-Git", layout = MainLayout.class)
public class MyGitView extends VerticalLayout {

    public MyGitView() {
        setSpacing(false);

        Image img = new Image("images/Git.PNG", "placeholder plant");
        img.setWidth("200px");
        add(img);

        H2 header = new H2("https://github.com/ArturSkoroda");
        header.addClassNames(Margin.Top.XLARGE, Margin.Bottom.MEDIUM);
        add(header);
        add(new Paragraph("If you want to see my projects"));

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

}
