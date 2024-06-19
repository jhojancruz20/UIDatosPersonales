import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_Agregar;

    @FXML
    private TextField txt_Altura;

    @FXML
    private TextField txt_Cedula;

    @FXML
    private TextField txt_Correo;

    @FXML
    private TextField txt_Edad;

    @FXML
    private TextField txt_Telefono;

    @FXML
    private TextField txt_nombre;

    @FXML
    private TextArea txta_ListaPersonas;
    
    Persona ob1 = new Persona();

    @FXML
    void in_Agregar(ActionEvent event) {

    }

    @FXML
    void in_Altura(ActionEvent event) {

    }

    @FXML
    void in_Cedula(ActionEvent event) {

    }

    @FXML
    void in_Correo(ActionEvent event) {

    }

    @FXML
    void in_Edad(ActionEvent event) {

    }

    @FXML
    void in_Nombre(ActionEvent event) {

    }

    @FXML
    void in_Telefono(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btn_Agregar != null : "fx:id=\"btn_Agregar\" was not injected: check your FXML file 'Datos_personas.fxml'.";
        assert txt_Altura != null : "fx:id=\"txt_Altura\" was not injected: check your FXML file 'Datos_personas.fxml'.";
        assert txt_Cedula != null : "fx:id=\"txt_Cedula\" was not injected: check your FXML file 'Datos_personas.fxml'.";
        assert txt_Correo != null : "fx:id=\"txt_Correo\" was not injected: check your FXML file 'Datos_personas.fxml'.";
        assert txt_Edad != null : "fx:id=\"txt_Edad\" was not injected: check your FXML file 'Datos_personas.fxml'.";
        assert txt_Telefono != null : "fx:id=\"txt_Telefono\" was not injected: check your FXML file 'Datos_personas.fxml'.";
        assert txt_nombre != null : "fx:id=\"txt_nombre\" was not injected: check your FXML file 'Datos_personas.fxml'.";
        assert txta_ListaPersonas != null : "fx:id=\"txta_ListaPersonas\" was not injected: check your FXML file 'Datos_personas.fxml'.";

    }

}
