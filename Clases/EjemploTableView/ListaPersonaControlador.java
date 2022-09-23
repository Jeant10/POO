package Controlador;

import Modelo.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;


public class ListaPersonaControlador implements Initializable {

    @FXML
    private Button btnAgregar;

    @FXML
    private TableView<Persona> tblPersonas;

    @FXML
    private TableColumn<?, ?> colNombre;

    @FXML
    private TableColumn<?, ?> colApellido;

    @FXML
    private TableColumn<?, ?> colNUnico;

    @FXML
    private TableColumn<?, ?> colEdad;

    @FXML
    private Button btnAgregar1;

    @FXML
    private Button btnAgregar2;
    private ObservableList<Persona> personas;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        personas = FXCollections.observableArrayList();
        this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.colApellido.setCellValueFactory(new PropertyValueFactory("apellido"));
        this.colNUnico.setCellValueFactory(new PropertyValueFactory("numeroUnico"));
        this.colEdad.setCellValueFactory(new PropertyValueFactory("edad"));


    }



    public void seleccionar(MouseEvent mouseEvent) {
    }

    public void modificar(ActionEvent actionEvent) {
    }

    public void eliminar(ActionEvent actionEvent) {
    }
}