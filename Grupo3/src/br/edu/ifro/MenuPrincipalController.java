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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MenuPrincipalController implements Initializable {

   @FXML
   private TextField txtnumer1, txtnumero2,txtresultado;

   @FXML
   private Button btnsoma;
   
   @FXML
   private void soma(ActionEvent evens){
       Double num1 = Double.parseDouble(txtnumer1.getText());
       Double num2 = Double.parseDouble(txtnumero2.getText());
       Double resultado = Double.parseDouble(txtresultado.getText());
       resultado =num1 +num2;
       
       txtresultado.setText(resultado.toString());
   }
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
}
