/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Jose
 */
public class MenuBanco extends javax.swing.JPanel {

    /**
     * Creates new form MenuBanco
     */
    public MenuBanco() {
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

        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        label_nombre_banco = new javax.swing.JLabel();
        input_codigo_banco = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        label_codigo_banco = new javax.swing.JLabel();
        input_nombre_banco = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_cancelar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        input_buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_bancos = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        btn_desactivar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();

        setBackground(java.awt.SystemColor.control);
        setForeground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(java.awt.SystemColor.control);
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setBackground(java.awt.SystemColor.control);
        jPanel1.setPreferredSize(new java.awt.Dimension(179, 27));

        label_nombre_banco.setBackground(new java.awt.Color(0, 0, 0));
        label_nombre_banco.setForeground(java.awt.SystemColor.textText);
        label_nombre_banco.setText("Nombre Banco");
        jPanel1.add(label_nombre_banco);

        input_codigo_banco.setBackground(java.awt.SystemColor.controlHighlight);
        input_codigo_banco.setColumns(20);
        input_codigo_banco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_codigo_bancoActionPerformed(evt);
            }
        });
        jPanel1.add(input_codigo_banco);

        jPanel8.add(jPanel1);

        jPanel3.setBackground(java.awt.SystemColor.control);
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        label_codigo_banco.setForeground(new java.awt.Color(0, 0, 0));
        label_codigo_banco.setText("Código");
        jPanel3.add(label_codigo_banco);

        input_nombre_banco.setBackground(java.awt.SystemColor.controlHighlight);
        input_nombre_banco.setColumns(20);
        input_nombre_banco.setName(""); // NOI18N
        input_nombre_banco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nombre_bancoActionPerformed(evt);
            }
        });
        jPanel3.add(input_nombre_banco);

        jPanel8.add(jPanel3);

        jPanel4.add(jPanel8);

        jPanel2.setBackground(java.awt.SystemColor.control);
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cancelar);

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_guardar);

        jPanel4.add(jPanel2);

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 740, 130));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input_buscar.setBackground(java.awt.SystemColor.controlHighlight);

        btn_buscar.setText("Buscar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(input_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(164, 164, 164))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 80));

        tabla_bancos.setAutoCreateRowSorter(true);
        tabla_bancos.setBackground(java.awt.SystemColor.controlHighlight);
        tabla_bancos.setForeground(new java.awt.Color(255, 255, 255));
        tabla_bancos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null,  new Boolean(false)},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Banco", "Código Banco", "Nombre Banco", "Acción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_bancos.setAutoscrolls(false);
        tabla_bancos.setSelectionBackground(java.awt.SystemColor.controlHighlight);
        tabla_bancos.setShowHorizontalLines(true);
        tabla_bancos.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tabla_bancos);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 780, 110));

        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 5);
        flowLayout1.setAlignOnBaseline(true);
        jPanel7.setLayout(flowLayout1);

        btn_desactivar.setText("Desactivar");
        jPanel7.add(btn_desactivar);

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        jPanel7.add(btn_editar);

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 760, 40));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 780, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editarActionPerformed

    private void input_nombre_bancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nombre_bancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nombre_bancoActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        //        Bancos banco = new Bancos(Integer.parseInt(input_codigo_banco.getText()), input_nombre_banco.getText());
        //
        //        ImplementBanco iBanco = new ImplementBanco();
        //        iBanco.agregarBanco(banco);
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void input_codigo_bancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_codigo_bancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_codigo_bancoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_desactivar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JTextField input_buscar;
    private javax.swing.JTextField input_codigo_banco;
    private javax.swing.JTextField input_nombre_banco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_codigo_banco;
    private javax.swing.JLabel label_nombre_banco;
    private javax.swing.JTable tabla_bancos;
    // End of variables declaration//GEN-END:variables
}