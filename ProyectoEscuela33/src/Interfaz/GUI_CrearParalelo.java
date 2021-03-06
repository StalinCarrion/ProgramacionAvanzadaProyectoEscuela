/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.GradoParalelo;
import Logica.LogicaParalelo;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class GUI_CrearParalelo extends javax.swing.JFrame {

    /**
     * Creates new form GIU_CrearParalelo
     */
    GradoParalelo objParalelo = new GradoParalelo();
    LogicaParalelo objLogParalelo = new LogicaParalelo();

    public GUI_CrearParalelo() {
        initComponents();
        setLocationRelativeTo(null);
        this.jBCrearParalelo.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTNombreParalelo = new javax.swing.JTextField();
        jTNEstudiantes = new javax.swing.JTextField();
        jBComprobar = new javax.swing.JButton();
        jBCrearParalelo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jGrado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(49, 147, 176));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CREAR PARALELO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(158, 158, 158))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setText("Nombre:");

        jLabel3.setText("N° Estudiantes:");

        jTNombreParalelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNombreParaleloKeyTyped(evt);
            }
        });

        jTNEstudiantes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNEstudiantesKeyTyped(evt);
            }
        });

        jBComprobar.setText("Comprobar");
        jBComprobar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(49, 147, 176), new java.awt.Color(49, 147, 176)));
        jBComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComprobarActionPerformed(evt);
            }
        });

        jBCrearParalelo.setText("Crear Paralelo");
        jBCrearParalelo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(49, 147, 176), new java.awt.Color(49, 147, 176)));
        jBCrearParalelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearParaleloActionPerformed(evt);
            }
        });

        jLabel5.setText("Volver");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setText("Grado:");

        jGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTNombreParalelo, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(jTNEstudiantes))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jBComprobar)
                        .addGap(18, 18, 18)
                        .addComponent(jBCrearParalelo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTNombreParalelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTNEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCrearParalelo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComprobarActionPerformed
        // TODO add your handling code here:
        String nombreParalelo = this.jTNombreParalelo.getText().toUpperCase();

        objParalelo.setParalelo(nombreParalelo);

        objParalelo.setNumeroEstudiantes(Integer.parseInt(this.jTNEstudiantes.getText()));

        //int grado = (int) this.jGrado.getSelectedItem();
        //System.out.println("grado "+grado);
        String seleccionado = (String) this.jGrado.getSelectedItem();
        objParalelo.setGrado(Integer.parseInt(seleccionado));

        if (this.BuscarGradoParalelo()) {
            JOptionPane.showMessageDialog(rootPane, " ya existe");
            this.jBCrearParalelo.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(rootPane, "no existe");
            this.jBCrearParalelo.setEnabled(true);

        }
    }//GEN-LAST:event_jBComprobarActionPerformed

    private void jTNombreParaleloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreParaleloKeyTyped
        // TODO add your handling code here:
        if (this.jTNombreParalelo.getText().length() > 0) {
            JOptionPane.showMessageDialog(rootPane, "Solo Una Letra.");
            evt.consume();
        }
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo Letra.");
        }
    }//GEN-LAST:event_jTNombreParaleloKeyTyped

    private void jTNEstudiantesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNEstudiantesKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo números.");
        }
    }//GEN-LAST:event_jTNEstudiantesKeyTyped

    private void jBCrearParaleloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearParaleloActionPerformed
        // TODO add your handling code here:
        String nombreParalelo = this.jTNombreParalelo.getText().toUpperCase();
        objParalelo.setParalelo(nombreParalelo);
        objParalelo.setNumeroEstudiantes(Integer.parseInt(this.jTNEstudiantes.getText()));
        String seleccionado = (String) this.jGrado.getSelectedItem();
        objParalelo.setGrado(Integer.parseInt(seleccionado));
        if (objLogParalelo.InsertarParalelo(objParalelo)) {
            JOptionPane.showMessageDialog(rootPane, "Paralelo creado Correctamente");
            this.jTNEstudiantes.setText("");
            this.jTNombreParalelo.setText("");
            this.jBCrearParalelo.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Error al Crear");

        }
    }//GEN-LAST:event_jBCrearParaleloActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        GIU_Administrador ObjIA = new GIU_Administrador();
        int x = JOptionPane.showConfirmDialog(null, "¿Desea regresar?", "Los datos ingresados no se guardarán", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            ObjIA.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    public boolean BuscarGradoParalelo() {

        String seleccionado = (String) this.jGrado.getSelectedItem();
//        objParalelo = objLogParalelo.BuscarParaleloGrado(Integer.parseInt(this.jTNombreParalelo.getText().trim(),seleccionado));
          objParalelo = objLogParalelo.BuscarParaleloGrado2(this.jTNombreParalelo.getText(), seleccionado);
        if (objParalelo.getParalelo() != null) //0 se crea el objeto
        {
            return true;
        } else {
            return false;
        }
    }

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
            java.util.logging.Logger.getLogger(GUI_CrearParalelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearParalelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearParalelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearParalelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_CrearParalelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBComprobar;
    private javax.swing.JButton jBCrearParalelo;
    private javax.swing.JComboBox<String> jGrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTNEstudiantes;
    private javax.swing.JTextField jTNombreParalelo;
    // End of variables declaration//GEN-END:variables
}
