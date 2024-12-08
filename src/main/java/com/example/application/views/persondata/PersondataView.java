package com.example.application.views.persondata;
import pdfGenerator;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("person-data")
@Route("")
public class PersondataView extends Composite<VerticalLayout> {

    public PersondataView() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H3 h3 = new H3();
        FormLayout formLayout2Col = new FormLayout();
        TextField name = new TextField();
        TextField surname = new TextField();
        TextField address = new TextField();
        TextField provincia = new TextField();
        TextField country = new TextField();
        DatePicker date = new DatePicker();
        TextField phoneNumber = new TextField();
        EmailField email = new EmailField();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button saveButton = new Button();
        Button buttonSecondary = new Button();
        getContent().addClassName(Gap.LARGE);
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.START);
        getContent().setAlignItems(Alignment.CENTER);
        layoutColumn2.addClassName(Gap.LARGE);
        layoutColumn2.setWidth("100%");
        layoutColumn2.setMaxWidth("800px");
        layoutColumn2.getStyle().set("flex-grow", "1");
        h3.setText("Raccolta del consenso privacy");
        h3.setWidth("100%");
        formLayout2Col.setWidth("100%");
        name.setLabel("Nome");
        surname.setLabel("Cognome");
        address.setLabel("Indirizzo di residenza");
        address.setWidth("min-content");
        provincia.setLabel("Provincia di residenza");
        provincia.setWidth("min-content");
        country.setLabel("Stato di residenza");
        country.setWidth("min-content");
        date.setLabel("Data di nascita");
        phoneNumber.setLabel("Numero di telefono");
        email.setLabel("Email");
        email.setWidth("min-content");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        saveButton.setText("Save");
        saveButton.setWidth("min-content");
        saveButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Cancel");
        buttonSecondary.setWidth("min-content");
        getContent().add(layoutColumn2);
        layoutColumn2.add(h3);
        layoutColumn2.add(formLayout2Col);
        formLayout2Col.add(name);
        formLayout2Col.add(surname);
        formLayout2Col.add(address);
        formLayout2Col.add(provincia);
        formLayout2Col.add(country);
        formLayout2Col.add(date);
        formLayout2Col.add(phoneNumber);
        formLayout2Col.add(email);
        layoutColumn2.add(layoutRow);
        layoutRow.add(saveButton);
        layoutRow.add(buttonSecondary);

        saveButton.addClickListener(e ->
                saveButton.getUI().ifPresent(ui ->
                        ui.navigate("privacy"))
                PdfGenerator.generatePdf(filePath, nome, cognome, email);

        Notification notification = Notification
                .show("pdf generato");
        notification.setPosition(Notification.Position.MIDDLE);
        );
    }
}
