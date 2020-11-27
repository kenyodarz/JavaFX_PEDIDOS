package view;

import DAO.ClienteDAO;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import model.Cliente;

import java.net.URL;
import java.util.ResourceBundle;

public class RegistrarClienteController implements Initializable {

    private @FXML Button btnGuardar;
    private @FXML JFXTextField cjNombre;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
    
    @FXML
    void registrarCliente(ActionEvent evt){
        if(cjNombre.getText().isEmpty()){
            return;
        }
        model.Cliente cliente = new Cliente();
        cliente.setNombrecliente(cjNombre.getText().trim());
        ClienteDAO cDAO = new ClienteDAO();
        if(cDAO.guardar(cliente)>0){
            cjNombre.setText("");
        }
    }
    
}
