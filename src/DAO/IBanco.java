package DAO;
   
import Modelo.Bancos;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public interface IBanco {
    

    public Bancos listarBanco(String nombreBanco);

    public boolean eliminarBanco(String nombreBanco, int codigoBanco);

    public boolean actualizarBanco(String Banco, int codigoBanco, Bancos banco);

    public boolean agregarBanco(Bancos banco, JTable tabla, DefaultTableModel model);
    
    public void obtenerTodos(JTable tabla);
}
