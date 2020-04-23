/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadopersonas.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import listadopersonas.controlador.ControladorPersonas;
import listadopersonas.modelo.AbstractPersona;
import listadopersonas.modelo.DatoReporte;
import listadopersonas.modelo.Estudiante;

/**
 *
 * @author cloaiza
 */
public class MDIpersonas extends javax.swing.JFrame {
    private ControladorPersonas controlPersonas;
    /**
     * Creates new form MDIpersonas
     */
    public MDIpersonas() {
        initComponents();
        controlPersonas = new ControladorPersonas();
        jifListadoEstudiantes.hide();
        jifListadoProfesores.hide();
        jifListadoEmpleados.hide();
        jifListadoGeneral.hide();
        jifReporte.hide();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jifListadoEstudiantes = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstudiantes = new javax.swing.JTable();
        jifListadoProfesores = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProfesores = new javax.swing.JTable();
        jifListadoEmpleados = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        jifListadoGeneral = new javax.swing.JInternalFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        jifReporte = new javax.swing.JInternalFrame();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblReporteEdadRol = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        mnuListadoEstudiantes = new javax.swing.JMenuItem();
        mnuListadoProfesores = new javax.swing.JMenuItem();
        mnuListadoEmpleados = new javax.swing.JMenuItem();
        mnuListadoPersonas = new javax.swing.JMenuItem();
        mnuReporte = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jifListadoEstudiantes.setClosable(true);
        jifListadoEstudiantes.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifListadoEstudiantes.setIconifiable(true);
        jifListadoEstudiantes.setMaximizable(true);
        jifListadoEstudiantes.setResizable(true);
        jifListadoEstudiantes.setTitle("ListadoEstudiantes");
        jifListadoEstudiantes.setVisible(true);

        tblEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Semestre", "Identificacion", "Nombre", "Edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Byte.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEstudiantes);

        javax.swing.GroupLayout jifListadoEstudiantesLayout = new javax.swing.GroupLayout(jifListadoEstudiantes.getContentPane());
        jifListadoEstudiantes.getContentPane().setLayout(jifListadoEstudiantesLayout);
        jifListadoEstudiantesLayout.setHorizontalGroup(
            jifListadoEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifListadoEstudiantesLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jifListadoEstudiantesLayout.setVerticalGroup(
            jifListadoEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jifListadoEstudiantesLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );

        desktopPane.add(jifListadoEstudiantes);
        jifListadoEstudiantes.setBounds(50, 30, 590, 380);

        jifListadoProfesores.setClosable(true);
        jifListadoProfesores.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifListadoProfesores.setIconifiable(true);
        jifListadoProfesores.setMaximizable(true);
        jifListadoProfesores.setResizable(true);
        jifListadoProfesores.setTitle("Listado Profesores");
        jifListadoProfesores.setVisible(true);

        tblProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Nombre", "Edad", "Salario", "Número Materias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Byte.class, java.lang.Double.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProfesores);

        javax.swing.GroupLayout jifListadoProfesoresLayout = new javax.swing.GroupLayout(jifListadoProfesores.getContentPane());
        jifListadoProfesores.getContentPane().setLayout(jifListadoProfesoresLayout);
        jifListadoProfesoresLayout.setHorizontalGroup(
            jifListadoProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifListadoProfesoresLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jifListadoProfesoresLayout.setVerticalGroup(
            jifListadoProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jifListadoProfesoresLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );

        desktopPane.add(jifListadoProfesores);
        jifListadoProfesores.setBounds(50, 30, 590, 380);

        jifListadoEmpleados.setClosable(true);
        jifListadoEmpleados.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifListadoEmpleados.setIconifiable(true);
        jifListadoEmpleados.setMaximizable(true);
        jifListadoEmpleados.setResizable(true);
        jifListadoEmpleados.setTitle("Listado Empleados");
        jifListadoEmpleados.setVisible(true);

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Nombre", "Edad", "Salario", "Dependencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Byte.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblEmpleados);

        javax.swing.GroupLayout jifListadoEmpleadosLayout = new javax.swing.GroupLayout(jifListadoEmpleados.getContentPane());
        jifListadoEmpleados.getContentPane().setLayout(jifListadoEmpleadosLayout);
        jifListadoEmpleadosLayout.setHorizontalGroup(
            jifListadoEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifListadoEmpleadosLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jifListadoEmpleadosLayout.setVerticalGroup(
            jifListadoEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jifListadoEmpleadosLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );

        desktopPane.add(jifListadoEmpleados);
        jifListadoEmpleados.setBounds(50, 30, 590, 380);

        jifListadoGeneral.setClosable(true);
        jifListadoGeneral.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jifListadoGeneral.setIconifiable(true);
        jifListadoGeneral.setMaximizable(true);
        jifListadoGeneral.setResizable(true);
        jifListadoGeneral.setTitle("Listado Personas");
        jifListadoGeneral.setVisible(true);

        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Nombre", "Edad", "Tipo de Persona"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Byte.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblPersonas);

        javax.swing.GroupLayout jifListadoGeneralLayout = new javax.swing.GroupLayout(jifListadoGeneral.getContentPane());
        jifListadoGeneral.getContentPane().setLayout(jifListadoGeneralLayout);
        jifListadoGeneralLayout.setHorizontalGroup(
            jifListadoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifListadoGeneralLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jifListadoGeneralLayout.setVerticalGroup(
            jifListadoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jifListadoGeneralLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );

        desktopPane.add(jifListadoGeneral);
        jifListadoGeneral.setBounds(50, 30, 590, 380);

        jifReporte.setClosable(true);
        jifReporte.setIconifiable(true);
        jifReporte.setMaximizable(true);
        jifReporte.setResizable(true);
        jifReporte.setTitle("Reporte Cantidad personas x Rango de Edad  y Rol");
        jifReporte.setVisible(true);

        tblReporteEdadRol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Rango de Edad", "Estudiantes", "Profesores", "Empleados"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblReporteEdadRol);

        javax.swing.GroupLayout jifReporteLayout = new javax.swing.GroupLayout(jifReporte.getContentPane());
        jifReporte.getContentPane().setLayout(jifReporteLayout);
        jifReporteLayout.setHorizontalGroup(
            jifReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jifReporteLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jifReporteLayout.setVerticalGroup(
            jifReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jifReporteLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );

        desktopPane.add(jifReporte);
        jifReporte.setBounds(370, 220, 620, 440);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Archivo");

        mnuListadoEstudiantes.setMnemonic('o');
        mnuListadoEstudiantes.setText("Listado Estudiantes");
        mnuListadoEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListadoEstudiantesActionPerformed(evt);
            }
        });
        fileMenu.add(mnuListadoEstudiantes);

        mnuListadoProfesores.setMnemonic('s');
        mnuListadoProfesores.setText("Listado Profesores");
        mnuListadoProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListadoProfesoresActionPerformed(evt);
            }
        });
        fileMenu.add(mnuListadoProfesores);

        mnuListadoEmpleados.setMnemonic('a');
        mnuListadoEmpleados.setText("Listado Empleados");
        mnuListadoEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListadoEmpleadosActionPerformed(evt);
            }
        });
        fileMenu.add(mnuListadoEmpleados);

        mnuListadoPersonas.setText("Listado General");
        mnuListadoPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListadoPersonasActionPerformed(evt);
            }
        });
        fileMenu.add(mnuListadoPersonas);

        mnuReporte.setText("Reporte Personas");
        mnuReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReporteActionPerformed(evt);
            }
        });
        fileMenu.add(mnuReporte);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void mnuListadoEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListadoEstudiantesActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) tblEstudiantes.getModel();
        model.getDataVector().removeAllElements();
        
        for (AbstractPersona estudiante : controlPersonas.obtenerPersonas("Estudiante")) {
            model.addRow(estudiante.obtenerArregloObjeto());
        }
        tblEstudiantes.setModel(model);  
        jifListadoEstudiantes.show();
        
    }//GEN-LAST:event_mnuListadoEstudiantesActionPerformed

    private void mnuListadoProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListadoProfesoresActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) tblProfesores.getModel();
        model.getDataVector().removeAllElements();
        
        for (AbstractPersona profesor : controlPersonas.obtenerPersonas("Profesor")) {
            model.addRow(profesor.obtenerArregloObjeto());
        }
        tblProfesores.setModel(model);  
        jifListadoProfesores.show();
        
    }//GEN-LAST:event_mnuListadoProfesoresActionPerformed

    private void mnuListadoEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListadoEmpleadosActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) tblEmpleados.getModel();
        model.getDataVector().removeAllElements();
        
        for (AbstractPersona empleado : controlPersonas.obtenerPersonas("Empleado")) {
            model.addRow(empleado.obtenerArregloObjeto());
        }
        tblEmpleados.setModel(model);  
        jifListadoEmpleados.show();
    }//GEN-LAST:event_mnuListadoEmpleadosActionPerformed

    private void mnuListadoPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListadoPersonasActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) tblPersonas.getModel();
        model.getDataVector().removeAllElements();
        
        for (AbstractPersona persona : controlPersonas.obtenerPersonas("")) {
            model.addRow(persona.obtenerArregloPersonaObjeto());
        }
        tblPersonas.setModel(model);  
        jifListadoGeneral.show();
    }//GEN-LAST:event_mnuListadoPersonasActionPerformed

    private void mnuReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReporteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblReporteEdadRol.getModel();
        model.getDataVector().removeAllElements();
        
        for (DatoReporte dato : controlPersonas.obtenerConteoxEdadesxRol()) {
            model.addRow(dato.obtenerArregloObjeto());
        }
        tblReporteEdadRol.setModel(model);  
        jifReporte.show();
        
    }//GEN-LAST:event_mnuReporteActionPerformed

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
            java.util.logging.Logger.getLogger(MDIpersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIpersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIpersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIpersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIpersonas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JInternalFrame jifListadoEmpleados;
    private javax.swing.JInternalFrame jifListadoEstudiantes;
    private javax.swing.JInternalFrame jifListadoGeneral;
    private javax.swing.JInternalFrame jifListadoProfesores;
    private javax.swing.JInternalFrame jifReporte;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnuListadoEmpleados;
    private javax.swing.JMenuItem mnuListadoEstudiantes;
    private javax.swing.JMenuItem mnuListadoPersonas;
    private javax.swing.JMenuItem mnuListadoProfesores;
    private javax.swing.JMenuItem mnuReporte;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTable tblEstudiantes;
    private javax.swing.JTable tblPersonas;
    private javax.swing.JTable tblProfesores;
    private javax.swing.JTable tblReporteEdadRol;
    // End of variables declaration//GEN-END:variables

}
