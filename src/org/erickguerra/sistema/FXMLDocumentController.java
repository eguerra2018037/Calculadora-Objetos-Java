package org.erickguerra.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 *
 * @author programacion
 */
public class FXMLDocumentController implements Initializable {    
    float acum, dato1, dato2, resultado;
    int op;
    @FXML Button btnMasMenos;
    @FXML Button btnCero;
    @FXML Button btnPunto;
    @FXML Button btnIgual;
    @FXML Button btnUno;
    @FXML Button btnDos;
    @FXML Button btnTres;
    @FXML Button btnMas;
    @FXML Button btnCuatro;
    @FXML Button btnCinco;
    @FXML Button btnSeis;
    @FXML Button btnMenos;
    @FXML Button btnSiete;
    @FXML Button btnOcho;
    @FXML Button btnNueve;
    @FXML Button btnMultiplicacion;
    @FXML Button btnCE;
    @FXML Button btnC;
    @FXML Button btnUnoSobreEquis;
    @FXML Button btnDivision;
    @FXML Button btnPorcentaje;
    @FXML Button btnCuadrado;
    @FXML Button btnRaiz;
    @FXML TextField txtValores;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       // int op;
        if(event.getSource()==btnUno)
            txtValores.setText(txtValores.getText() + "1");
        else if(event.getSource()==btnDos)
            txtValores.setText(txtValores.getText()+ "2");
        else if(event.getSource()==btnTres)
            txtValores.setText(txtValores.getText()+ "3");
        else if(event.getSource()==btnCuatro)
            txtValores.setText(txtValores.getText()+ "4");
        else if(event.getSource()==btnCinco)
            txtValores.setText(txtValores.getText()+ "5");
        else if(event.getSource()==btnSeis)
            txtValores.setText(txtValores.getText()+ "6");
        else if(event.getSource()==btnSiete)
            txtValores.setText(txtValores.getText()+ "7");
        else if(event.getSource()==btnOcho)
            txtValores.setText(txtValores.getText()+ "8");
        else if(event.getSource()==btnNueve)
            txtValores.setText(txtValores.getText()+ "9");
        else if(event.getSource()==btnCero)
            txtValores.setText(txtValores.getText()+ "0");
        else if (event.getSource()==btnPunto){
            if(txtValores.getText().equals(""))
                txtValores.setText("0.");
            else if(!txtValores.getText().contains("."))
                txtValores.setText(txtValores.getText()+ ".");
        }else if(event.getSource()==btnMas){
            if(txtValores.getText().equals(""))
                acum = acum;
            else
                acum = acum + Float.parseFloat(txtValores.getText());
            dato1 = acum;
            txtValores.setText("");
            op = 1;
        }else if(event.getSource()==btnMenos){
            if(txtValores.getText().equals(""))
                acum = acum;
            else if(acum==0)
                acum = acum + (Float.parseFloat(txtValores.getText()));
            else
                acum = acum - (Float.parseFloat(txtValores.getText()));
            dato1 = acum;
            txtValores.setText("");
            op = 2;
            
        }else if(event.getSource()==btnMultiplicacion){
            if(txtValores.getText().equals(""))
                acum = acum;
            else{
                if(acum == 0)
                acum = 1;
                acum = acum*(Float.parseFloat(txtValores.getText()));
            dato1 = acum;
            txtValores.setText("");
            op = 3;
            }
            
        }else if(event.getSource()==btnDivision){
            if(txtValores.getText().equals(""))
                acum = acum;
            else if(acum==0)
                acum = Float.parseFloat(txtValores.getText());
            else
                acum = acum / Float.parseFloat(txtValores.getText());
            dato1 = acum;
            txtValores.setText("");
            op = 4;
            
        }else if(event.getSource()==btnUnoSobreEquis){
            dato1 = Float.parseFloat(txtValores.getText());
            resultado = 1/dato1;
            txtValores.setText(String.valueOf(resultado));
            
        }else if(event.getSource()==btnRaiz){
            dato1 = Float.parseFloat(txtValores.getText());
            resultado = (float) Math.sqrt(dato1);
            txtValores.setText(String.valueOf(resultado));
            
        }else if(event.getSource()==btnCuadrado){
            dato1 = Float.parseFloat(txtValores.getText());
            resultado = dato1*dato1;
            txtValores.setText(String.valueOf(resultado));
            
        }else if(event.getSource()==btnPorcentaje){
            dato2 = Float.parseFloat(txtValores.getText());
            resultado = (dato1*dato2)/100;
            txtValores.setText(String.valueOf(resultado));
            
        }else if(event.getSource()==btnMasMenos){
            resultado = -(Float.parseFloat(txtValores.getText()));
            txtValores.setText(String.valueOf(resultado));
            
        }else if(event.getSource()==btnIgual){
            
            if(txtValores.getText().equals("")){
                if((op==1)||(op==2))
                    dato2 = 0;
                else
                    dato2 = 1;
            }else
                dato2 = Float.parseFloat(txtValores.getText());
            
            txtValores.setText("");
            acum = 0;
            
            switch(op){
                case 1: 
                    resultado = dato1+dato2;
                    txtValores.setText(String.valueOf(resultado));
                    break;
                case 2:
                    resultado = dato1-dato2;
                    txtValores.setText(String.valueOf(resultado));
                    break;
                case 3:
                    resultado = dato1*dato2;
                    txtValores.setText(String.valueOf(resultado));
                    break;
                case 4:
                    if(dato2 == 0)
                        txtValores.setText("Math Error: División entre 0");
                    else{
                        resultado = dato1/dato2;
                        txtValores.setText(String.valueOf(resultado));
                    }
                    break;
                default:
                    txtValores.setText(String.valueOf(dato2));
                    break; 
            }
            
        }else if(event.getSource()==btnCE){
            txtValores.setText("");
        
        }else if(event.getSource()==btnC){
            txtValores.setText("");
            dato1 = 0;
            dato2 = 0;
            acum = 0;
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
