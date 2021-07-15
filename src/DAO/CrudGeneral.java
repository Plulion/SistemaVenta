package DAO;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public interface CrudGeneral<Clase> {
    
    public ArrayList<Clase> listar(String texto);

    public boolean eliminar(String texto, int id);
    
    public boolean desactivar(String texto, int id);

    public boolean actualizar(String texto, int id, Clase clase);

    public boolean agregar(Clase clase);

    public void obtenerTodos(JTable tabla, DefaultTableModel model);
    
}
