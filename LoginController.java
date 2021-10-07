/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sahar.loginexample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Sahar Al Haddad
 */
public class LoginController implements Initializable {

    @FXML
    private PasswordField passwordTxt;
    @FXML
    private TextField usernameTxt;
    @FXML
    private Button loginBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void login(ActionEvent event) throws IOException {
        
        if (usernameTxt.getText().equals("Admin") && passwordTxt.getText().equals("Admin")){
            App.setRoot("primary");
        }
        else
        {
            System.out.println("Sorry , Login Failed");
        }
    }
    
}
