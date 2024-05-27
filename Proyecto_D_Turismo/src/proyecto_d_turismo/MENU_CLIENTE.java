/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_d_turismo;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.Icon;
/**
 *
 * @author USUARIO
 */
public class MENU_CLIENTE extends javax.swing.JFrame {

    /**
     * Creates new form MENU_CLIENTE
     */
    private String seleccionNpersonas;
    private String seleccionNdias;
    private String seleccionLugar;
    private ArrayList<Object[]> ListaLugares;;
    private Object[] Seleccion;
    ALMACENAMIENTO_DATOS LUGARES;
    ALMACENAMIENTO_CLIENTES CLIENTES;

    public MENU_CLIENTE(ALMACENAMIENTO_DATOS LUGARES, ALMACENAMIENTO_CLIENTES CLIENTES, ArrayList<Object[]> ListaLugares) {
        this.ListaLugares = LUGARES.getListadoLugares();
        this.LUGARES = LUGARES;
        this.CLIENTES = CLIENTES;
        initComponents();
    }

    private MENU_CLIENTE() {
        this.ListaLugares = LUGARES.getListadoLugares();
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        BT_SAL_DATOS = new javax.swing.JButton();
        BT_SAL_DATOS1 = new javax.swing.JButton();
        BT_SAL_DATOS2 = new javax.swing.JButton();
        BT_SAL_DATOS3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        ING_DATOS1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        DESCRIPCION1 = new javax.swing.JLabel();
        DESCRIPCION2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        ComboBoxNPersonas = new javax.swing.JComboBox<>();
        ComboBoxNDias = new javax.swing.JComboBox<>();
        LabelNombre = new javax.swing.JLabel();
        LabelCiudad = new javax.swing.JLabel();
        LabelPais = new javax.swing.JLabel();
        LabelPetF = new javax.swing.JLabel();
        LabelPrecio = new javax.swing.JLabel();
        LabelWifi = new javax.swing.JLabel();
        LabelDesc = new javax.swing.JLabel();
        LabelDir = new javax.swing.JLabel();
        cb_lugar = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(900, 500));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COMPANIA DE TURISMO PEPE'S TRAVELS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Felix Titling", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 902, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(700, 50));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        BT_SAL_DATOS.setBackground(new java.awt.Color(0, 0, 0));
        BT_SAL_DATOS.setFont(new java.awt.Font("Felix Titling", 3, 18)); // NOI18N
        BT_SAL_DATOS.setForeground(new java.awt.Color(255, 255, 0));
        BT_SAL_DATOS.setText("actualizar");
        BT_SAL_DATOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SAL_DATOSActionPerformed(evt);
            }
        });
        jPanel3.add(BT_SAL_DATOS);

        BT_SAL_DATOS1.setBackground(new java.awt.Color(0, 0, 0));
        BT_SAL_DATOS1.setFont(new java.awt.Font("Felix Titling", 3, 18)); // NOI18N
        BT_SAL_DATOS1.setForeground(new java.awt.Color(255, 255, 0));
        BT_SAL_DATOS1.setText("RESERVACION");
        jPanel3.add(BT_SAL_DATOS1);

        BT_SAL_DATOS2.setBackground(new java.awt.Color(0, 0, 0));
        BT_SAL_DATOS2.setFont(new java.awt.Font("Felix Titling", 3, 18)); // NOI18N
        BT_SAL_DATOS2.setForeground(new java.awt.Color(255, 255, 0));
        BT_SAL_DATOS2.setText("CONSULTAS");
        jPanel3.add(BT_SAL_DATOS2);

        BT_SAL_DATOS3.setBackground(new java.awt.Color(0, 0, 0));
        BT_SAL_DATOS3.setFont(new java.awt.Font("Felix Titling", 3, 18)); // NOI18N
        BT_SAL_DATOS3.setForeground(new java.awt.Color(255, 255, 0));
        BT_SAL_DATOS3.setText("FACTURAR");
        jPanel3.add(BT_SAL_DATOS3);

        jPanel1.add(jPanel3);

        jPanel4.setLayout(new java.awt.CardLayout());

        ING_DATOS1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("nombre");

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Felix Titling", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("RESERVAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("reservaciones");

        jLabel14.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CIUDAD:");

        jLabel15.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("pais:");

        jLabel16.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PRECIO:");

        jLabel17.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("pet friendly: ");

        jLabel22.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("wifi:");

        DESCRIPCION1.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        DESCRIPCION1.setForeground(new java.awt.Color(255, 255, 255));
        DESCRIPCION1.setText("direccion:");

        DESCRIPCION2.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        DESCRIPCION2.setForeground(new java.awt.Color(255, 255, 255));
        DESCRIPCION2.setText("capacidad");

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));

        jLabel27.setFont(new java.awt.Font("Felix Titling", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("# personas");

        jLabel28.setFont(new java.awt.Font("Felix Titling", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("#DIAS");

        ComboBoxNPersonas.setBackground(new java.awt.Color(51, 51, 51));
        ComboBoxNPersonas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ComboBoxNPersonas.setForeground(new java.awt.Color(204, 204, 204));
        ComboBoxNPersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        ComboBoxNPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxNPersonasActionPerformed(evt);
            }
        });

        ComboBoxNDias.setBackground(new java.awt.Color(51, 51, 51));
        ComboBoxNDias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ComboBoxNDias.setForeground(new java.awt.Color(204, 204, 204));
        ComboBoxNDias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        ComboBoxNDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxNDiasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxNPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxNDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(ComboBoxNPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(ComboBoxNDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        LabelNombre.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        LabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombre.setText("---------------------------");

        LabelCiudad.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        LabelCiudad.setForeground(new java.awt.Color(255, 255, 255));
        LabelCiudad.setText("---------------------------");

        LabelPais.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        LabelPais.setForeground(new java.awt.Color(255, 255, 255));
        LabelPais.setText("---------------------------");

        LabelPetF.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        LabelPetF.setForeground(new java.awt.Color(255, 255, 255));
        LabelPetF.setText("---------------------------");

        LabelPrecio.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        LabelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        LabelPrecio.setText("---------------------------");

        LabelWifi.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        LabelWifi.setForeground(new java.awt.Color(255, 255, 255));
        LabelWifi.setText("---------------------------");

        LabelDesc.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        LabelDesc.setForeground(new java.awt.Color(255, 255, 255));
        LabelDesc.setText("---------------------------");

        LabelDir.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        LabelDir.setForeground(new java.awt.Color(255, 255, 255));
        LabelDir.setText("---------------------------");

        cb_lugar.setBackground(new java.awt.Color(0, 0, 0));
        cb_lugar.setForeground(new java.awt.Color(255, 255, 255));
        cb_lugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/T" }));
        cb_lugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_lugarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cargar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ING_DATOS1Layout = new javax.swing.GroupLayout(ING_DATOS1);
        ING_DATOS1.setLayout(ING_DATOS1Layout);
        ING_DATOS1Layout.setHorizontalGroup(
            ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ING_DATOS1Layout.createSequentialGroup()
                .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ING_DATOS1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(cb_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ING_DATOS1Layout.createSequentialGroup()
                        .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ING_DATOS1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ING_DATOS1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton4)
                                .addGap(42, 42, 42)))
                        .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ING_DATOS1Layout.createSequentialGroup()
                                .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ING_DATOS1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ING_DATOS1Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(57, 57, 57)))
                                .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelPetF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelWifi, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ING_DATOS1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(ING_DATOS1Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ING_DATOS1Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ING_DATOS1Layout.createSequentialGroup()
                                        .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(ING_DATOS1Layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(LabelPais, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(6, 6, 6)
                        .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                            .addGroup(ING_DATOS1Layout.createSequentialGroup()
                                .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DESCRIPCION1)
                                    .addGroup(ING_DATOS1Layout.createSequentialGroup()
                                        .addComponent(DESCRIPCION2)
                                        .addGap(40, 40, 40)
                                        .addComponent(LabelDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ING_DATOS1Layout.createSequentialGroup()
                    .addContainerGap(705, Short.MAX_VALUE)
                    .addComponent(LabelDir, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(39, 39, 39)))
        );
        ING_DATOS1Layout.setVerticalGroup(
            ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ING_DATOS1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cb_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ING_DATOS1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(DESCRIPCION1)
                            .addComponent(LabelNombre))
                        .addGap(27, 27, 27)
                        .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(DESCRIPCION2)
                            .addComponent(LabelCiudad)
                            .addComponent(LabelDesc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ING_DATOS1Layout.createSequentialGroup()
                        .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ING_DATOS1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(LabelPais)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ING_DATOS1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(LabelPrecio))
                        .addGap(18, 18, 18)
                        .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(LabelPetF)
                            .addComponent(jButton4))
                        .addGap(18, 18, 18)
                        .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelWifi)
                            .addComponent(jLabel22))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(ING_DATOS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ING_DATOS1Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(LabelDir)
                    .addContainerGap(271, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ING_DATOS1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(ING_DATOS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, "card2");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, "card3");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel9, "card4");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel10, "card5");

        jPanel1.add(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxNPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxNPersonasActionPerformed
        seleccionNpersonas = (String) ComboBoxNPersonas.getSelectedItem();
    }//GEN-LAST:event_ComboBoxNPersonasActionPerformed

    private void ComboBoxNDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxNDiasActionPerformed
        seleccionNdias = (String) ComboBoxNDias.getSelectedItem();
    }//GEN-LAST:event_ComboBoxNDiasActionPerformed

    private void BT_SAL_DATOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SAL_DATOSActionPerformed
        ArrayList<Object[]> listado = this.LUGARES.getListadoLugares();
        for (Object[] lugar: listado){           
            cb_lugar.addItem(lugar[1].toString());
        }
    }//GEN-LAST:event_BT_SAL_DATOSActionPerformed

    private void cb_lugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_lugarActionPerformed
        String nombre = cb_lugar.getSelectedItem().toString();
        ArrayList<Object[]> listado = this.LUGARES.getListadoLugares();
        for (Object[] lugar: listado){  
            if (lugar[1].toString().equals(nombre)){
                boolean WIFI = (boolean) lugar[4];
                LabelNombre.setText("");
                LabelNombre.setText(lugar[1].toString());
                LabelCiudad.setText("");
                LabelCiudad.setText(lugar[2].toString());
                LabelPais.setText("");
                LabelPais.setText(lugar[3].toString());
                if ((boolean) lugar[4]){
                    LabelWifi.setText("");
                    LabelWifi.setText("si");
                }
                else{
                    LabelWifi.setText("");
                    LabelWifi.setText("no");
                }
                if ((boolean) lugar[5]){
                    LabelPetF.setText("");
                    LabelPetF.setText("si");
                }
                else{
                    LabelWifi.setText("");
                    LabelWifi.setText("no");
                }
                LabelPrecio.setText("");
                LabelPrecio.setText(lugar[6].toString());
                LabelDir.setText("");
                LabelDir.setText(lugar[7].toString());
                LabelDesc.setText("");
                LabelDesc.setText(lugar[8].toString());
            }
        }
    }//GEN-LAST:event_cb_lugarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println("Lugar seleccionado: " + seleccionLugar);
        LabelNombre.setText(LUGARES.get(seleccionLugar, "NOMBRE"));
        LabelCiudad.setText(LUGARES.get(seleccionLugar, "CIUDAD"));
        LabelPais.setText(LUGARES.get(seleccionLugar, "PAIS"));
        LabelPrecio.setText(LUGARES.get(seleccionLugar, "PRECIO"));
        LabelPetF.setText(LUGARES.get(seleccionLugar, "PETF"));
        LabelWifi.setText(LUGARES.get(seleccionLugar, "WIFI"));
        LabelDir.setText(LUGARES.get(seleccionLugar, "DIRECCION"));
        LabelDesc.setText("Capacidad: " + LUGARES.get(seleccionLugar, "CAPACIDAD"));
        //jButton1.setIcon(LUGARES.get(Seleccion[0].toString(), "DI"));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Anadir_Lugares(){
        for(int i = 0; i < ListaLugares.size(); i ++){
            cb_lugar.addItem(Arrays.toString(ListaLugares.get(i)));
        }
    }
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
            java.util.logging.Logger.getLogger(MENU_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU_CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_CLIENTE().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_SAL_DATOS;
    private javax.swing.JButton BT_SAL_DATOS1;
    private javax.swing.JButton BT_SAL_DATOS2;
    private javax.swing.JButton BT_SAL_DATOS3;
    private javax.swing.JComboBox<String> ComboBoxNDias;
    private javax.swing.JComboBox<String> ComboBoxNPersonas;
    private javax.swing.JLabel DESCRIPCION1;
    private javax.swing.JLabel DESCRIPCION2;
    private javax.swing.JPanel ING_DATOS1;
    private javax.swing.JLabel LabelCiudad;
    private javax.swing.JLabel LabelDesc;
    private javax.swing.JLabel LabelDir;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelPais;
    private javax.swing.JLabel LabelPetF;
    private javax.swing.JLabel LabelPrecio;
    private javax.swing.JLabel LabelWifi;
    private javax.swing.JComboBox<String> cb_lugar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
