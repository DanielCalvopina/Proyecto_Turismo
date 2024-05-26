package proyecto_d_turismo;

import java.io.File;

public class MENU_ADMINISTRADOR extends javax.swing.JFrame {
    
    public MENU_ADMINISTRADOR() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        ACTUALIZAR = new javax.swing.JButton();
        BT_ING_DATOS = new javax.swing.JButton();
        BT_CONSULTA = new javax.swing.JButton();
        BT_CARG_DATOS = new javax.swing.JButton();
        BT_SAL_DATOS = new javax.swing.JButton();
        PANEL_PRINCIPAL = new javax.swing.JPanel();
        SAL_DATOS = new javax.swing.JPanel();
        CARGAR_DATOS = new javax.swing.JPanel();
        CONSULTA = new javax.swing.JPanel();
        CB_BUSCAR = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ING_DATOS = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADMINISTRACION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Felix Titling", 3, 24), new java.awt.Color(102, 102, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(700, 50));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        ACTUALIZAR.setBackground(new java.awt.Color(0, 0, 0));
        ACTUALIZAR.setFont(new java.awt.Font("Felix Titling", 3, 18)); // NOI18N
        ACTUALIZAR.setForeground(new java.awt.Color(255, 255, 0));
        ACTUALIZAR.setText("actualizar");
        jPanel5.add(ACTUALIZAR);

        BT_ING_DATOS.setBackground(new java.awt.Color(0, 0, 0));
        BT_ING_DATOS.setFont(new java.awt.Font("Felix Titling", 3, 18)); // NOI18N
        BT_ING_DATOS.setForeground(new java.awt.Color(255, 255, 0));
        BT_ING_DATOS.setText("Ing DATOS");
        BT_ING_DATOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ING_DATOSActionPerformed(evt);
            }
        });
        jPanel5.add(BT_ING_DATOS);

        BT_CONSULTA.setBackground(new java.awt.Color(0, 0, 0));
        BT_CONSULTA.setFont(new java.awt.Font("Felix Titling", 3, 18)); // NOI18N
        BT_CONSULTA.setForeground(new java.awt.Color(255, 255, 0));
        BT_CONSULTA.setText("consulta");
        BT_CONSULTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CONSULTAActionPerformed(evt);
            }
        });
        jPanel5.add(BT_CONSULTA);

        BT_CARG_DATOS.setBackground(new java.awt.Color(0, 0, 0));
        BT_CARG_DATOS.setFont(new java.awt.Font("Felix Titling", 3, 18)); // NOI18N
        BT_CARG_DATOS.setForeground(new java.awt.Color(255, 255, 0));
        BT_CARG_DATOS.setText("cargar datos");
        jPanel5.add(BT_CARG_DATOS);

        BT_SAL_DATOS.setBackground(new java.awt.Color(0, 0, 0));
        BT_SAL_DATOS.setFont(new java.awt.Font("Felix Titling", 3, 18)); // NOI18N
        BT_SAL_DATOS.setForeground(new java.awt.Color(255, 255, 0));
        BT_SAL_DATOS.setText("sALIDA DATOS");
        jPanel5.add(BT_SAL_DATOS);

        jPanel1.add(jPanel5);

        PANEL_PRINCIPAL.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout SAL_DATOSLayout = new javax.swing.GroupLayout(SAL_DATOS);
        SAL_DATOS.setLayout(SAL_DATOSLayout);
        SAL_DATOSLayout.setHorizontalGroup(
            SAL_DATOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        SAL_DATOSLayout.setVerticalGroup(
            SAL_DATOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        PANEL_PRINCIPAL.add(SAL_DATOS, "card4");

        javax.swing.GroupLayout CARGAR_DATOSLayout = new javax.swing.GroupLayout(CARGAR_DATOS);
        CARGAR_DATOS.setLayout(CARGAR_DATOSLayout);
        CARGAR_DATOSLayout.setHorizontalGroup(
            CARGAR_DATOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        CARGAR_DATOSLayout.setVerticalGroup(
            CARGAR_DATOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        PANEL_PRINCIPAL.add(CARGAR_DATOS, "card5");

        CONSULTA.setBackground(new java.awt.Color(0, 0, 0));

        CB_BUSCAR.setBackground(new java.awt.Color(0, 0, 0));
        CB_BUSCAR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CB_BUSCAR.setForeground(new java.awt.Color(255, 255, 255));
        CB_BUSCAR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CLIENTES", "LUGARES", " " }));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BUSCAR");

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout CONSULTALayout = new javax.swing.GroupLayout(CONSULTA);
        CONSULTA.setLayout(CONSULTALayout);
        CONSULTALayout.setHorizontalGroup(
            CONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CONSULTALayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(CONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CONSULTALayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CONSULTALayout.createSequentialGroup()
                        .addComponent(CB_BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
        );
        CONSULTALayout.setVerticalGroup(
            CONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONSULTALayout.createSequentialGroup()
                .addGroup(CONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CONSULTALayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(CB_BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton1))
                    .addGroup(CONSULTALayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PANEL_PRINCIPAL.add(CONSULTA, "card2");

        ING_DATOS.setBackground(new java.awt.Color(0, 0, 0));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(350, 350));
        jPanel7.setLayout(new java.awt.GridLayout(3, 2));

        jLabel19.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("WIFI");
        jPanel7.add(jLabel19);

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel7.add(jComboBox1);

        jLabel20.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("precio");
        jPanel7.add(jLabel20);

        jTextField15.setBackground(new java.awt.Color(0, 0, 0));
        jTextField15.setFont(new java.awt.Font("Felix Titling", 2, 18)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(jTextField15);

        jLabel21.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("DESCRIPCION");
        jPanel7.add(jLabel21);

        jTextField16.setBackground(new java.awt.Color(0, 0, 0));
        jTextField16.setFont(new java.awt.Font("Felix Titling", 2, 18)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(jTextField16);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setPreferredSize(new java.awt.Dimension(350, 350));
        jPanel8.setLayout(new java.awt.GridLayout(5, 2));

        jLabel11.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("nombre");
        jPanel8.add(jLabel11);

        jTextField18.setBackground(new java.awt.Color(0, 0, 0));
        jTextField18.setFont(new java.awt.Font("Felix Titling", 2, 18)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.add(jTextField18);

        jLabel23.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("ciudad");
        jPanel8.add(jLabel23);

        jTextField19.setBackground(new java.awt.Color(0, 0, 0));
        jTextField19.setFont(new java.awt.Font("Felix Titling", 2, 18)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.add(jTextField19);

        jLabel24.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("PAIS");
        jPanel8.add(jLabel24);

        jTextField20.setBackground(new java.awt.Color(0, 0, 0));
        jTextField20.setFont(new java.awt.Font("Felix Titling", 2, 18)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.add(jTextField20);

        jLabel25.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("PET FRIENDLY");
        jPanel8.add(jLabel25);

        jComboBox2.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        jPanel8.add(jComboBox2);

        jLabel27.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("DIRECCION");
        jPanel8.add(jLabel27);

        jTextField23.setBackground(new java.awt.Color(0, 0, 0));
        jTextField23.setFont(new java.awt.Font("Felix Titling", 2, 18)); // NOI18N
        jTextField23.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.add(jTextField23);

        jLabel12.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("INGRESO LUGARES TURISTICOS");

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Felix Titling", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("cargar imagen");

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Felix Titling", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("INGRESAR");

        javax.swing.GroupLayout ING_DATOSLayout = new javax.swing.GroupLayout(ING_DATOS);
        ING_DATOS.setLayout(ING_DATOSLayout);
        ING_DATOSLayout.setHorizontalGroup(
            ING_DATOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ING_DATOSLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(ING_DATOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ING_DATOSLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ING_DATOSLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(111, 111, 111))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ING_DATOSLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
            .addGroup(ING_DATOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ING_DATOSLayout.createSequentialGroup()
                    .addContainerGap(341, Short.MAX_VALUE)
                    .addComponent(jButton4)
                    .addGap(332, 332, 332)))
        );
        ING_DATOSLayout.setVerticalGroup(
            ING_DATOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ING_DATOSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(ING_DATOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ING_DATOSLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton3)))
                .addGap(0, 100, Short.MAX_VALUE))
            .addGroup(ING_DATOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ING_DATOSLayout.createSequentialGroup()
                    .addContainerGap(378, Short.MAX_VALUE)
                    .addComponent(jButton4)
                    .addGap(32, 32, 32)))
        );

        PANEL_PRINCIPAL.add(ING_DATOS, "card6");

        jPanel1.add(PANEL_PRINCIPAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_ING_DATOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ING_DATOSActionPerformed
        PANEL_PRINCIPAL.removeAll();
        PANEL_PRINCIPAL.add(ING_DATOS);
        PANEL_PRINCIPAL.repaint();
        PANEL_PRINCIPAL.revalidate();        
    }//GEN-LAST:event_BT_ING_DATOSActionPerformed
    private void BT_CONSULTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CONSULTAActionPerformed
        PANEL_PRINCIPAL.removeAll();
        PANEL_PRINCIPAL.add(CONSULTA);
        PANEL_PRINCIPAL.repaint();
        PANEL_PRINCIPAL.revalidate();     
    }//GEN-LAST:event_BT_CONSULTAActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    public void Consulta(File Archivo,String Consultar){
        
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_ADMINISTRADOR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACTUALIZAR;
    private javax.swing.JButton BT_CARG_DATOS;
    private javax.swing.JButton BT_CONSULTA;
    private javax.swing.JButton BT_ING_DATOS;
    private javax.swing.JButton BT_SAL_DATOS;
    private javax.swing.JPanel CARGAR_DATOS;
    private javax.swing.JComboBox<String> CB_BUSCAR;
    private javax.swing.JPanel CONSULTA;
    private javax.swing.JPanel ING_DATOS;
    private javax.swing.JPanel PANEL_PRINCIPAL;
    private javax.swing.JPanel SAL_DATOS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField23;
    // End of variables declaration//GEN-END:variables
}
