/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Actividades;
import Clases.Estudiante;
import Logica.LogicaActividades;
import Logica.LogicaEstudiante;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo
 */
public class GUI_AsociarActividadAlumno extends javax.swing.JFrame {

    /**
     * Creates new form GUI_AsociarActividadAlumno
     */
    Actividades ObjAct = new Actividades();
    Estudiante ObjEstudiante = new Estudiante();

    LogicaActividades ObjLogAct = new LogicaActividades();
    LogicaEstudiante ObjLogAlum = new LogicaEstudiante();

    ArrayList<Actividades> ArrayAct = new ArrayList<Actividades>();
    ArrayList<Estudiante> ArrayEst = new ArrayList<Estudiante>();

    public GUI_AsociarActividadAlumno() {
        initComponents();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaActividades = new javax.swing.JTable();
        BotonBuscarActividad = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombreActividad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreActividadSeleccionada = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaEstudiantes = new javax.swing.JTable();
        jBotonEliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabelNumeroEst = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreEstudiante = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCurso = new javax.swing.JTextField();
        BotonRegistrar = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        txtCedulaEstudiante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(49, 147, 176));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Registro de  alumno en actividades");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel1)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        TablaActividades = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int vColIndex) {
                return false;
            };
        };
        TablaActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaActividades.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TablaActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaActividadesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaActividades);

        BotonBuscarActividad.setText("Buscar");
        BotonBuscarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActividadActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Actividad");

        txtNombreActividad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreActividadKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Actividad seleccionada: ");

        txtNombreActividadSeleccionada.setEnabled(false);

        TablaEstudiantes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int vColIndex) {
                return false;
            };
        };
        TablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEstudiantesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaEstudiantes);

        jBotonEliminar.setText("ELIMINAR");
        jBotonEliminar.setEnabled(false);
        jBotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonEliminarActionPerformed(evt);
            }
        });

        jLabel8.setText("Estudiantes Registrados:");

        jLabelNumeroEst.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBotonEliminar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(28, 28, 28)
                            .addComponent(txtNombreActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BotonBuscarActividad))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNombreActividadSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabelNumeroEst, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonBuscarActividad)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombreActividadSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelNumeroEst))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBotonEliminar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setText("Nombre");

        txtNombreEstudiante.setEnabled(false);

        jLabel6.setText("Curso");

        txtCurso.setEnabled(false);

        BotonRegistrar.setText("Registrar");
        BotonRegistrar.setEnabled(false);
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonRegistrar)))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonRegistrar)))
                .addContainerGap())
        );

        BotonBuscar.setText("Buscar");
        BotonBuscar.setEnabled(false);
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        txtCedulaEstudiante.setEnabled(false);
        txtCedulaEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaEstudianteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Cedula");

        BotonSalir.setBackground(new java.awt.Color(255, 51, 51));
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Workflow_96px.png"))); // NOI18N

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(txtCedulaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(BotonBuscar))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1)))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonSalir)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedulaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonBuscar))
                        .addGap(7, 7, 7)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaEstudianteActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        // TODO add your handling code here:

        ObjEstudiante.setCedula(this.txtCedulaEstudiante.getText());
        
        if (this.BuscarEstudiante()) {
            if (this.ComprobarActividadEstudiante()) {
                this.txtNombreEstudiante.setText(ObjEstudiante.getNombre() + " " + ObjEstudiante.getApellido());
                this.txtCurso.setText(ObjEstudiante.getGradoparalelo().getGrado() + ObjEstudiante.getGradoparalelo().getParalelo());
                this.BotonRegistrar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Ya está registrado");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Alumno no encontrado");
        }


    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonBuscarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActividadActionPerformed
        // TODO add your handling code here:
        ObjAct.setNombreActividad(this.txtNombreActividad.getText());

        if (this.BuscarAvanzadoActividad()) {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("idActividad");
            modelo.addColumn("Actividad");
            modelo.addColumn("Aporte");
            modelo.addColumn("Fecha de Inicio");
            modelo.addColumn("Fecha de Fin");

            for (Actividades pers : ArrayAct) {
                Object[] fila = new Object[5];
                fila[0] = pers.getIdActividad();
                fila[1] = pers.getNombreActividad();
                fila[2] = pers.getAporteEconomico();
                fila[3] = pers.getFechaInicio();
                fila[4] = pers.getFechaFinal();

                modelo.addRow(fila);
            }
            this.TablaActividades.setModel(modelo);
        } else {

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("idActividad");
            modelo.addColumn("Actividad");
            modelo.addColumn("Aporte");
            modelo.addColumn("Fecha de Inicio");
            modelo.addColumn("Fecha de Fin");

            for (Actividades pers : ArrayAct) {
                Object[] fila = new Object[5];
                fila[0] = pers.getIdActividad();
                fila[1] = pers.getNombreActividad();
                fila[2] = pers.getAporteEconomico();
                fila[3] = pers.getFechaInicio();
                fila[4] = pers.getFechaFinal();

                modelo.addRow(fila);
            }
            this.TablaActividades.setModel(modelo);
        }
    }//GEN-LAST:event_BotonBuscarActividadActionPerformed

    private void TablaActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaActividadesMouseClicked
        // TODO add your handling code here:

        this.jBotonEliminar.setEnabled(false);
        int row = this.TablaActividades.getSelectedRow();

        this.txtNombreActividadSeleccionada.setText(this.TablaActividades.getValueAt(row, 1).toString());
        ObjAct.setNombreActividad(this.TablaActividades.getValueAt(row, 1).toString());
        ObjAct.setIdActividad(Integer.parseInt(this.TablaActividades.getValueAt(row, 0).toString()));

        BuscarActividadAlumno(ObjAct);
        this.txtCedulaEstudiante.setEnabled(true);
        this.BotonBuscar.setEnabled(true);


    }//GEN-LAST:event_TablaActividadesMouseClicked

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        // TODO add your handling code here:
        Estudiante ObjAuxEst = new Estudiante();
        ObjAuxEst = ObjLogAlum.ComprobarEstudianteMatriculado(ObjEstudiante);
        
        if(ObjAuxEst.getNombre()==null){
            JOptionPane.showMessageDialog(null, "El estudiante no esta matriculado");
        }else{
            ObjLogAct.InsertarActividadAlumno(ObjAct, ObjEstudiante);
            BuscarActividadAlumno(ObjAct);
            this.txtCedulaEstudiante.setText("");
            this.txtCurso.setText("");
            this.txtNombreEstudiante.setText("");
            this.BotonRegistrar.setEnabled(false);
        }
        
        

    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void TablaEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEstudiantesMouseClicked
        // TODO add your handling code here:

        int row = this.TablaEstudiantes.getSelectedRow();

        ObjEstudiante.setIdEstudiante(Integer.parseInt(this.TablaEstudiantes.getValueAt(row, 0).toString()));
        this.jBotonEliminar.setEnabled(true);

    }//GEN-LAST:event_TablaEstudiantesMouseClicked

    private void jBotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonEliminarActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro de elimnar al estudiante?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {

            ObjLogAct.EliminarAlumnoActividad(ObjEstudiante);
            this.jBotonEliminar.setEnabled(false);
            BuscarActividadAlumno(ObjAct);

        } else {
            this.jBotonEliminar.setEnabled(false);
        }

    }//GEN-LAST:event_jBotonEliminarActionPerformed

    private void txtNombreActividadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreActividadKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        
        if (Character.isLowerCase(validar)) { // SOLO MAYÚSCULAS
            String cad = ("" + validar).toUpperCase();
            validar = cad.charAt(0);
            evt.setKeyChar(validar);
        }
    }//GEN-LAST:event_txtNombreActividadKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GIU_Secretaria ObjIA = new GIU_Secretaria();
        int x = JOptionPane.showConfirmDialog(null, "¿Desea regresar?", "Los datos ingresados no se guardarán", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            ObjIA.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean BuscarAvanzadoActividad() {
        ArrayAct = ObjLogAct.BuscarAvanzadoActividades(ObjAct);

        if (ObjAct.getTipoActividad() == null) //0 se crea con el objeto vacio
        {
            return false;
        } else {
            return true;
        }

    }

    public void BuscarActividadAlumno(Actividades ObjAct) {
        ArrayEst = ObjLogAlum.BuscarEstudianteActividad(ObjAct);
        LlenarTablaEstudiantes();
    }

    public boolean BuscarEstudiante() {
        System.out.println("gui"+ObjEstudiante.getCedula());
        ObjEstudiante = ObjLogAlum.BuscarEstudianteAct(ObjEstudiante);
        ObjAct.setObjEst(ObjEstudiante);

        if (ObjEstudiante.getNombre() == null) //0 se crea con el objeto vacio
        {
            return false;
        } else {
            return true;
        }

    }

    public boolean ComprobarActividadEstudiante() {
        Actividades ObjAuxAct = new Actividades();

        ObjAuxAct = ObjLogAct.ComprobarActividadAlumno(ObjAct, ObjEstudiante);

        if (ObjAuxAct.getIdActividad() == ObjAct.getIdActividad()) //0 se crea con el objeto vacio
        {
            return false;
        } else {
            return true;
        }

    }

    public void LlenarTablaEstudiantes() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Grado");
        modelo.addColumn("Paralelo");
        int aux = 0;

        for (Estudiante est : ArrayEst) {
            Object[] fila = new Object[5];
            fila[0] = est.getIdEstudiante();
            fila[1] = est.getNombre();
            fila[2] = est.getApellido();
            fila[3] = est.getGradoparalelo().getGrado();
            fila[4] = est.getGradoparalelo().getParalelo();
            aux = aux+1;

            modelo.addRow(fila);
        }
        this.jLabelNumeroEst.setText(String.valueOf(aux));
        this.TablaEstudiantes.setModel(modelo);
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
            java.util.logging.Logger.getLogger(GUI_AsociarActividadAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_AsociarActividadAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_AsociarActividadAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_AsociarActividadAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_AsociarActividadAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonBuscarActividad;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTable TablaActividades;
    private javax.swing.JTable TablaEstudiantes;
    private javax.swing.JButton jBotonEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelNumeroEst;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCedulaEstudiante;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtNombreActividad;
    private javax.swing.JTextField txtNombreActividadSeleccionada;
    private javax.swing.JTextField txtNombreEstudiante;
    // End of variables declaration//GEN-END:variables
}
