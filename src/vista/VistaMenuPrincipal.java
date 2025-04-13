
package vista;


import controlador.ControladorMenuprincipal;
import modelo.ModeloMenuPrincipal;

/**
 *
 * @author iventura
 */
public class VistaMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaMenuPrincipal
     */
    public VistaMenuPrincipal() {
        initComponents();
        ModeloMenuPrincipal modelo = new ModeloMenuPrincipal(this);
        ControladorMenuprincipal controlador = new ControladorMenuprincipal(modelo);
        setControlador(controlador);
        this.setLocationRelativeTo(null);
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
        btnSumVectores = new javax.swing.JButton();
        btnHipotenusa = new javax.swing.JButton();
        btnSumVectores2 = new javax.swing.JButton();
        bntConversiones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu Principal");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnSumVectores.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnSumVectores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-calculadora-60.png"))); // NOI18N
        btnSumVectores.setText("Suma de Vectores");
        btnSumVectores.setToolTipText("");
        btnSumVectores.setAlignmentX(0.5F);
        btnSumVectores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSumVectores.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnHipotenusa.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnHipotenusa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-regla-60.png"))); // NOI18N
        btnHipotenusa.setText("Calculo de Hipotenusa");
        btnHipotenusa.setToolTipText("");
        btnHipotenusa.setAlignmentX(0.5F);
        btnHipotenusa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHipotenusa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnSumVectores2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnSumVectores2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-velocidad-60.png"))); // NOI18N
        btnSumVectores2.setText("MRU");
        btnSumVectores2.setToolTipText("");
        btnSumVectores2.setAlignmentX(0.5F);
        btnSumVectores2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        bntConversiones.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        bntConversiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-medida-60.png"))); // NOI18N
        bntConversiones.setText("Conversiones");
        bntConversiones.setToolTipText("");
        bntConversiones.setActionCommand("   Conversiones");
        bntConversiones.setAlignmentX(0.5F);
        bntConversiones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bntConversiones.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSumVectores2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntConversiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHipotenusa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSumVectores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSumVectores)
                .addGap(18, 18, 18)
                .addComponent(btnHipotenusa)
                .addGap(18, 18, 18)
                .addComponent(bntConversiones)
                .addGap(18, 18, 18)
                .addComponent(btnSumVectores2)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bntConversiones;
    public javax.swing.JButton btnHipotenusa;
    public javax.swing.JButton btnSumVectores;
    public javax.swing.JButton btnSumVectores2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    public void setControlador(ControladorMenuprincipal c){
        btnSumVectores.addActionListener(c);
        btnHipotenusa.addActionListener(c);
        bntConversiones.addActionListener(c);
    }
}
