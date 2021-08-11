/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import DAO.ComunaDAO;
import DAO.PackDAO;
import DAO.VentaDAO;
import Modelo.Clientes;
import Modelo.Comunas;
import Modelo.Packs;
import Modelo.Venta;
import java.util.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class MenuVenta extends javax.swing.JPanel {

    DefaultComboBoxModel modeloComboBox = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloCBComunas = new DefaultComboBoxModel();
    Clientes clienteEncontrado;

    /**
     * Creates new form Venta
     */
    public MenuVenta() {
        initComponents();
        combo_packs.setModel(modeloComboBox);
        cb_comuna.setModel(modeloCBComunas);
        try {
            llenarComboBoxPacks();
            llenarComboBoxComunas();
        } catch (SQLException ex) {
            Logger.getLogger(MenuVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void llenarComboBoxPacks() throws SQLException {

        PackDAO iPack = new PackDAO();
        ArrayList<Packs> packs = iPack.obtenerTodosPacks();

        modeloComboBox.removeAllElements();
        DefaultComboBoxModel nuevoModeloComboBox = new DefaultComboBoxModel();

        for (int i = 0; i < packs.size(); i++) {

            nuevoModeloComboBox.addElement(packs.get(i));
        }
        combo_packs.setModel(nuevoModeloComboBox);

    }

    public void llenarComboBoxComunas() throws SQLException {

        ComunaDAO iComuna = new ComunaDAO();
        ArrayList<Comunas> comunas = iComuna.obtenerTodasComunas();

        modeloCBComunas.removeAllElements();
        DefaultComboBoxModel nuevoModeloComboBox = new DefaultComboBoxModel();

        for (int i = 0; i < comunas.size(); i++) {

            nuevoModeloComboBox.addElement(comunas.get(i));
        }
        cb_comuna.setModel(nuevoModeloComboBox);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        input_numeroPedido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        input_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        input_email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        input_rut = new javax.swing.JTextField();
        btn_rut = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        input_telefono = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        input_destinatario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        input_direccion = new javax.swing.JTextField();
        date_entrega = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        input_saludo = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        combo_packs = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_guardar_venta = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cb_comuna = new javax.swing.JComboBox<>();
        input_horaInicio = new javax.swing.JTextField();
        input_horaFin = new javax.swing.JTextField();
        label_subTotal = new javax.swing.JLabel();

        setBackground(java.awt.SystemColor.controlShadow);
        setForeground(java.awt.SystemColor.controlShadow);

        jPanel1.setBackground(java.awt.SystemColor.control);

        jLabel1.setText("Numero pedido");

        jLabel2.setText("Nombre cliente");

        jLabel3.setText("Email");

        jLabel4.setText("Rut");

        btn_rut.setText("Bucar rut");
        btn_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rutActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefono");

        btn_guardar.setText("Guardar");

        btn_cancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input_numeroPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(input_nombre)
                    .addComponent(input_email))
                .addGap(174, 174, 174)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(input_rut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_rut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
                .addGap(18, 18, 18)
                .addComponent(btn_guardar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(input_numeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(input_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_rut))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(input_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(input_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(input_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        jPanel2.setBackground(java.awt.SystemColor.control);

        jLabel6.setText("Nombre destinatario");

        jLabel7.setText("Fecha entrega");

        jLabel8.setText("Dirección");

        date_entrega.setDateFormatString("yyyy-MM-dd");

        jLabel9.setText("Comuna");

        jLabel10.setText("Saludo");

        input_saludo.setColumns(20);
        input_saludo.setRows(5);
        jScrollPane1.setViewportView(input_saludo);

        jLabel11.setText("Pack");

        combo_packs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_packs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_packsActionPerformed(evt);
            }
        });

        jLabel12.setText("Hora inicio entrega");

        jLabel13.setText("Hora fin entrega");

        jLabel14.setText("Sub total:");

        jLabel15.setText("Envio:");

        jLabel16.setText("Total:");

        btn_guardar_venta.setText("Guardar");
        btn_guardar_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_ventaActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        cb_comuna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        label_subTotal.setBackground(java.awt.SystemColor.controlShadow);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(input_destinatario)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(date_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(77, 77, 77))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                    .addComponent(input_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                    .addComponent(cb_comuna, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(combo_packs, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(input_horaFin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                        .addComponent(input_horaInicio, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(label_subTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(90, 90, 90))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar_venta)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(input_destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(combo_packs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(input_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(input_horaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(date_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(input_horaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cb_comuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(label_subTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_guardar_venta)
                            .addComponent(jButton2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rutActionPerformed

        String rut = input_rut.getText();
        VentaDAO iVenta = new VentaDAO();
        clienteEncontrado = iVenta.buscarCliente(rut);

        if (clienteEncontrado == null) {
            JOptionPane.showMessageDialog(null, "Ningun cliente encontrado con el rut ingresado ", "Cliente no encontrado", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        input_nombre.setText(clienteEncontrado.getCLI_NOMBRE());
        input_email.setText(clienteEncontrado.getCLI_CORREO());
        input_rut.setText(clienteEncontrado.getRUT());
        input_telefono.setText(String.valueOf(clienteEncontrado.getCLI_TELEFONO()));
    }//GEN-LAST:event_btn_rutActionPerformed

    private void btn_guardar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_ventaActionPerformed

        String nombreDestinatario = input_destinatario.getText();
        Date fechaEntrega = date_entrega.getDate();
        String direccion = input_direccion.getText();
        String saludo = input_saludo.getText();
        String horaInicio = input_horaInicio.getText();
        String horaFin = input_horaFin.getText();

        if (clienteEncontrado == null) {
            JOptionPane.showMessageDialog(null, "La venta debe estar asociada a un cliente", "Se requiere acción previa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String rutCliente = clienteEncontrado.getRUT();
        int telefonoCliente = clienteEncontrado.getCLI_TELEFONO();
        String correoCliente = clienteEncontrado.getCLI_CORREO();

        if (("".equals(nombreDestinatario)
                || "".equals(direccion))
                || "".equals(saludo)
                || "".equals(horaInicio)
                || "".equals(horaFin)
                || "".equals(rutCliente)
                || "".equals(correoCliente)
                || fechaEntrega == null) {

            JOptionPane.showMessageDialog(null, "Faltan datos por completar", "Se requiere acción previa", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Comunas comuna = (Comunas) cb_comuna.getSelectedItem();
        Packs pack = (Packs) combo_packs.getSelectedItem();

        Venta venta = new Venta(
                rutCliente,
                pack.getIdPack(),
                comuna.getIdComuna(),
                3,
                pack.getPrecio(),
                nombreDestinatario,
                direccion,
                telefonoCliente,
                correoCliente,
                fechaEntrega,
                horaInicio,
                horaFin,
                saludo
        );

        VentaDAO iVenta = new VentaDAO();

        boolean ventaGuardada = iVenta.guardarVenta(venta);
        if (ventaGuardada) {
            JOptionPane.showMessageDialog(null, "Venta guardada con exito", "Ok", JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_btn_guardar_ventaActionPerformed

    private void combo_packsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_packsActionPerformed

        Packs pack = (Packs) combo_packs.getSelectedItem();
        label_subTotal.setText(String.valueOf(pack.getPrecio()));
    }//GEN-LAST:event_combo_packsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_guardar_venta;
    private javax.swing.JButton btn_rut;
    private javax.swing.JComboBox<String> cb_comuna;
    private javax.swing.JComboBox<String> combo_packs;
    private com.toedter.calendar.JDateChooser date_entrega;
    private javax.swing.JTextField input_destinatario;
    private javax.swing.JTextField input_direccion;
    private javax.swing.JTextField input_email;
    private javax.swing.JTextField input_horaFin;
    private javax.swing.JTextField input_horaInicio;
    private javax.swing.JTextField input_nombre;
    private javax.swing.JTextField input_numeroPedido;
    private javax.swing.JTextField input_rut;
    private javax.swing.JTextArea input_saludo;
    private javax.swing.JTextField input_telefono;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_subTotal;
    // End of variables declaration//GEN-END:variables
}
