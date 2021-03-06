/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Usuario;
import Logica.LogicaUsuario;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class GUI_CrearUsuario extends javax.swing.JFrame {

    GUI_Inicio objGUI2 = new GUI_Inicio();
    /**
     * Creates new form GIU_CrearParalelo
     */
    Usuario objUsuario = new Usuario();
    LogicaUsuario objLogUsuario = new LogicaUsuario();

    public GUI_CrearUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        this.jBCrearUsuario.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTNombreUsuario = new javax.swing.JTextField();
        jTCedulaUsuario = new javax.swing.JTextField();
        jBCrearUsuario = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTDireccion = new javax.swing.JTextField();
        jTCorreo = new javax.swing.JTextField();
        jTEdad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTUsuario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jRAdministrador = new javax.swing.JRadioButton();
        jRSecretaria = new javax.swing.JRadioButton();
        jTPass = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jBVAlidar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(49, 147, 176));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CREAR USUARIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 495, 60));

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel3.setText("Cedula:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));
        jPanel1.add(jTNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 120, -1));

        jTCedulaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCedulaUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(jTCedulaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 120, -1));

        jBCrearUsuario.setText("Crear Usuario");
        jBCrearUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(49, 147, 176), new java.awt.Color(49, 147, 176)));
        jBCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jBCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 108, 45));

        jButton2.setText("Volver");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(49, 147, 176), new java.awt.Color(49, 147, 176)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 80, 45));

        jLabel6.setText("Direccion:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel7.setText("Correo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel8.setText("Edad:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));
        jPanel1.add(jTDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 120, -1));
        jPanel1.add(jTCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 140, -1));

        jTEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTEdadKeyTyped(evt);
            }
        });
        jPanel1.add(jTEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 27, -1));

        jLabel9.setText("Tipo Usuario:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel10.setText("Usuario:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));
        jPanel1.add(jTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 132, -1));

        jLabel11.setText("Contraseña:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 20));

        buttonGroup1.add(jRAdministrador);
        jRAdministrador.setText("Administrador/a");
        jRAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRAdministradorActionPerformed(evt);
            }
        });
        jPanel1.add(jRAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        buttonGroup1.add(jRSecretaria);
        jRSecretaria.setText("Secretaria/o");
        jPanel1.add(jRSecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));
        jPanel1.add(jTPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 132, -1));

        jLabel12.setText("Apellido:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));
        jPanel1.add(jTApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 120, -1));

        jBVAlidar.setText("Validar");
        jBVAlidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVAlidarActionPerformed(evt);
            }
        });
        jPanel1.add(jBVAlidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearUsuarioActionPerformed
        // TODO add your handling code here:
        int auxTipo = 0;
        objUsuario.setNombre(this.jTNombreUsuario.getText());
        objUsuario.setApellido(this.jTApellido.getText());
        objUsuario.setCedula(this.jTCedulaUsuario.getText());
        objUsuario.setDireccion(this.jTDireccion.getText());
        objUsuario.setCorreo(this.jTCorreo.getText());
        objUsuario.setEdad(Integer.parseInt(this.jTEdad.getText()));
        if (this.jRAdministrador.isSelected()) {
            auxTipo = 1;

        }
        if (this.jRSecretaria.isSelected()) {
            auxTipo = 2;
        }
        objUsuario.setTipoUsuario(auxTipo);
        objUsuario.setUsuario(this.jTUsuario.getText());
        objUsuario.setPass(this.jTPass.getText());
//        if (jTNombreUsuario.getText().isEmpty()||jTApellido.getText().isEmpty()||jTCedulaUsuario.getText().isEmpty()
//                ||jTTelfono.getText().isEmpty()||jTDireccion.getText().isEmpty()||jTCorreo.getText().isEmpty()
//                ||jTEdad.getText().isEmpty()||jRAdministrador.getText().isEmpty()||jTUsuario.getText().isEmpty()
//                ||jTPass.getText().isEmpty())
//                {
//                        JOptionPane.showMessageDialog(null, "No Puede Dejar Valores Nulos");
//                }else{
//            
//        }
        if (objLogUsuario.InsertarUsuario(objUsuario)) {
            JOptionPane.showMessageDialog(rootPane, "Usuario creado Correctamente");
            this.jTCedulaUsuario.setText("");
            this.jTCorreo.setText("");
            this.jTApellido.setText("");
            this.jTDireccion.setText("");
            this.jTEdad.setText("");
            this.jTNombreUsuario.setText("");
            this.jTPass.setText("");
            this.jTUsuario.setText("");
            this.jBCrearUsuario.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Error al Crear");

        }

    }//GEN-LAST:event_jBCrearUsuarioActionPerformed

    private void jRAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRAdministradorActionPerformed

    private void jTCedulaUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCedulaUsuarioKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo números.");
        }
    }//GEN-LAST:event_jTCedulaUsuarioKeyTyped

    private void jTEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTEdadKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo números.");
        }
    }//GEN-LAST:event_jTEdadKeyTyped

    private void jBVAlidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVAlidarActionPerformed
        // TODO add your handling code here:
        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        // El email a validar
        Matcher mather = pattern.matcher(this.jTCorreo.getText());

        if (mather.find() == true) {
            JOptionPane.showMessageDialog(rootPane, "El email ingresado esta Bien.");
            this.jBCrearUsuario.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "El email ingresado esta Mal.");
        }
    }//GEN-LAST:event_jBVAlidarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        GIU_Administrador ObjIA = new GIU_Administrador();
        int x = JOptionPane.showConfirmDialog(null, "¿Desea regresar?", "Los datos ingresados no se guardarán", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            ObjIA.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_CrearUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jBCrearUsuario;
    private javax.swing.JButton jBVAlidar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRAdministrador;
    private javax.swing.JRadioButton jRSecretaria;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTCedulaUsuario;
    private javax.swing.JTextField jTCorreo;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTEdad;
    private javax.swing.JTextField jTNombreUsuario;
    private javax.swing.JPasswordField jTPass;
    private javax.swing.JTextField jTUsuario;
    // End of variables declaration//GEN-END:variables
}
