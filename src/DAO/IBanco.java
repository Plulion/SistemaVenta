package DAO;
   
import Modelo.Bancos;
import java.sql.ResultSet;
import java.util.ArrayList;
import javafx.collections.ObservableList;


public interface IBanco {


    public Bancos listarBanco(String nombreBanco);

    public boolean eliminarBanco(String nombreBanco, int codigoBanco);

    public boolean actualizarBanco(String Banco, int codigoBanco, Bancos banco);

    public boolean agregarBanco(Bancos banco);
    
    public ArrayList obtenerTodos();
}
