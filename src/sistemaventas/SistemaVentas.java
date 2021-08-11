
package sistemaventas;

import Vista.Sistema;
import Vista.Usuario;

import static java.awt.Frame.MAXIMIZED_BOTH;

import javax.swing.UIManager;

//ahora si les tiene que salir el comentario

public class SistemaVentas {

   
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus,NimbusLookAndFeel");
        } catch (Exception e) {
           
        } 
        Usuario  usuario = new Usuario();
        usuario.setVisible(true);
        
        Sistema sistema=new Sistema();
        //sistema.setExtendedState(MAXIMIZED_BOTH);
        sistema.setVisible(true);
        
    }
}
