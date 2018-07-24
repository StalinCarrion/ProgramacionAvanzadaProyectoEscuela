/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Materia;
import Clases.Profesor;
import Data.DataProfesor;
import Logica.LogicaMateria;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FRANZ
 */
public class GUI_CrearMateria extends javax.swing.JFrame {

    /**
     * Creates new form GUI_CrearMateria
     */
    Materia objMateria = new Materia();
    LogicaMateria objLogMateria = new LogicaMateria();
    DataProfesor objDatPro = new DataProfesor();

    public GUI_CrearMateria() {
        initComponents();
        setLocationRelativeTo(null);
        CargarProfesores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBCrearMateria = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(49, 147, 176));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CREAR MATERIA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 62));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 80));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBCrearMateria.setText("Crear Materia");
        jBCrearMateria.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(49, 147, 176), new java.awt.Color(49, 147, 176)));
        jBCrearMateria.setEnabled(false);
        jBCrearMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearMateriaActionPerformed(evt);
            }
        });
        jPanel1.add(jBCrearMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 90, 45));

        jButton2.setText("Volver");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(49, 147, 176), new java.awt.Color(49, 147, 176)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 80, 45));

        jLabel4.setText("Horas:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jTNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNombreKeyTyped(evt);
            }
        });
        jPanel1.add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 234, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Cedula"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, 90));

        jButton3.setText("Agregar Profesor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("LISTA DE PROFESORES");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 550, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCrearMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearMateriaActionPerformed
        // TODO add your handling code here:
        int row = 1 + this.jTable1.getSelectedRow();

        objMateria.setNombreMateria(this.jTNombre.getText());
        objMateria.setHoras(Integer.parseInt(this.jSpinner1.getValue().toString()));
        objMateria.setIdProfesor(row);
        if (objLogMateria.ComprobarMateria(objMateria)) {
            JOptionPane.showMessageDialog(rootPane, "Materia ya existente");
        } else {
            if (objLogMateria.InsertarMateria(objMateria)) {
                JOptionPane.showMessageDialog(rootPane, "Materia creada Correctamente");

            } else {
                JOptionPane.showMessageDialog(rootPane, "Error al Crear");

            }
        }
    }//GEN-LAST:event_jBCrearMateriaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        GIU_Administrador ObjIA = new GIU_Administrador();
        int x = JOptionPane.showConfirmDialog(null, "¿Desea regresar?", "Los datos ingresados no se guardarán", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            ObjIA.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        HabilitarBoton();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreKeyTyped
        // TODO add your handling code here:
        HabilitarBoton();
    }//GEN-LAST:event_jTNombreKeyTyped

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable1KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        GUI_CrearProfesor ObjICP = new GUI_CrearProfesor();
        ObjICP.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreKeyPressed
        // TODO add your handling code here:
        HabilitarBoton();
    }//GEN-LAST:event_jTNombreKeyPressed

    public void HabilitarBoton() {
        int row = 1 + this.jTable1.getSelectedRow();
        System.out.println(row);
        if (this.jTNombre.getText().length() != 0 && row >= 1) {
            this.jBCrearMateria.setEnabled(true);
        }
    }

    public void CargarProfesores() {
        ArrayList<Profesor> ArrayPro = new ArrayList<Profesor>();
        ArrayPro = objDatPro.BuscarProfesor();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Cedula");

        for (Profesor pers : ArrayPro) {
            Object[] fila = new Object[3];
            fila[0] = pers.getNombre();
            fila[1] = pers.getApellido();
            fila[2] = pers.getCedula();

            modelo.addRow(fila);
        }
        this.jTable1.setModel(modelo);
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
            java.util.logging.Logger.getLogger(GUI_CrearMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_CrearMateria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCrearMateria;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
