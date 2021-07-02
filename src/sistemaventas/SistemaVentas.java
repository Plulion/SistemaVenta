
package sistemaventas;

import Vista.Sistema;
import static java.awt.Frame.MAXIMIZED_BOTH;

import javax.swing.UIManager;



public class SistemaVentas {

   
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus,NimbusLookAndFeel");
        } catch (Exception e) {
           
        } 
        Sistema sistema=new Sistema();
        sistema.setExtendedState(MAXIMIZED_BOTH);
        sistema.setVisible(true);
    }
}
