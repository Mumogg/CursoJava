package seccion5FlujosDeControl;

import java.text.BreakIterator;

public class SentenciaAwitchCase {
    public static void main(String[] args) {
        int num = 3;
        switch (num){
            case 0:
                System.out.println("el numero es 0");
                break;
            case 1:
                System.out.println("el numero es 1");
                break;
            case 2:
                System.out.println("el numero es 2");
                break;
            case 3:
                System.out.println("el numero es 3");
                break;
            default:
                System.out.println("Caracter desconocido");
        }
    }
}
