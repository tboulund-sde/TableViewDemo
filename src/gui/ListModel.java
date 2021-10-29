package gui;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ListModel {
    private ObservableList<PersonModel> people = FXCollections.observableArrayList();
    private ObjectProperty<PersonModel> selectedPerson = new SimpleObjectProperty<>();
    private StringProperty newPersonFirstname = new SimpleStringProperty();
    private StringProperty newPersonLastname = new SimpleStringProperty();

    public void add() {
        people.add(new PersonModel(getNewPersonFirstname().get(), getNewPersonLastname().get()));
    }

    public void remove() {
        people.remove(selectedPerson.get());
    }

    public ObservableList<PersonModel> getPeople() {
        return people;
    }

    public StringProperty getNewPersonFirstname() {
        return newPersonFirstname;
    }

    public StringProperty getNewPersonLastname() {
        return newPersonLastname;
    }

    public ObjectProperty<PersonModel> getSelectedPerson() {
        return selectedPerson;
    }
}
