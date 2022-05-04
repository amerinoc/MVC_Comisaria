package comisaria.vista;
public class VistaLogin extends javax.swing.JFrame {
    public VistaLogin() {
        initComponents();
        setLocationRelativeTo(null);
    } // fin constructor()

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPass = new javax.swing.JPasswordField();
        componente_JLabel_Ayuda1 = new comisaria.componente.jLabelAyuda.Componente_JLabel_Ayuda();
        btnEntrar = new comisaria.componente.jButton.Componente_JButton_Personalizado();
        componente_JLabel_Personalizado2 = new comisaria.componente.jLabel.Componente_JLabel_Personalizado();
        componente_JLabel_Personalizado1 = new comisaria.componente.jLabel.Componente_JLabel_Personalizado();
        txtUser = new comisaria.componente.textField.Componente_TextField_Personalizado();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPass.setBackground(new java.awt.Color(219, 226, 246));
        txtPass.setText("alberto");
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 130, -1));
        getContentPane().add(componente_JLabel_Ayuda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        btnEntrar.setText("ENTRAR");
        getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        componente_JLabel_Personalizado2.setText("CONTRASEÑA: ");
        getContentPane().add(componente_JLabel_Personalizado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        componente_JLabel_Personalizado1.setText("USUARIO: ");
        getContentPane().add(componente_JLabel_Personalizado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jLabel1.setBackground(new java.awt.Color(219, 226, 246));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondologin.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new VistaLogin().setVisible(true);
                System.out.println("Chache la vista");
            }
        });
    } // fin metodo main()
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public comisaria.componente.jButton.Componente_JButton_Personalizado btnEntrar;
    private comisaria.componente.jLabelAyuda.Componente_JLabel_Ayuda componente_JLabel_Ayuda1;
    private comisaria.componente.jLabel.Componente_JLabel_Personalizado componente_JLabel_Personalizado1;
    private comisaria.componente.jLabel.Componente_JLabel_Personalizado componente_JLabel_Personalizado2;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPasswordField txtPass;
    public comisaria.componente.textField.Componente_TextField_Personalizado txtUser;
    // End of variables declaration//GEN-END:variables
} // fin de la clase
