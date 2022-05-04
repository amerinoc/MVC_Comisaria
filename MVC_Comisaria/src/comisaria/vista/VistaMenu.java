/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comisaria.vista;

/**
 *
 * @author usuario
 */
public class VistaMenu extends javax.swing.JFrame {

    /**
     * Creates new form VistaMenu
     */
    public VistaMenu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMuestraVehiculos = new comisaria.componente.jButton.Componente_JButton_Personalizado();
        btnMuestraCriminales = new comisaria.componente.jButton.Componente_JButton_Personalizado();
        btnMuestraPatrol = new comisaria.componente.jButton.Componente_JButton_Personalizado();
        btnMuestraPoli = new comisaria.componente.jButton.Componente_JButton_Personalizado();
        btnCriminales = new comisaria.componente.jButton.Componente_JButton_Personalizado();
        btnZonas = new comisaria.componente.jButton.Componente_JButton_Personalizado();
        componente_JLabel_Ayuda1 = new comisaria.componente.jLabelAyuda.Componente_JLabel_Ayuda();
        btnAtras = new comisaria.componente.jButton.Componente_JButton_Personalizado();
        btnCeldas = new comisaria.componente.jButton.Componente_JButton_Personalizado();
        btnRecluidos = new comisaria.componente.jButton.Componente_JButton_Personalizado();
        btnRondasPatrol = new comisaria.componente.jButton.Componente_JButton_Personalizado();
        btnPolis = new comisaria.componente.jButton.Componente_JButton_Personalizado();
        btnPatrullas = new comisaria.componente.jButton.Componente_JButton_Personalizado();
        btnVigilancia = new comisaria.componente.jButton.Componente_JButton_Personalizado();
        btnDepartamentos = new comisaria.componente.jButton.Componente_JButton_Personalizado();
        btnRondasPoli = new comisaria.componente.jButton.Componente_JButton_Personalizado();
        lblTxtMenu = new comisaria.componente.jLabel.Componente_JLabel_Personalizado();
        lblFondoMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMuestraVehiculos.setText("GESTIÓN VEHÍCULOS");
        getContentPane().add(btnMuestraVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 190, -1));

        btnMuestraCriminales.setText("GESTIÓN CRIMINALES");
        getContentPane().add(btnMuestraCriminales, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 190, -1));

        btnMuestraPatrol.setText("GESTIÓN PATRULLAS");
        getContentPane().add(btnMuestraPatrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 190, -1));

        btnMuestraPoli.setText("GESTIÓN POLICÍAS");
        getContentPane().add(btnMuestraPoli, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 190, -1));

        btnCriminales.setText("CRIMINALES");
        getContentPane().add(btnCriminales, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 120, -1));

        btnZonas.setText("ZONAS");
        getContentPane().add(btnZonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 120, -1));
        getContentPane().add(componente_JLabel_Ayuda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        btnAtras.setText("ATRÁS");
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 90, 30));

        btnCeldas.setText("CELDAS");
        getContentPane().add(btnCeldas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        btnRecluidos.setText("RECLUIDOS");
        getContentPane().add(btnRecluidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 110, -1));

        btnRondasPatrol.setText("RONDAS");
        getContentPane().add(btnRondasPatrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 120, -1));

        btnPolis.setText("POLICÍAS");
        getContentPane().add(btnPolis, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 110, -1));

        btnPatrullas.setText("PATRULLAS");
        getContentPane().add(btnPatrullas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 120, -1));

        btnVigilancia.setText("VIGILANCIA");
        getContentPane().add(btnVigilancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 120, -1));

        btnDepartamentos.setText("DEPARTAMENTOS");
        getContentPane().add(btnDepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 160, -1));

        btnRondasPoli.setText("RONDAS");
        btnRondasPoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRondasPoliActionPerformed(evt);
            }
        });
        getContentPane().add(btnRondasPoli, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, -1));

        lblTxtMenu.setText("ELIGE UNA OPCIÓN");
        getContentPane().add(lblTxtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 180, 50));

        lblFondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondomenu.jpg"))); // NOI18N
        getContentPane().add(lblFondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRondasPoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRondasPoliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRondasPoliActionPerformed

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
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public comisaria.componente.jButton.Componente_JButton_Personalizado btnAtras;
    public comisaria.componente.jButton.Componente_JButton_Personalizado btnCeldas;
    public comisaria.componente.jButton.Componente_JButton_Personalizado btnCriminales;
    public comisaria.componente.jButton.Componente_JButton_Personalizado btnDepartamentos;
    public comisaria.componente.jButton.Componente_JButton_Personalizado btnMuestraCriminales;
    public comisaria.componente.jButton.Componente_JButton_Personalizado btnMuestraPatrol;
    public comisaria.componente.jButton.Componente_JButton_Personalizado btnMuestraPoli;
    public comisaria.componente.jButton.Componente_JButton_Personalizado btnMuestraVehiculos;
    public comisaria.componente.jButton.Componente_JButton_Personalizado btnPatrullas;
    public comisaria.componente.jButton.Componente_JButton_Personalizado btnPolis;
    public comisaria.componente.jButton.Componente_JButton_Personalizado btnRecluidos;
    public comisaria.componente.jButton.Componente_JButton_Personalizado btnRondasPatrol;
    public comisaria.componente.jButton.Componente_JButton_Personalizado btnRondasPoli;
    public comisaria.componente.jButton.Componente_JButton_Personalizado btnVigilancia;
    public comisaria.componente.jButton.Componente_JButton_Personalizado btnZonas;
    private comisaria.componente.jLabelAyuda.Componente_JLabel_Ayuda componente_JLabel_Ayuda1;
    private javax.swing.JLabel lblFondoMenu;
    private comisaria.componente.jLabel.Componente_JLabel_Personalizado lblTxtMenu;
    // End of variables declaration//GEN-END:variables
}