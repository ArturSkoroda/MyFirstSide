package com.example.application.views.aboutme;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;



@PageTitle("AboutMe")
@Route(value = "AboutMe", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class AboutMeView extends VerticalLayout {

    public AboutMeView() {
        setSpacing(false);

        Image img = new Image("images/DSC_7554_m-2.png", "placeholder plant");
        img.setWidth("400px");
        add(img);

        H2 header = new H2("Cześć\n" +
                "Nazywam się Artur, krótko o mnie \uD83D\uDE0A\n" +
                "\n" +
                "Jestem doświadczonym kierownikiem z dziesięcioletnim stażem w zarządzaniu zespołami. Cechują mnie również zdobyte umiejętności interpersonalne, w tym umiejętność budowania relacji oraz pracy z zespołem( która jest bardzo ważna).\n" +
                "Posiadam podstawowe umiejętności w języku Java, SQL, JDBC i Hibernate oraz framework Spring, którymi mogę przysłużyć się przy pracy nad aplikacjami internetowymi lub bazami danych. Dysponuję doświadczeniem w pracy z oprogramowaniem NAVISION, MAGENTO, BI Office i platformą Allegro które może być przydatne w przypadku projektów związanych z e-commerce.\n" +
                "Moje mocne strony to pozytywne nastawienie, zaangażowanie oraz komunikatywność. Jestem osobą, która stale dąży do rozwoju i poszukuje pracy pełnej wyzwań.\n" +
                "W swojej dotychczasowej pracy jako Supervisor, zdobyłem doświadczenie w realizacji wskaźników efektywnościowych oraz planów sprzedażowych dla swojego zespołu, nadzorowaniu, szkoleniu oraz zapewnianiu wysokiej jakości pracy podległej grupy specjalistów ds. sprzedaży a także współpracy z QC, HR i Trenerami w zakresie usprawniania i optymalizacji istniejących procesów i procedur.\n"
                );
        header.addClassNames(Margin.Top.XLARGE, Margin.Bottom.MEDIUM);
        add(header);
        add(new Paragraph(""));

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
        setPadding(true);

    }

}
