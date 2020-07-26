
package calculadoraimc2020;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

public class CalculadoraIMC2020 {

    public static void main(String[] args) {
        Modelo m=new Modelo();
        Vista v=new Vista();
        Controlador c=new Controlador(m,v);
        c.iniciar();
        v.setVisible(true);
    }
    
}
