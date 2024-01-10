package seccion5FlujosDeControl;

import javax.swing.*;

public class Tarea7 {
    public static void main(String[] args) {

        boolean interructor = true;
        int menor = Integer.MAX_VALUE;

            for(int i=0; i<10;i++){
                int x = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero "+(i+1)));
                menor = (x < menor)? x : menor;
            }
            JOptionPane.showMessageDialog(null, "el numero menor es "+ menor);
            if(menor<10){
                JOptionPane.showMessageDialog(null,"El numero "+menor+" es menor a 10");
            }else{
                JOptionPane.showMessageDialog(null,"El numero "+menor+" es mayor a 10");

            }

    }
}
