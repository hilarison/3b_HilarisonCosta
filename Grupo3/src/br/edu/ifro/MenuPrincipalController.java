
package br.edu.ifro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MenuPrincipalController implements Initializable {

    private TextField txtnumer1;

   @FXML
   private TextField txtnumero2,txtresultado;

   @FXML
   private Button btnsoma;
    @FXML
    private TextField txtnumero1;
   
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

    @FXML
    private void abrirCadastroAluno(ActionEvent event) {
       try {
           FXMLLoader fxmlLoader =  new  FXMLLoader ();
    fxmlLoader . setLocation (getClass () . getResource ( " Aluno.fxml " ));
    Scene scene =  new  Scene (fxmlLoader . load(), 900 , 682 );
    Stage stage =  new  Stage ();
    stage. setTitle ( " Cadastrar Aluno " );
    stage. setScene ( scene);
    stage.show();
 }
  catch ( IOException e) {

 } 
    }

    @FXML
    private void fecharProjeto(ActionEvent event) {
    }
    
}
