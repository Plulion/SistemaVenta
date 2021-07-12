package DAO;
   
import Modelo.Bancos;


public interface IBanco {


    public Bancos listarBanco(String nombreBanco);

    public boolean eliminarBanco(String nombreBanco, int codigoBanco);

    public boolean actualizarBanco(String Banco, int codigoBanco, Bancos banco);

    public boolean agregarBanco(Bancos banco);
}
