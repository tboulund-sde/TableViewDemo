package gui;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PersonModel {

    private StringProperty firstname = new SimpleStringProperty();
    private StringProperty lastname = new SimpleStringProperty();

    public PersonModel(String firstname, String lastname) {
        this.getFirstname().set(firstname);
        this.getLastname().set(lastname);
    }

    public StringProperty getFirstname() {
        return firstname;
    }

    public StringProperty getLastname() {
        return lastname;
    }
}
