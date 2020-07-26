
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {
    private Modelo modelo;
    private Vista vista;
    
    public Controlador(Modelo modelo,Vista vista){
        this.modelo=modelo;
        this.vista=vista;
        vista.botonCalcular.addActionListener(this);
        vista.botonLimpiar.addActionListener(this);
    }
    
    public void iniciar(){
        vista.setTitle("Calculadora IMC para adultos");
        vista.setResizable(false);
        vista.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
         //Limpiar campos
         if(e.getSource()== vista.botonLimpiar)
        {
            vista.txtAltura.setText("");
            vista.txtPeso.setText("");
            vista.txtEdad.setText("");
            vista.txtIMC.setText("");
            vista.txtResultado.setText("");
        }
         
         
        try{
         // Condicion para que ingrese si o si la altura en metros y con .   
        if(vista.txtAltura.getText().charAt(1)!='.' )
        {
            JOptionPane.showMessageDialog(null,"Ingrese altura en metro con .");
        }
        else
        {
        modelo.setAltura(Double.parseDouble(vista.txtAltura.getText()));
        modelo.setPeso(Double.parseDouble(vista.txtPeso.getText()));
        modelo.setEdad(Integer.parseInt(vista.txtEdad.getText()));
        //Condicion para que la edad , porque no existen personas que tengan -3 años
        if(modelo.getAltura()>=1 && modelo.getPeso() >=0 && modelo.getEdad() >= 18 && modelo.getEdad() <=130)
        {
        
       
        // Calcular
        if(e.getSource()== vista.botonCalcular)
        {
            modelo.setImc(modelo.calcularIMC());
            vista.txtIMC.setText(String.valueOf(modelo.getImc()));
            modelo.setResul(modelo.mostrarResul());
            vista.txtResultado.setText(modelo.getResul());
        }
        }
        //Condicion ya que la calculadora es para adulto, debe ser edad mayor o igual a 18
        else if(modelo.getEdad()<18)
        {
            JOptionPane.showMessageDialog(null, "La calculadora funciona para gente adulta");
        }
        }
    }catch(Exception ex)
    {
        ex.getMessage();
    }
    }
    
    }

