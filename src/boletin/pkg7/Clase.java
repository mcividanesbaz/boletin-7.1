
package boletin.pkg7;

import javax.swing.JOptionPane;


public class Clase {
    public double num1;
    
    public Clase (){
}
    public Clase(double numero1){
        this.num1=numero1;
    
    }  
    public void pedirDato(){
        String respuesta=JOptionPane.showInputDialog("introduce numero");
        num1=Double.parseDouble(respuesta);
      
    }
  
    
   public void comparar(){
     
       if (num1>=0){
           JOptionPane.showMessageDialog(null, "el numro es positivo"+num1);
        }else if(num1<0){
           JOptionPane.showMessageDialog(null, "el numero es negativo"+num1);
        }
   } 
}
