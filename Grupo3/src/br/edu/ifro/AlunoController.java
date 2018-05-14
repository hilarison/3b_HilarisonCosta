/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author 04574926279
 */
public class AlunoController implements Initializable {

    @FXML
    private TextField txtnome;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void fechar(ActionEvent event) {
    }

    @FXML
    private void salvar(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aula");
        
        AlunoController aluno1 = new AlunoController();
            
    }
     
}
