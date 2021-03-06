/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import DAO.ArticuloDAO;
import DAO.CategoriaDAO;
import Modelo.Articulos;
import Modelo.Categorias;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.DatePicker;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose: A considerar: El comboBox que muestra todas las categorías no
 * contiene Strings. Sino clases de tipo Categoría. Por lo tanto cada índice es
 * una clase con sus respectivos métodos de getId() y getName(). Los mismo
 * ocurre con la tabla en la columna Categoría. No son Srings sino Clases
 * Categoría. Hago esto para tener siempre los id de cada nombre de categoría. Y
 * así al crear un nuevo articulo que este asociado a una categoría el Id de esa
 * categoría ya esta dentro del mismo comboBox
 */
public class MenuArticulo extends javax.swing.JPanel {

    static DefaultComboBoxModel modeloComboBox = new DefaultComboBoxModel();
    DefaultTableModel model;
    DatePicker date;

    public MenuArticulo() {
        initComponents();
        comboBox_categoria_articulo.setModel(modeloComboBox);
        ArticuloDAO iArticulo = new ArticuloDAO();
        this.model = (DefaultTableModel) table_articulo.getModel();
        iArticulo.obtenerTodos(table_articulo, model);

        try {
            llenarComboBoxCategorias();
        } catch (SQLException ex) {
            Logger.getLogger(MenuArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("empty-statement")
    public static final void llenarComboBoxCategorias() throws SQLException {

        CategoriaDAO iCategoria = new CategoriaDAO();

        try {
            ResultSet categorias = iCategoria.obtenerTodasCategorias();
            modeloComboBox.removeAllElements();

            DefaultComboBoxModel nuevoModeloComboBox = new DefaultComboBoxModel();

            while (categorias.next()) {
                nuevoModeloComboBox.addElement(new Categorias(
                        categorias.getInt("idCatArt"),
                        categorias.getString("CATEGORIA"),
                        categorias.getBoolean("Activo"))
                );
            }
            comboBox_categoria_articulo.setModel(nuevoModeloComboBox);
        } catch (SQLException E) {
            System.err.println("ERROR" + E);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel24 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        input_nombre = new javax.swing.JTextField();
        input_marca = new javax.swing.JTextField();
        input_codigo = new javax.swing.JTextField();
        comboBox_categoria_articulo = new javax.swing.JComboBox<>();
        btn_cancelar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        radio_button_activo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        input_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        input_unidades = new javax.swing.JTextField();
        ComboBox_proveedor = new javax.swing.JComboBox<>();
        input_date = new com.toedter.calendar.JDateChooser();
        jPanel9 = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JButton();
        input_buscar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_articulo = new javax.swing.JTable();
        btn_editar = new javax.swing.JButton();

        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel24.setPreferredSize(new java.awt.Dimension(1232, 232));

        jLabel22.setText("Nombre Artículo");

        jLabel24.setText("Marca");

        jLabel25.setText("Código Artículo");

        jLabel26.setText("Categoría Artículo");

        btn_cancelar.setBackground(java.awt.SystemColor.controlDkShadow);
        btn_cancelar.setForeground(java.awt.SystemColor.control);
        btn_cancelar.setText("Cancelar y limpiar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_guardar.setBackground(java.awt.SystemColor.controlDkShadow);
        btn_guardar.setForeground(java.awt.SystemColor.control);
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        radio_button_activo.setSelected(true);
        radio_button_activo.setText("Activo");

        jLabel1.setText("ID");

        input_id.setEditable(false);

        jLabel2.setText("Fecha vencimiento");

        jLabel3.setText("Proveedor");

        jLabel4.setText("Unidades");

        ComboBox_proveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBox_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_proveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(input_marca)
                    .addComponent(input_id))
                .addGap(63, 63, 63)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(input_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(comboBox_categoria_articulo, 0, 187, Short.MAX_VALUE))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(radio_button_activo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboBox_proveedor, 0, 187, Short.MAX_VALUE)
                                    .addComponent(input_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(input_unidades, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(input_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25)
                        .addComponent(jLabel2))
                    .addComponent(input_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(comboBox_categoria_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel3)
                            .addComponent(ComboBox_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(input_unidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radio_button_activo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        add(jPanel24);

        jPanel9.setPreferredSize(new java.awt.Dimension(1081, 429));

        btn_buscar.setBackground(java.awt.SystemColor.controlDkShadow);
        btn_buscar.setForeground(java.awt.SystemColor.control);
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.BorderLayout());

        table_articulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Código", "Artículo", "Unidades", "F. Vencimiento", "Marca", "Categoria", "Proovedor", "Activo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(table_articulo);

        jPanel2.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        btn_editar.setBackground(java.awt.SystemColor.controlDkShadow);
        btn_editar.setForeground(java.awt.SystemColor.control);
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(input_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        add(jPanel9);
    }// </editor-fold>//GEN-END:initComponents

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange

    }//GEN-LAST:event_formPropertyChange

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        Articulos articulo;

        if (("".equals(input_nombre.getText())
                || "".equals(input_marca.getText()))
                || "".equals(input_unidades.getText())
                || input_date.getDate() == null) {

            JOptionPane.showMessageDialog(null, "Faltan datos por completar ", "Se requiere acción previa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if ("".equals(input_id.getText())) {
            articulo = new Articulos(
                    comboBox_categoria_articulo.getItemAt(comboBox_categoria_articulo.getSelectedIndex()).getId(),
                    input_nombre.getText(),
                    input_marca.getText(),
                    Integer.parseInt(input_unidades.getText()),
                    input_codigo.getText(),
                    input_date.getDate(),
                    radio_button_activo.isSelected()
            );

        } else {
            articulo = new Articulos(
                    Integer.parseInt(input_id.getText()),
                    comboBox_categoria_articulo.getItemAt(comboBox_categoria_articulo.getSelectedIndex()).getId(),
                    input_nombre.getText(),
                    input_marca.getText(),
                    Integer.parseInt(input_unidades.getText()),
                    input_codigo.getText(),
                    input_date.getDate(),
                    radio_button_activo.isSelected()
            );
        }

        ArticuloDAO iArticulo = new ArticuloDAO();

        iArticulo.agregar(articulo);

        //llamo a la funcion cancelar que tambien sirve para limpiar los inputs
        btn_cancelarActionPerformed(evt);

        //reset tabla
        iArticulo.obtenerTodos(table_articulo, model);

    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        ArticuloDAO iArticulo = new ArticuloDAO();
        ArrayList<Articulos> listaArticulos = iArticulo.listar(input_buscar.getText());

        model.setRowCount(0); //esto resetea a 0 la tabla para poder 

        Object[] row = new Object[9];

        for (int i = 0; i < listaArticulos.size(); i++) {
            row[0] = listaArticulos.get(i).getArt_id();
            row[1] = listaArticulos.get(i).getArt_codigo();
            row[2] = listaArticulos.get(i).getArt_descripcion();
            row[3] = listaArticulos.get(i).getArt_stock();
            row[4] = listaArticulos.get(i).getArt_fecha_vencimiento();
            row[5] = listaArticulos.get(i).getArt_marca();
            row[6] = new Categorias(listaArticulos.get(i).getCat_id(), listaArticulos.get(i).getCat_nombre(), true);
            row[7] = listaArticulos.get(i).getProv_nombre();
            row[8] = listaArticulos.get(i).isActivo();

            model.addRow(row);
        }

    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed

        if (table_articulo.getSelectedRowCount() < 1) {
            JOptionPane.showMessageDialog(null, "Primero marque un elemento y luego presione editar ", "Se requiere acción previa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String id = table_articulo.getValueAt(table_articulo.getSelectedRow(), 0).toString();
        String codigo = table_articulo.getValueAt(table_articulo.getSelectedRow(), 1).toString();
        String nombre = table_articulo.getValueAt(table_articulo.getSelectedRow(), 2).toString();
        String unidades = table_articulo.getValueAt(table_articulo.getSelectedRow(), 3).toString();
        String fechaVencimiento = table_articulo.getValueAt(table_articulo.getSelectedRow(), 4).toString();
        String marca = table_articulo.getValueAt(table_articulo.getSelectedRow(), 5).toString();
        Categorias categoria = (Categorias) table_articulo.getValueAt(table_articulo.getSelectedRow(), 6);
        //String proveedor = table_articulo.getValueAt(table_articulo.getSelectedRow(), 7).toString();
        String activo = table_articulo.getValueAt(table_articulo.getSelectedRow(), 8).toString();

        input_id.setText(id);
        input_codigo.setText(codigo);
        input_nombre.setText(nombre);
        input_unidades.setText(unidades);
        input_marca.setText(marca);
        radio_button_activo.setSelected(Boolean.parseBoolean(activo));

        //El siguiente bloque de codigo solo corrige un error en el comboBox
        int size = comboBox_categoria_articulo.getItemCount();
        Categorias catActual;
        for (int i = 0; i < size; i++) {

            catActual = (Categorias) comboBox_categoria_articulo.getItemAt(i);
            if (catActual.getId() == categoria.getId()) {

                comboBox_categoria_articulo.setSelectedIndex(i);
            }
        }

        try {
            input_date.setDate(new SimpleDateFormat("dd-MM-yyyy").parse(fechaVencimiento));
        } catch (ParseException ex) {
            Logger.getLogger(MenuArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed

        input_id.setText("");
        input_codigo.setText("");
        input_nombre.setText("");
        input_unidades.setText("");
        input_marca.setText("");
        input_date.setCalendar(null);
        comboBox_categoria_articulo.getModel().setSelectedItem(null);
        radio_button_activo.setSelected(true);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void ComboBox_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_proveedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_proveedor;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_guardar;
    private static javax.swing.JComboBox<Categorias> comboBox_categoria_articulo;
    private javax.swing.JTextField input_buscar;
    private javax.swing.JTextField input_codigo;
    private com.toedter.calendar.JDateChooser input_date;
    private javax.swing.JTextField input_id;
    private javax.swing.JTextField input_marca;
    private javax.swing.JTextField input_nombre;
    private javax.swing.JTextField input_unidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton radio_button_activo;
    private javax.swing.JTable table_articulo;
    // End of variables declaration//GEN-END:variables
}
