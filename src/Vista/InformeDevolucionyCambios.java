/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Usuario
 */
public class InformeDevolucionyCambios extends javax.swing.JPanel {

    /**
     * Creates new form InformeDevolucionyCambios
     */
    public InformeDevolucionyCambios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInformeDevolucionyCambios = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        LabelDesde4 = new javax.swing.JLabel();
        txtDesde4 = new javax.swing.JTextField();
        jLabelRut3 = new javax.swing.JLabel();
        txtRut3 = new javax.swing.JTextField();
        txtDvC3 = new javax.swing.JTextField();
        btnBuscar4 = new javax.swing.JButton();
        jLabelHasta4 = new javax.swing.JLabel();
        txtHasta4 = new javax.swing.JTextField();
        jLabelBusquedarangofechas = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        DetalleDevolucion = new javax.swing.JTable();
        jLabelDetalleDevolucionesyCambios = new javax.swing.JLabel();
        jTextBuscar_Devolucion = new javax.swing.JTextField();
        jButtonBuscar4 = new javax.swing.JButton();

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelDesde4.setText("Desde");

        txtDesde4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesde4ActionPerformed(evt);
            }
        });

        jLabelRut3.setText("Rut");

        txtRut3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRut3ActionPerformed(evt);
            }
        });

        txtDvC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDvC3ActionPerformed(evt);
            }
        });

        btnBuscar4.setText("Buscar");
        btnBuscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar4ActionPerformed(evt);
            }
        });

        jLabelHasta4.setText("Hasta");

        jLabelBusquedarangofechas.setText("Busqueda rango fechas ");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addComponent(jLabelHasta4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtHasta4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addComponent(LabelDesde4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(232, 232, 232)
                                .addComponent(jLabelRut3)
                                .addGap(63, 63, 63)
                                .addComponent(txtRut3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txtDvC3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(txtDesde4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(305, 305, 305)
                        .addComponent(btnBuscar4))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jLabelBusquedarangofechas, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(628, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelBusquedarangofechas)
                .addGap(38, 38, 38)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesde4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDesde4)
                    .addComponent(txtRut3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRut3)
                    .addComponent(txtDvC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHasta4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHasta4))
                .addGap(44, 44, 44)
                .addComponent(btnBuscar4)
                .addGap(398, 398, 398))
        );

        DetalleDevolucion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Registro Venta", "Pack", "Destinatario", "Fecha Entrega", "Comuna", "Hora de Entrega", "Estado Devolución"
            }
        ));
        jScrollPane12.setViewportView(DetalleDevolucion);

        jLabelDetalleDevolucionesyCambios.setText("Detalle de Devoluciones y Cambios");

        jButtonBuscar4.setText("Buscar");
        jButtonBuscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInformeDevolucionyCambiosLayout = new javax.swing.GroupLayout(jPanelInformeDevolucionyCambios);
        jPanelInformeDevolucionyCambios.setLayout(jPanelInformeDevolucionyCambiosLayout);
        jPanelInformeDevolucionyCambiosLayout.setHorizontalGroup(
            jPanelInformeDevolucionyCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformeDevolucionyCambiosLayout.createSequentialGroup()
                .addGroup(jPanelInformeDevolucionyCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInformeDevolucionyCambiosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelInformeDevolucionyCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 1322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelInformeDevolucionyCambiosLayout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(jLabelDetalleDevolucionesyCambios)
                        .addGap(155, 155, 155)
                        .addComponent(jTextBuscar_Devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButtonBuscar4)))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanelInformeDevolucionyCambiosLayout.setVerticalGroup(
            jPanelInformeDevolucionyCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformeDevolucionyCambiosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelInformeDevolucionyCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDetalleDevolucionesyCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextBuscar_Devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1588, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelInformeDevolucionyCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelInformeDevolucionyCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDesde4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesde4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesde4ActionPerformed

    private void txtRut3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRut3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRut3ActionPerformed

    private void txtDvC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDvC3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDvC3ActionPerformed

    private void btnBuscar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar4ActionPerformed

    private void jButtonBuscar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscar4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DetalleDevolucion;
    private javax.swing.JLabel LabelDesde4;
    private javax.swing.JButton btnBuscar4;
    private javax.swing.JButton jButtonBuscar4;
    private javax.swing.JLabel jLabelBusquedarangofechas;
    private javax.swing.JLabel jLabelDetalleDevolucionesyCambios;
    private javax.swing.JLabel jLabelHasta4;
    private javax.swing.JLabel jLabelRut3;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanelInformeDevolucionyCambios;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JTextField jTextBuscar_Devolucion;
    private javax.swing.JTextField txtDesde4;
    private javax.swing.JTextField txtDvC3;
    private javax.swing.JTextField txtHasta4;
    private javax.swing.JTextField txtRut3;
    // End of variables declaration//GEN-END:variables
}
