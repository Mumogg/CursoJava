package seccion1to4;

import javax.swing.*;

public class Tarea5 {
    public static void main(String[] args) {

        Double capacidad = Double.valueOf(JOptionPane.showInputDialog("Cuantos litros de gasolina tiene actualmente?"));

        if(capacidad == 70){
            JOptionPane.showMessageDialog(null, "Estanque lleno");
        } else if (capacidad < 70 && capacidad >= 60 ) {
            JOptionPane.showMessageDialog(null, "Estanque casi lleno");
        } else if (capacidad < 59 && capacidad >= 40 ) {
            JOptionPane.showMessageDialog(null, "Estanque 3/4");
        } else if (capacidad < 39 && capacidad >= 35 ) {
            JOptionPane.showMessageDialog(null, "medio tanque");
        } else if (capacidad < 34 && capacidad >= 20 ) {
            JOptionPane.showMessageDialog(null, "suficiente");
        } else if (capacidad < 19 && capacidad >= 1 ) {
            JOptionPane.showMessageDialog(null, "insuficiente");
        }
    }
}
