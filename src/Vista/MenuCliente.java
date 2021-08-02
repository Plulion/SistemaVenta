/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import DAO.ClientesDAO;
import Modelo.Clientes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.Size2DSyntax;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Jose
 */
public class MenuCliente extends javax.swing.JPanel {
    DefaultTableModel model;

    /**
     * Creates new form MenuCliente
     */
    public MenuCliente() {
        initComponents();
        ClientesDAO cliente = new ClientesDAO();
        DefaultTableModel model = (DefaultTableModel) table_cliente.getModel();
         this.model = model;
         cliente.obtenerTodos(table_cliente, model);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel20 = new javax.swing.JLabel();
        inputNombreCliente = new javax.swing.JTextField();
        input_Correo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnCancelarCliente = new javax.swing.JButton();
        btnGuardarCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        inputApellidoCliente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        input_telefono = new javax.swing.JTextField();
        LabelNombreCliente = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_cliente = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        inputRut = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        input_celular = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        button_activo = new javax.swing.JRadioButton();
        input_buscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JDateChooser();
        btnEditar = new javax.swing.JButton();

        jLabel20.setText("Correo");

        inputNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNombreClienteActionPerformed(evt);
            }
        });

        input_Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_CorreoActionPerformed(evt);
            }
        });

        jLabel16.setText("Rut");

        btnCancelarCliente.setText("Cancelar");
        btnCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClienteActionPerformed(evt);
            }
        });

        btnGuardarCliente.setText("Guardar");
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido");

        inputApellidoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputApellidoClienteActionPerformed(evt);
            }
        });

        jLabel18.setText("Telefono");

        input_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_telefonoActionPerformed(evt);
            }
        });

        LabelNombreCliente.setText("Nombre");

        table_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rut", "Nombre", "Apellido", "Telefono", "Celular", "Correo", "Fecha Nacimiento", "Activo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_cliente);

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setText("Clientes");

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel21.setText("Clientes");

        inputRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRutActionPerformed(evt);
            }
        });

        jLabel1.setText("Celular");

        input_celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_celularActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha Nacimiento");

        button_activo.setSelected(true);
        button_activo.setText("Activo");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jCalendar1.setDateFormatString("yyyy-MM-dd");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel21)
                                .addGap(31, 31, 31)
                                .addComponent(input_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(input_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputRut, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel16))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_activo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnCancelarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(btnGuardarCliente))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(input_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(input_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnEditar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(button_activo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(inputRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(input_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(inputNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel20)
                                        .addComponent(input_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(inputApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(input_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelarCliente)
                            .addComponent(btnGuardarCliente))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(btnBuscar))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnEditar)
                .addGap(251, 251, 251))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNombreClienteActionPerformed

    }//GEN-LAST:event_inputNombreClienteActionPerformed

    private void input_CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_CorreoActionPerformed

    private void btnCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClienteActionPerformed
       inputRut.setText("");
       inputNombreCliente.setText("");
       inputApellidoCliente.setText("");
       input_telefono.setText("");
       input_celular.setText("");
       input_Correo.setText("");
       jCalendar1.setCalendar(null);
       button_activo.setSelected(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarClienteActionPerformed

    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
        // TODO add your handling code here:
        Clientes cliente;
        if ("".equals(inputRut.getText())) {
            cliente = new Clientes(
                    
                    
                    inputNombreCliente.getText(),
                    inputApellidoCliente.getText(),
                    Integer.parseInt(input_telefono.getText()),
                    Integer.parseInt(input_celular.getText()),
                    input_Correo.getText(),
                    jCalendar1.getDate(),
                    button_activo.isSelected());
                    
       } else {
            cliente = new Clientes(
                    inputRut.getText(),
                    inputNombreCliente.getText(),
                    inputApellidoCliente.getText(),
                    Integer.parseInt(input_telefono.getText()),
                    Integer.parseInt(input_celular.getText()),
                    input_Correo.getText(),
                    jCalendar1.getDate(),

                    button_activo.isSelected());
                    
                    
            
            ClientesDAO iClientes = new ClientesDAO ();
            
            iClientes.agregar(cliente);
            
            inputRut.setText("");
            inputNombreCliente.setText("");
            inputApellidoCliente.setText("");
            input_telefono.setText("");
            input_celular.setText("");
            input_Correo.setText("");
            jCalendar1.setCalendar(null);
            button_activo.setSelected(true);
            
            iClientes.obtenerTodos(table_cliente, model);
            
        }
        
        
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void input_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_telefonoActionPerformed

    private void inputApellidoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputApellidoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputApellidoClienteActionPerformed

    private void input_celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_celularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_celularActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ClientesDAO iClientes = new ClientesDAO ();
        ArrayList<Clientes>listaClientes = iClientes.listar(input_buscar.getText());
        
        model.setRowCount(0);

        Object[] row = new Object[7];

        for (int i = 0; i < listaClientes.size(); i++) {
            row[0] = listaClientes.get(i).getRUT();
            row[1] = listaClientes.get(i).getCLI_NOMBRE();
            row[2] = listaClientes.get(i).getCLI_APELLIDO();
            row[3] = listaClientes.get(i).getCLI_TELEFONO();
            row[4] = listaClientes.get(i).getCLI_CELULAR();
            row[5] = listaClientes.get(i).getCLI_CORREO();
            row[6] = (listaClientes.get(i).getFecha_Nacimiento());
                    
         
             model.addRow(row);
        }


        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void inputRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputRutActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
           if (table_cliente.getSelectedRowCount() == 1) {
       
    String RUT = String.valueOf(table_cliente.getValueAt(table_cliente.getSelectedRow(), 0));    
    String Nombre = String.valueOf(table_cliente.getValueAt(table_cliente.getSelectedRow(), 1));     
    String Apellido = String.valueOf(table_cliente.getValueAt(table_cliente.getSelectedRow(), 2)); 
    String Telefono = String.valueOf(table_cliente.getValueAt(table_cliente.getSelectedRow(), 3)); 
    String Celular = String.valueOf(table_cliente.getValueAt(table_cliente.getSelectedRow(), 4));
    String Correo = String.valueOf(table_cliente.getValueAt(table_cliente.getSelectedRow(), 5));
    String FechaNacimiento = String.valueOf(table_cliente.getValueAt(table_cliente.getSelectedRow(), 6));
    String Activo = String.valueOf(table_cliente.getValueAt(table_cliente.getSelectedRow(), 7));
    
    inputRut.setText(RUT);
    inputNombreCliente.setText(Nombre);
    inputApellidoCliente.setText(Apellido);
    input_telefono.setText(Telefono);
    input_celular.setText(Celular);
    input_Correo.setText(Correo);
               try {
                   jCalendar1.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(FechaNacimiento));
               } catch (ParseException ex) {
                   Logger.getLogger(MenuCliente.class.getName()).log(Level.SEVERE, null, ex);
               }
    button_activo.setSelected(Boolean.parseBoolean(Activo));
    
     } else {
            JOptionPane.showMessageDialog(null, "Primero marque un elemento y luego presione editar ", "Se requiere acción previa", JOptionPane.INFORMATION_MESSAGE);
        }
   
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNombreCliente;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarCliente;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JRadioButton button_activo;
    private javax.swing.JTextField inputApellidoCliente;
    private javax.swing.JTextField inputNombreCliente;
    private javax.swing.JTextField inputRut;
    private javax.swing.JTextField input_Correo;
    private javax.swing.JTextField input_buscar;
    private javax.swing.JTextField input_celular;
    private javax.swing.JTextField input_telefono;
    private com.toedter.calendar.JDateChooser jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_cliente;
    // End of variables declaration//GEN-END:variables
}