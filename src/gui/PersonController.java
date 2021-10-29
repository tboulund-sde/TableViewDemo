package gui;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PersonController {

    private ListModel model = new ListModel();

    @FXML
    private TableView<PersonModel> tvPeople;

    @FXML
    private TableColumn<PersonModel, String> tcFirstname;

    @FXML
    private TableColumn<PersonModel, String> tcLastname;

    @FXML
    private TextField txtFirstname;

    @FXML
    private TextField txtLastname;

    public void initialize()
    {
        tvPeople.setItems(model.getPeople());
        model.getSelectedPerson().bind(tvPeople.getSelectionModel().selectedItemProperty());

        tcFirstname.setCellValueFactory(person -> person.getValue().getFirstname());
        tcLastname.setCellValueFactory(person -> person.getValue().getLastname());
        txtFirstname.textProperty().bindBidirectional(model.getNewPersonFirstname());
        txtLastname.textProperty().bindBidirectional(model.getNewPersonLastname());
    }

    @FXML
    public void btnAddClicked() {
        model.add();
    }

    @FXML
    public void btnRemoveClicked() {
        model.remove();
    }
}
