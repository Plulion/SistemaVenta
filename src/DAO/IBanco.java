package DAO;

import Modelo.Bancos;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public interface IBanco {

    public ArrayList<Bancos> listarBanco(String nombreBanco);

    public boolean eliminarBanco(String nombreBanco, int codigoBanco);

    public boolean actualizarBanco(String Banco, int codigoBanco, Bancos banco);

    public boolean agregarBanco(Bancos banco);

    public void obtenerTodos(JTable tabla, DefaultTableModel model);
}
