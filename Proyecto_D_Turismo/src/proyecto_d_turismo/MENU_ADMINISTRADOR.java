package proyecto_d_turismo;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class MENU_ADMINISTRADOR extends javax.swing.JFrame {
    private DefaultTableModel BXP = new DefaultTableModel();
    ALMACENAMIENTO_DATOS LUGARES;
    public MENU_ADMINISTRADOR(ALMACENAMIENTO_DATOS LUGARES) {
        this.LUGARES = LUGARES;
        initComponents();
    }

    private MENU_ADMINISTRADOR() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        TT_CARGA = new javax.swing.JButton();
        TT_SALIDA = new javax.swing.JButton();
        PANEL_PRINCIPAL = new javax.swing.JPanel();
        ING_DATOS = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        TT_WIFI = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        TT_PRECIO = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TT_CAPACIDAD = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        TT_NOMBRE = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TT_CIUDAD = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        TT_PAIS = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        TT_PETF = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        TT_DIRECCION = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        SAL_DATOS = new javax.swing.JPanel();
        CARGAR_DATOS = new javax.swing.JPanel();
        CONSULTA = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_CONS = new javax.swing.JTable();

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
        ACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACTUALIZARActionPerformed(evt);
            }
        });
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

        TT_CARGA.setBackground(new java.awt.Color(0, 0, 0));
        TT_CARGA.setFont(new java.awt.Font("Felix Titling", 3, 18)); // NOI18N
        TT_CARGA.setForeground(new java.awt.Color(255, 255, 0));
        TT_CARGA.setText("cargar datos");
        TT_CARGA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TT_CARGAActionPerformed(evt);
            }
        });
        jPanel5.add(TT_CARGA);

        TT_SALIDA.setBackground(new java.awt.Color(0, 0, 0));
        TT_SALIDA.setFont(new java.awt.Font("Felix Titling", 3, 18)); // NOI18N
        TT_SALIDA.setForeground(new java.awt.Color(255, 255, 0));
        TT_SALIDA.setText("sALIDA DATOS");
        TT_SALIDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TT_SALIDAActionPerformed(evt);
            }
        });
        jPanel5.add(TT_SALIDA);

        jPanel1.add(jPanel5);

        PANEL_PRINCIPAL.setLayout(new java.awt.CardLayout());

        ING_DATOS.setBackground(new java.awt.Color(0, 0, 0));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(350, 350));
        jPanel7.setLayout(new java.awt.GridLayout(3, 2));

        jLabel19.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("WIFI");
        jPanel7.add(jLabel19);

        TT_WIFI.setBackground(new java.awt.Color(0, 0, 0));
        TT_WIFI.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TT_WIFI.setForeground(new java.awt.Color(255, 255, 255));
        TT_WIFI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        TT_WIFI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TT_WIFIActionPerformed(evt);
            }
        });
        jPanel7.add(TT_WIFI);

        jLabel20.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("precio");
        jPanel7.add(jLabel20);

        TT_PRECIO.setBackground(new java.awt.Color(0, 0, 0));
        TT_PRECIO.setFont(new java.awt.Font("Felix Titling", 2, 18)); // NOI18N
        TT_PRECIO.setForeground(new java.awt.Color(255, 255, 255));
        TT_PRECIO.setText("0.00");
        jPanel7.add(TT_PRECIO);

        jLabel21.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("capacidad");
        jPanel7.add(jLabel21);

        TT_CAPACIDAD.setBackground(new java.awt.Color(0, 0, 0));
        TT_CAPACIDAD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TT_CAPACIDAD.setForeground(new java.awt.Color(255, 255, 255));
        TT_CAPACIDAD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        TT_CAPACIDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TT_CAPACIDADActionPerformed(evt);
            }
        });
        jPanel7.add(TT_CAPACIDAD);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setPreferredSize(new java.awt.Dimension(350, 350));
        jPanel8.setLayout(new java.awt.GridLayout(5, 2));

        jLabel11.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("nombre");
        jPanel8.add(jLabel11);

        TT_NOMBRE.setBackground(new java.awt.Color(0, 0, 0));
        TT_NOMBRE.setFont(new java.awt.Font("Felix Titling", 2, 18)); // NOI18N
        TT_NOMBRE.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.add(TT_NOMBRE);

        jLabel23.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("ciudad");
        jPanel8.add(jLabel23);

        TT_CIUDAD.setBackground(new java.awt.Color(0, 0, 0));
        TT_CIUDAD.setFont(new java.awt.Font("Felix Titling", 2, 18)); // NOI18N
        TT_CIUDAD.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.add(TT_CIUDAD);

        jLabel24.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("PAIS");
        jPanel8.add(jLabel24);

        TT_PAIS.setBackground(new java.awt.Color(0, 0, 0));
        TT_PAIS.setFont(new java.awt.Font("Felix Titling", 2, 18)); // NOI18N
        TT_PAIS.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.add(TT_PAIS);

        jLabel25.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("PET FRIENDLY");
        jPanel8.add(jLabel25);

        TT_PETF.setBackground(new java.awt.Color(0, 0, 0));
        TT_PETF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TT_PETF.setForeground(new java.awt.Color(255, 255, 255));
        TT_PETF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        jPanel8.add(TT_PETF);

        jLabel27.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("DIRECCION");
        jPanel8.add(jLabel27);

        TT_DIRECCION.setBackground(new java.awt.Color(0, 0, 0));
        TT_DIRECCION.setFont(new java.awt.Font("Felix Titling", 2, 18)); // NOI18N
        TT_DIRECCION.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.add(TT_DIRECCION);

        jLabel12.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("INGRESO LUGARES TURISTICOS");

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Felix Titling", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("cargar imagen");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Felix Titling", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("INGRESAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

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

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TB_CONS.setBackground(new java.awt.Color(0, 0, 0));
        TB_CONS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TB_CONS.setForeground(new java.awt.Color(255, 255, 255));
        TB_CONS.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TB_CONS);

        javax.swing.GroupLayout CONSULTALayout = new javax.swing.GroupLayout(CONSULTA);
        CONSULTA.setLayout(CONSULTALayout);
        CONSULTALayout.setHorizontalGroup(
            CONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CONSULTALayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jButton1)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        CONSULTALayout.setVerticalGroup(
            CONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONSULTALayout.createSequentialGroup()
                .addGroup(CONSULTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CONSULTALayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CONSULTALayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PANEL_PRINCIPAL.add(CONSULTA, "card2");

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

    private void TT_WIFIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TT_WIFIActionPerformed
    }//GEN-LAST:event_TT_WIFIActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       boolean wifi = false;
       boolean petf = false;
       String Nombre = TT_NOMBRE.getText();
       String Ciudad= TT_CIUDAD.getText();
       String Pais = TT_PAIS.getText();
       String Direccion = TT_DIRECCION.getText();
       if("SI".equals(TT_WIFI.getSelectedItem().toString())){
           wifi = true;
       }
       if("SI".equals(TT_PETF.getSelectedItem().toString())){
           petf = true;
       }
       if ((Nombre.length() == 10) && (Ciudad.length() == 10) && (Pais.length() == 10) && (Direccion.length() == 30)){
           if (selectedFile != null)
           {
               if (Direccion.length() < 30){
               String espacios ="";
               for(int i=0; i< 50-imagen.length() ; i++)
               {
                  espacios += "-";
               }
               imagen = espacios+imagen;
            }
                LUGARES.Ingresar_Lugar(Nombre,Ciudad,Pais,wifi, petf,Direccion,Double.valueOf(TT_PRECIO.getText()),Integer.parseInt(TT_CAPACIDAD.getSelectedItem().toString()),selectedFile.getAbsolutePath());
           }
           else{
                 LUGARES.Ingresar_Lugar(Nombre,Ciudad,Pais,wifi, petf,Direccion,Double.valueOf(TT_PRECIO.getText()),Integer.parseInt(TT_CAPACIDAD.getSelectedItem().toString()));
           }
       }
       else if ((Nombre.length() <= 10) && (Ciudad.length() <= 10) && (Pais.length() <= 10) && (Direccion.length() <= 30))
       {
           if (Nombre.length() < 10){
               String espacios ="";
               for(int i=0; i< 10-Nombre.length() ; i++)
               {
                  espacios += "-";
               }
               Nombre = espacios+Nombre;
           }
           if (Ciudad.length() < 10){
               String espacios ="";
               for(int i=0; i< 10-Ciudad.length() ; i++)
               {
                  espacios += "-";
               }
               Ciudad = espacios+Ciudad;
           }
           if (Pais.length() < 10){
               String espacios ="";
               for(int i=0; i< 10-Pais.length() ; i++)
               {
                  espacios += "-";
               }
               Pais = espacios+Pais;
           }
           if (Direccion.length() < 30){
               String espacios ="";
               for(int i=0; i< 30-Direccion.length() ; i++)
               {
                  espacios += "-";
               }
               Direccion = espacios+Direccion;
           }
           if (selectedFile != null)
            {
                if (Direccion.length() < 30){
               String espacios ="";
               for(int i=0; i< 50-imagen.length() ; i++)
               {
                  espacios += "-";
               }
               imagen = espacios+imagen;
            }
                LUGARES.Ingresar_Lugar(Nombre,Ciudad,Pais,wifi, petf,Direccion,Double.valueOf(TT_PRECIO.getText()),Integer.parseInt(TT_CAPACIDAD.getSelectedItem().toString()),this.imagen);
            }
           else{
                LUGARES.Ingresar_Lugar(Nombre,Ciudad,Pais,wifi, petf,Direccion,Double.valueOf(TT_PRECIO.getText()),Integer.parseInt(TT_CAPACIDAD.getSelectedItem().toString()));
            }
       }
       else
       {
            System.out.println("FUERA DE RANGO");
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TT_CAPACIDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TT_CAPACIDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TT_CAPACIDADActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String inds [] = {"Codigo","Nombre","PrecioxDia","Capacidad","Pais","Ciudad"};
        BXP.setColumnIdentifiers(inds);
        TB_CONS.setModel(BXP);
        ArrayList<Object[]> listado = this.LUGARES.getListadoLugares();
        for (Object[] lugar: listado){           
            BXP.addRow(new Object[]{lugar[0],lugar[1],String.valueOf(lugar[7]),String.valueOf(lugar[8]),lugar[3],lugar[2]});
            System.out.println(lugar);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TT_SALIDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TT_SALIDAActionPerformed
    JFileChooser chooser = new JFileChooser();
    chooser.setDialogTitle("Seleccione un Directorio");
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    chooser.setAcceptAllFileFilterUsed(false);
    int result = chooser.showOpenDialog(null);
    if (result == JFileChooser.APPROVE_OPTION) {
        File directory = chooser.getSelectedFile();
        File targetFile = new File(directory, "datos.dat");
        File sourceFile = LUGARES.getfile(); // Assuming this returns a File
        
        try {
            if (!targetFile.exists()) {
                if (targetFile.createNewFile()) {
                    Files.copy(sourceFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("Archivo creado: " + targetFile.getAbsolutePath());
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: jdil" + e.getMessage());
            e.printStackTrace(); // Print the full stack trace for debugging
        }
    } else {
        System.out.println("No se seleccionó ningún directorio.");
    }
    }//GEN-LAST:event_TT_SALIDAActionPerformed
    private void TT_CARGAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TT_CARGAActionPerformed
        JFileChooser jFileChooser3 = new JFileChooser();
            jFileChooser3.setAcceptAllFileFilterUsed(false); 
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de datos(*.dat)", "dat");
            jFileChooser3.addChoosableFileFilter(filter); 
            jFileChooser3.setDialogTitle("Selecciona un archivo para cargar los datos");
            if (jFileChooser3.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) 
            {
                File file = jFileChooser3.getSelectedFile();
                ALMACENAMIENTO_DATOS carga = new ALMACENAMIENTO_DATOS(file); 
                LUGARES.Ingresar_Documento(carga.getListadoLugares());
            }
    }//GEN-LAST:event_TT_CARGAActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imágenes", "jpg", "jpeg", "png", "gif");
        fileChooser.addChoosableFileFilter(filter);
        fileChooser.setDialogTitle("Selecciona una imagen para cargar");

        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            imagen = selectedFile.getAbsolutePath();
            // Aquí puedes manejar la imagen seleccionada
            System.out.println("Imagen seleccionada: " + selectedFile.getAbsolutePath());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACTUALIZARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ACTUALIZARActionPerformed
    private static void moveFileToDirectory(File sourceFile, String destinationDirectory) throws IOException {
        Path sourcePath = sourceFile.toPath();
        Path destinationPath = new File(destinationDirectory, sourceFile.getName()).toPath();
        Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
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
    private javax.swing.JButton BT_CONSULTA;
    private javax.swing.JButton BT_ING_DATOS;
    private javax.swing.JPanel CARGAR_DATOS;
    private javax.swing.JPanel CONSULTA;
    private javax.swing.JPanel ING_DATOS;
    private javax.swing.JPanel PANEL_PRINCIPAL;
    private javax.swing.JPanel SAL_DATOS;
    private javax.swing.JTable TB_CONS;
    private javax.swing.JComboBox<String> TT_CAPACIDAD;
    private javax.swing.JButton TT_CARGA;
    private javax.swing.JTextField TT_CIUDAD;
    private javax.swing.JTextField TT_DIRECCION;
    private javax.swing.JTextField TT_NOMBRE;
    private javax.swing.JTextField TT_PAIS;
    private javax.swing.JComboBox<String> TT_PETF;
    private javax.swing.JTextField TT_PRECIO;
    private javax.swing.JButton TT_SALIDA;
    private javax.swing.JComboBox<String> TT_WIFI;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
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
    // End of variables declaration//GEN-END:variables
    private File selectedFile ;
    private String imagen;
}
