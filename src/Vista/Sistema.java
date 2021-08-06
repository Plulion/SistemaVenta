package Vista;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.sql.*;

public class Sistema extends JFrame {

    public Sistema() {
        initComponents();
        setTitle("Sistema Ventas Dream Gift");
        setSize(1510, 790);
        setLocationRelativeTo(null);

        MenuCliente menucliente = new MenuCliente();
        jTabbedPane3.add(" Cliente", menucliente);

        MenuCategoriaArticulo menu_categoria_articulo = new MenuCategoriaArticulo();
        jTabbedPane3.add("Categoría articulos", menu_categoria_articulo);

        MenuRRSS menu_rrss = new MenuRRSS();
        jTabbedPane3.add("RRSS", menu_rrss);

        MenuArticulo menu_articulo = new MenuArticulo();
        jTabbedPane3.add("Articulos", menu_articulo);

        MenuBanco menu_banco = new MenuBanco();
        jTabbedPane3.add("Banco", menu_banco);

        MenuComunas menu_comunas = new MenuComunas();
        jTabbedPane3.add("Comunas", menu_comunas);

        MenuPack menu_pack = new MenuPack();
        jTabbedPane3.add("Pack", menu_pack);

        Categoria_Ventas categoria_ventas = new Categoria_Ventas();
        jTabbedPane3.add("Categoria Ventas", categoria_ventas);

        MenuProveedor menu_proveedor = new MenuProveedor();
        jTabbedPane3.add("Proveedor", menu_proveedor);

        menucompras1 menucompras = new menucompras1();
        submenus_compras.add("Solicitud de pedidos", menucompras);

        regfacpro menucompras1 = new regfacpro();
        submenus_compras.add("registro facturas proveedor", menucompras1);

        revfacinv menucompras3 = new revfacinv();
        submenus_compras.add("revision facturas inventariadas", menucompras3);

        MenuVenta menuVenta = new MenuVenta();
        menuV.add("Venta", menuVenta);

        ConfirmacionVenta menuVentas = new ConfirmacionVenta();
        menuV.add("Confirmacion Ventas", menuVentas);

        ListaDestino menuVentas1 = new ListaDestino();
        menuV.add("Lista Destino", menuVentas1);

        ActualizacionDespacho menuVentas2 = new ActualizacionDespacho();
        menuV.add("Actualizacion Despachos", menuVentas2);

        MenuUsuario menuUsuario = new MenuUsuario();
        jTabbedPane3.add("Usuarios", menuUsuario);

//los demas
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        mVentas = new javax.swing.JTabbedPane();
        MenuVentas = new javax.swing.JPanel();
        menuV = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        submenus_compras = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanelInformeVentas = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        LabelDesde = new javax.swing.JLabel();
        txtDesde = new javax.swing.JTextField();
        jLabelRut = new javax.swing.JLabel();
        txtRutCliente2 = new javax.swing.JTextField();
        txtDv = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabelHasta = new javax.swing.JLabel();
        txtHasta = new javax.swing.JTextField();
        jLabelBusquedaRangoFechas = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        DetalleVentas = new javax.swing.JTable();
        jLabelDetalleVenta = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        Buscar_Ventas = new javax.swing.JTextField();
        jPanelDetalleInventario = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        LabelDesde1 = new javax.swing.JLabel();
        txtDesde1 = new javax.swing.JTextField();
        jLabelCategoriaArticulo = new javax.swing.JLabel();
        btnBuscar1 = new javax.swing.JButton();
        jLabelHasta1 = new javax.swing.JLabel();
        txtHasta1 = new javax.swing.JTextField();
        jLabelBusquedaporFechas = new javax.swing.JLabel();
        jLabelProveedor = new javax.swing.JLabel();
        jLabelFechaVenciimiento = new javax.swing.JLabel();
        txtFechaVencimiento = new javax.swing.JTextField();
        jComboBoxCategoriaArticulo = new javax.swing.JComboBox<>();
        jComboBoxProveedor = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        DetalleInventario = new javax.swing.JTable();
        jLabelDetalleInventario = new javax.swing.JLabel();
        Buscar_Inventario = new javax.swing.JTextField();
        jButtonBuscar1 = new javax.swing.JButton();
        jPanelInformeClientes = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        LabelDesde3 = new javax.swing.JLabel();
        txtDesde3 = new javax.swing.JTextField();
        jLabelRut2 = new javax.swing.JLabel();
        txtRut2 = new javax.swing.JTextField();
        txtDv2 = new javax.swing.JTextField();
        btnBuscar3 = new javax.swing.JButton();
        jLabelHasta3 = new javax.swing.JLabel();
        txtHasta3 = new javax.swing.JTextField();
        jLabelbusquedarangofechas = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        DetalleClientes = new javax.swing.JTable();
        jTextBuscar_Cliente = new javax.swing.JTextField();
        jButtonBuscar3 = new javax.swing.JButton();
        jLabelDetalleClientes = new javax.swing.JLabel();
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
        jPanel17 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setPreferredSize(new java.awt.Dimension(1280, 900));
        setSize(new java.awt.Dimension(1300, 780));

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        MenuVentas.setBackground(new java.awt.Color(255, 255, 255));
        MenuVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MenuVentas.setLayout(new java.awt.BorderLayout());
        MenuVentas.add(menuV, java.awt.BorderLayout.CENTER);

        mVentas.addTab("Ventas", MenuVentas);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setLayout(new java.awt.BorderLayout());
        jPanel15.add(submenus_compras, java.awt.BorderLayout.CENTER);

        mVentas.addTab("Compras", jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelDesde.setText("Desde");

        txtDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesdeActionPerformed(evt);
            }
        });

        jLabelRut.setText("Rut");

        txtRutCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutCliente2ActionPerformed(evt);
            }
        });

        txtDv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDvActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabelHasta.setText("Hasta");

        jLabelBusquedaRangoFechas.setText("Busqueda rango fechas ventas");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addComponent(jLabelHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addComponent(LabelDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(232, 232, 232)
                                .addComponent(jLabelRut)
                                .addGap(63, 63, 63)
                                .addComponent(txtRutCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(txtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(305, 305, 305)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jLabelBusquedaRangoFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(628, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelBusquedaRangoFechas)
                .addGap(38, 38, 38)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDesde)
                    .addComponent(txtRutCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRut)
                    .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHasta))
                .addGap(44, 44, 44)
                .addComponent(btnBuscar)
                .addGap(398, 398, 398))
        );

        DetalleVentas.setModel(new javax.swing.table.DefaultTableModel(
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
                "Numero de Pedido", "Rut Cliente", "Nombre Cliente", "Fecha Compra", "Fecha Entrega", "Pack Comprado", "Monto Pagado"
            }
        ));
        jScrollPane9.setViewportView(DetalleVentas);

        jLabelDetalleVenta.setText("Detalle Venta Realizada");

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Buscar_Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_VentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInformeVentasLayout = new javax.swing.GroupLayout(jPanelInformeVentas);
        jPanelInformeVentas.setLayout(jPanelInformeVentasLayout);
        jPanelInformeVentasLayout.setHorizontalGroup(
            jPanelInformeVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformeVentasLayout.createSequentialGroup()
                .addGroup(jPanelInformeVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInformeVentasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelInformeVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 1322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelInformeVentasLayout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(jLabelDetalleVenta)
                        .addGap(201, 201, 201)
                        .addComponent(Buscar_Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(Buscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelInformeVentasLayout.setVerticalGroup(
            jPanelInformeVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformeVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelInformeVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDetalleVenta)
                    .addComponent(Buscar)
                    .addComponent(Buscar_Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Informe Ventas", jPanelInformeVentas);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelDesde1.setText("Desde");

        txtDesde1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesde1ActionPerformed(evt);
            }
        });

        jLabelCategoriaArticulo.setText("Categoria Articulo");

        btnBuscar1.setText("Buscar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        jLabelHasta1.setText("Hasta");

        txtHasta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHasta1ActionPerformed(evt);
            }
        });

        jLabelBusquedaporFechas.setText("Busqueda rango fechas ");

        jLabelProveedor.setText("Proveedor");

        jLabelFechaVenciimiento.setText("Fecha Vencimiento");

        txtFechaVencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaVencimientoActionPerformed(evt);
            }
        });

        jComboBoxCategoriaArticulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jLabelBusquedaporFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelDesde1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHasta1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtHasta1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesde1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGap(303, 303, 303)
                                .addComponent(btnBuscar1))
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel30Layout.createSequentialGroup()
                                        .addComponent(jLabelProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel30Layout.createSequentialGroup()
                                        .addComponent(jLabelFechaVenciimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(67, 67, 67)
                                .addComponent(jLabelCategoriaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxCategoriaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelBusquedaporFechas)
                .addGap(38, 38, 38)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesde1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDesde1)
                    .addComponent(jLabelCategoriaArticulo)
                    .addComponent(jLabelFechaVenciimiento)
                    .addComponent(txtFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCategoriaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHasta1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHasta1)
                            .addComponent(jLabelProveedor))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnBuscar1)
                .addGap(398, 398, 398))
        );

        jPanel3.setLayout(new java.awt.BorderLayout());

        DetalleInventario.setModel(new javax.swing.table.DefaultTableModel(
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
                "Codigo Articulo", "Nombre Articulo", "Stock", "Fecha Vencimiento", "Valor Producto", "Categoria", "Rut Proveedor"
            }
        ));
        jScrollPane10.setViewportView(DetalleInventario);

        jPanel3.add(jScrollPane10, java.awt.BorderLayout.CENTER);

        jLabelDetalleInventario.setText("Detalle Inventario");

        Buscar_Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_InventarioActionPerformed(evt);
            }
        });

        jButtonBuscar1.setText("Buscar");
        jButtonBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDetalleInventarioLayout = new javax.swing.GroupLayout(jPanelDetalleInventario);
        jPanelDetalleInventario.setLayout(jPanelDetalleInventarioLayout);
        jPanelDetalleInventarioLayout.setHorizontalGroup(
            jPanelDetalleInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetalleInventarioLayout.createSequentialGroup()
                .addGroup(jPanelDetalleInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDetalleInventarioLayout.createSequentialGroup()
                        .addGroup(jPanelDetalleInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDetalleInventarioLayout.createSequentialGroup()
                                .addGap(396, 396, 396)
                                .addComponent(jLabelDetalleInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(185, 185, 185)
                                .addComponent(Buscar_Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jButtonBuscar1))
                            .addGroup(jPanelDetalleInventarioLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelDetalleInventarioLayout.setVerticalGroup(
            jPanelDetalleInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetalleInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelDetalleInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDetalleInventario)
                    .addComponent(Buscar_Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        jTabbedPane4.addTab("Informe Inventario", jPanelDetalleInventario);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelDesde3.setText("Desde");

        txtDesde3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesde3ActionPerformed(evt);
            }
        });

        jLabelRut2.setText("Rut");

        txtRut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRut2ActionPerformed(evt);
            }
        });

        txtDv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDv2ActionPerformed(evt);
            }
        });

        btnBuscar3.setText("Buscar");
        btnBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar3ActionPerformed(evt);
            }
        });

        jLabelHasta3.setText("Hasta");

        jLabelbusquedarangofechas.setText("Busqueda rango fechas ");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addComponent(jLabelHasta3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtHasta3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel31Layout.createSequentialGroup()
                                .addComponent(LabelDesde3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(232, 232, 232)
                                .addComponent(jLabelRut2)
                                .addGap(63, 63, 63)
                                .addComponent(txtRut2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txtDv2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(txtDesde3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(305, 305, 305)
                        .addComponent(btnBuscar3))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jLabelbusquedarangofechas, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(628, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelbusquedarangofechas)
                .addGap(38, 38, 38)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesde3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDesde3)
                    .addComponent(txtRut2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRut2)
                    .addComponent(txtDv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHasta3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHasta3))
                .addGap(44, 44, 44)
                .addComponent(btnBuscar3)
                .addGap(398, 398, 398))
        );

        DetalleClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Pack", "Pack", "Fecha Registro", "Cliente", "Estado", "Comuna"
            }
        ));
        jScrollPane11.setViewportView(DetalleClientes);

        jTextBuscar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscar_ClienteActionPerformed(evt);
            }
        });

        jButtonBuscar3.setText("Buscar");
        jButtonBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscar3ActionPerformed(evt);
            }
        });

        jLabelDetalleClientes.setText("Detalle Clientes");

        javax.swing.GroupLayout jPanelInformeClientesLayout = new javax.swing.GroupLayout(jPanelInformeClientes);
        jPanelInformeClientes.setLayout(jPanelInformeClientesLayout);
        jPanelInformeClientesLayout.setHorizontalGroup(
            jPanelInformeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformeClientesLayout.createSequentialGroup()
                .addGroup(jPanelInformeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInformeClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelInformeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 1322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelInformeClientesLayout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(jLabelDetalleClientes)
                        .addGap(243, 243, 243)
                        .addComponent(jTextBuscar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButtonBuscar3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelInformeClientesLayout.setVerticalGroup(
            jPanelInformeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformeClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelInformeClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBuscar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar3)
                    .addComponent(jLabelDetalleClientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Informe Clientes", jPanelInformeClientes);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Informe Devolución y Cambios", jPanelInformeDevolucionyCambios);

        jPanel16.add(jTabbedPane4, java.awt.BorderLayout.CENTER);

        mVentas.addTab("Informes", jPanel16);

        jPanel17.setBackground(new java.awt.Color(0, 204, 204));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jTabbedPane3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.add(jTabbedPane3, java.awt.BorderLayout.CENTER);

        mVentas.addTab("Administrador", jPanel17);

        jPanel2.add(mVentas, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/5.png"))); // NOI18N
        jPanel1.add(jLabel2);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema Ventas Dream Gifts");
        jPanel1.add(jLabel1);

        jPanel5.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesdeActionPerformed

    private void txtRutCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutCliente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutCliente2ActionPerformed

    private void txtDvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDvActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarActionPerformed

    private void Buscar_VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_VentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Buscar_VentasActionPerformed

    private void txtDesde1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesde1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesde1ActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void txtHasta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHasta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHasta1ActionPerformed

    private void txtFechaVencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaVencimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaVencimientoActionPerformed

    private void Buscar_InventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_InventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Buscar_InventarioActionPerformed

    private void jButtonBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscar1ActionPerformed

    private void txtDesde3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesde3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesde3ActionPerformed

    private void txtRut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRut2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRut2ActionPerformed

    private void txtDv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDv2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDv2ActionPerformed

    private void btnBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar3ActionPerformed

    private void jTextBuscar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscar_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscar_ClienteActionPerformed

    private void jButtonBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscar3ActionPerformed

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

    private void btnAgregarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCliente1ActionPerformed

    private void btnCancelaCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelaCliente1ActionPerformed

    private void txtDireccionCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionCliente1ActionPerformed

    private void txtNombreCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCliente1ActionPerformed

    private void Boton_Editar_ComunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Editar_ComunasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_Editar_ComunasActionPerformed

    private void Boton_Guardar_ComunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Guardar_ComunasActionPerformed

//        try{
//            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/nombre", "root", ""); // primera comillas ruta y nombre de la ruta que nos queremos conectar, segundas comillas nombre base de datos (si es que lo tiene), tercera tiene contraseña base de datos, si es que la tiene
//            //root si no tiene nombre, y la pass asi no mas
//            PreparedStatement pst = cn.prepareStatement("insert into comumas values(?,?,?)"); // generar objeto y cada ? es una columna
//            pst.setString(1, Codigo_Comunas.getText().trim());
//            pst.setString(2, Nombre_Comunas.getText().trim()); //Trim quita espacios
//            pst.setString(3, "0");
//            pst.executeUpdate();
//
//            Codigo_Comunas.setText("");
//            Nombre_Comunas.setText("");
//
//        }catch (Exception e) {
//
//        }
    }//GEN-LAST:event_Boton_Guardar_ComunasActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnCancelaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelaClienteActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void txtTelefonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoClienteActionPerformed

    private void txtDireccionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionClienteActionPerformed

    private void txtDvClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDvClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDvClienteActionPerformed

    private void txtRutClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutClienteActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
//        if(txtNombreCliente.getText().equals("")){
//            LabelNombreCliente.setForeground(new Color(102,102,102));
//        }else{
//            LabelNombreCliente.setText("Nombre");
//            LabelNombreCliente.setForeground(new Color(0,153,51));
//        }
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField Buscar_Inventario;
    private javax.swing.JTextField Buscar_Ventas;
    private javax.swing.JTable DetalleClientes;
    private javax.swing.JTable DetalleDevolucion;
    private javax.swing.JTable DetalleInventario;
    private javax.swing.JTable DetalleVentas;
    private javax.swing.JLabel LabelDesde;
    private javax.swing.JLabel LabelDesde1;
    private javax.swing.JLabel LabelDesde3;
    private javax.swing.JLabel LabelDesde4;
    private javax.swing.JPanel MenuVentas;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscar3;
    private javax.swing.JButton btnBuscar4;
    private javax.swing.JButton jButtonBuscar1;
    private javax.swing.JButton jButtonBuscar3;
    private javax.swing.JButton jButtonBuscar4;
    private javax.swing.JComboBox<String> jComboBoxCategoriaArticulo;
    private javax.swing.JComboBox<String> jComboBoxProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBusquedaRangoFechas;
    private javax.swing.JLabel jLabelBusquedaporFechas;
    private javax.swing.JLabel jLabelBusquedarangofechas;
    private javax.swing.JLabel jLabelCategoriaArticulo;
    private javax.swing.JLabel jLabelDetalleClientes;
    private javax.swing.JLabel jLabelDetalleDevolucionesyCambios;
    private javax.swing.JLabel jLabelDetalleInventario;
    private javax.swing.JLabel jLabelDetalleVenta;
    private javax.swing.JLabel jLabelFechaVenciimiento;
    private javax.swing.JLabel jLabelHasta;
    private javax.swing.JLabel jLabelHasta1;
    private javax.swing.JLabel jLabelHasta3;
    private javax.swing.JLabel jLabelHasta4;
    private javax.swing.JLabel jLabelProveedor;
    private javax.swing.JLabel jLabelRut;
    private javax.swing.JLabel jLabelRut2;
    private javax.swing.JLabel jLabelRut3;
    private javax.swing.JLabel jLabelbusquedarangofechas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelDetalleInventario;
    private javax.swing.JPanel jPanelInformeClientes;
    private javax.swing.JPanel jPanelInformeDevolucionyCambios;
    private javax.swing.JPanel jPanelInformeVentas;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextBuscar_Cliente;
    private javax.swing.JTextField jTextBuscar_Devolucion;
    private javax.swing.JTabbedPane mVentas;
    private javax.swing.JTabbedPane menuV;
    private javax.swing.JTabbedPane submenus_compras;
    private javax.swing.JTextField txtDesde;
    private javax.swing.JTextField txtDesde1;
    private javax.swing.JTextField txtDesde3;
    private javax.swing.JTextField txtDesde4;
    private javax.swing.JTextField txtDv;
    private javax.swing.JTextField txtDv2;
    private javax.swing.JTextField txtDvC3;
    private javax.swing.JTextField txtFechaVencimiento;
    private javax.swing.JTextField txtHasta;
    private javax.swing.JTextField txtHasta1;
    private javax.swing.JTextField txtHasta3;
    private javax.swing.JTextField txtHasta4;
    private javax.swing.JTextField txtRut2;
    private javax.swing.JTextField txtRut3;
    private javax.swing.JTextField txtRutCliente2;
    // End of variables declaration//GEN-END:variables
}
