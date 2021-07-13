/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.RRSS;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose
 */
public interface IRRSS {

    public ArrayList<RRSS> listarRRSS(String nombreRRSS);

    public boolean eliminarRRSS(String RRSS, int codigoRRSS);

    public boolean actualizarRRSS(String RRSS, int codigoRRSS, RRSS rrss);

    public boolean agregarRRSS(RRSS rrss);

    public void obtenerTodos(JTable tabla, DefaultTableModel model);
}
