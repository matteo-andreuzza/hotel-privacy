package com.example.application.views.privacy;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("privacy")
@Route("privacy")
public class PrivacyView extends Composite<VerticalLayout> {

    public PrivacyView() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H3 h3 = new H3();
        FormLayout formLayout2Col = new FormLayout();
        Checkbox checkbox = new Checkbox();
        Checkbox checkbox2 = new Checkbox();
        Checkbox checkbox3 = new Checkbox();
        Checkbox checkbox4 = new Checkbox();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.START);
        getContent().setAlignItems(Alignment.CENTER);
        layoutColumn2.setWidth("100%");
        layoutColumn2.setMaxWidth("800px");
        layoutColumn2.setHeight("min-content");
        h3.setText("Raccolta consenso privacy");
        h3.setWidth("100%");
        formLayout2Col.setWidth("100%");
        checkbox.setLabel("Accetto le condizioni di utilizzo dei dati ai sensi delle normative europee");
        checkbox.setWidth("min-content");
        checkbox2.setLabel("Acconsento alla registrazione dati per successivi soggiorni");
        checkbox2.setWidth("100%");
        checkbox3.setLabel("Desidero ricevere aggiornamenti e offerte via e-mail");
        checkbox3.setWidth("100%");
        checkbox4.setLabel("Acconsento all'utilizzo delle immagini");
        checkbox4.setWidth("100%");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Save");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Cancel");
        buttonSecondary.setWidth("min-content");
        getContent().add(layoutColumn2);
        layoutColumn2.add(h3);
        layoutColumn2.add(formLayout2Col);
        formLayout2Col.add(checkbox);
        layoutColumn2.add(checkbox2);
        layoutColumn2.add(checkbox3);
        layoutColumn2.add(checkbox4);
        layoutColumn2.add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(buttonSecondary);
    }
}
