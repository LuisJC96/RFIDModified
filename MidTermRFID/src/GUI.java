/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
/**
 *
 * @author luisj
 */
public class GUI extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pre;
    String epc = "";
    String nombre = "";
    String matricula = "";
    String tipopersonal = "";
    String archivo ="";


    /**
     * Creates new form swing
     */
    public GUI() {
        initComponents();
        initDBComponents();
    }
        private void initDBComponents(){
     
        try
        { 
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
	   //  Código usado para un servidor local
            //String serverName = "sql10.freemysqlhosting.net";
            //String mydatabase = "sql10282032";
            //String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            //String username = "sql10282032";
            //String password = "xIaVIMkM2q";
            String serverName = "localhost";
            String mydatabase = "credencial";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "root";
            String password = "";
	   // Código ejemplo usado para un servidor remoto
//            String serverName = "www.itecstraining.com";
//            String mydatabase = "itecstr1_credencial";
//            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
//            String username = "itecstr1_crespo";
//            String password = "raul1542";
            conn = DriverManager.getConnection(url, username, password);
	    // Usar el siguiente código en caso de querer eliminar la tabla PersonasTEC 
            // pre = conn.prepareStatement("DROP TABLE IF EXISTS PersonasTEC");
            // pre.executeUpdate();

            //pre = conn.prepareStatement(
               //"CREATE TABLE PersonasTEC ("
               //+ "id INT UNSIGNED NOT NULL AUTO_INCREMENT,"
               //+ "tagEPC CHAR(24) NOT NULL,"
               //+ "nombre VARCHAR(50) NOT NULL,"
               //+ "matricula CHAR(9) NOT NULL,"
               //+ "tipopersonal VARCHAR(20),"
               //+ "PRIMARY KEY(id))");
            ///pre.executeUpdate();
            //System.out.println("Se pudo establecer conexión con la base de datos.");
            show("Conexión a la base de datos exitosa.");
            
        }
        catch (Exception e)
        {
            //System.out.println("No se pudo establecer conexión con la base de datos.");
            show("No se pudo establecer conexión con la base de datos.");
        }
    }
        


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEPC2 = new javax.swing.JTextField();
        jTextFieldNombre2 = new javax.swing.JTextField();
        jTextFieldMatricula2 = new javax.swing.JTextField();
        jTextFieldPersonal2 = new javax.swing.JTextField();
        JButtonEnviarSQL = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldEPC1 = new javax.swing.JTextField();
        jButtonLeeSQL = new javax.swing.JButton();
        jTextFieldNombre1 = new javax.swing.JTextField();
        jTextFieldMatricula1 = new javax.swing.JTextField();
        jTextFieldPersonal1 = new javax.swing.JTextField();
        jTextAreaShow = new javax.swing.JTextArea();
        jButtonExit = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("ACTUALIZACIÓN DE INFORMACIÓN A BASE DE DATOS MYSQL");

        jLabel2.setText("Ingresar datos en los siguientes campos");

        jLabel5.setText("EPC(24 valores en hex):");

        jLabel6.setText("Nombre:");

        jLabel7.setText("Matrícula");

        jLabel8.setText("Tipo de Personal:");

        jTextFieldEPC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEPC2ActionPerformed(evt);
            }
        });

        jTextFieldPersonal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPersonal2ActionPerformed(evt);
            }
        });

        JButtonEnviarSQL.setText("Enviar Info. a Base de Datos");
        JButtonEnviarSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonEnviarSQLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombre2)
                            .addComponent(jTextFieldMatricula2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPersonal2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(JButtonEnviarSQL)))
                        .addGap(0, 401, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEPC2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldEPC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMatricula2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldPersonal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(JButtonEnviarSQL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Actualización a base de datos", jPanel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("LECTURA DE BASE DE DATOS");

        jLabel9.setText("Ingrese el código EPC(24 caracteres hex)");

        jLabel11.setText("EPC");

        jLabel12.setText("RESULTADOS:");

        jLabel13.setText("Nombre");

        jLabel14.setText("Matrícula");

        jLabel15.setText("Tipo de personal");

        jButtonLeeSQL.setText("Leer Información de base de datos");
        jButtonLeeSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLeeSQLActionPerformed(evt);
            }
        });

        jTextFieldMatricula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMatricula1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEPC1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNombre1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMatricula1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPersonal1)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jButtonLeeSQL)
                .addContainerGap(386, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldEPC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLeeSQL)
                .addGap(2, 2, 2)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldMatricula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldPersonal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Lectura de Base de datos", jPanel3);

        jTextAreaShow.setColumns(20);
        jTextAreaShow.setRows(5);

        jButtonExit.setText("Salir de la Aplicación");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jButtonExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTabbedPane3)
                    .addComponent(jTextAreaShow))
                .addGap(0, 432, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextAreaShow, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExit)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPersonal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPersonal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPersonal2ActionPerformed

    private void jTextFieldEPC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEPC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEPC2ActionPerformed

    private void jButtonLeeSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLeeSQLActionPerformed
                 try
        {
            String sql = "SELECT nombre, matricula, tipopersonal FROM PersonasTEC "
                            + "WHERE tagEPC = '" + jTextFieldEPC1.getText() + "'";
            PreparedStatement ps = conn.prepareStatement (sql);
            ResultSet rs = ps.executeQuery();
                        
            while (rs.next())
            {
                String nameVal = rs.getString("nombre");
                String matriculaVal = rs.getString("matricula");
                String tipoperVal = rs.getString("tipopersonal");
                
                jTextFieldNombre1.setText(nameVal);
                jTextFieldMatricula1.setText(matriculaVal);
                jTextFieldPersonal1.setText(tipoperVal);
                
                show("Lectura de base datos exitosa.");

            }
            rs.close ();
            ps.close ();
        }
        catch (Exception e) 
        { 
            show("Error. No se pudo ejecutar la función SELECT.");
        }

    }//GEN-LAST:event_jButtonLeeSQLActionPerformed

    private void jTextFieldMatricula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMatricula1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMatricula1ActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
                if (conn != null)
        {
            try
            {
                conn.close();
            }
            catch (Exception e) { /* ignore close errors */}
        }
        System.exit(0);

    }//GEN-LAST:event_jButtonExitActionPerformed
    public void show(String response) { 
        jTextAreaShow.append(response + "\n");
    }

    private void JButtonEnviarSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonEnviarSQLActionPerformed
        // TODO add your handling code here:
                try
        {
                        
            epc = jTextFieldEPC2.getText();
            nombre = jTextFieldNombre2.getText();
            matricula = jTextFieldMatricula2.getText();
            tipopersonal = jTextFieldPersonal2.getText();
            
            pre = conn.prepareStatement("INSERT INTO PersonasTEC (tagEPC, nombre, matricula, tipopersonal) VALUES(?,?,?,?)");            
            pre.setString(1, epc);
            pre.setString(2, nombre);
            pre.setString(3, matricula);
            pre.setString(4, tipopersonal);
            pre.executeUpdate();
            
            pre.close();
            
            show("Actualización de base datos exitosa.");
        }
        catch (Exception e) 
        { 
            show("Error al enviar la información a la base de datos.");
        }

    }//GEN-LAST:event_JButtonEnviarSQLActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonEnviarSQL;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonLeeSQL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextArea jTextAreaShow;
    private javax.swing.JTextField jTextFieldEPC1;
    private javax.swing.JTextField jTextFieldEPC2;
    private javax.swing.JTextField jTextFieldMatricula1;
    private javax.swing.JTextField jTextFieldMatricula2;
    private javax.swing.JTextField jTextFieldNombre1;
    private javax.swing.JTextField jTextFieldNombre2;
    private javax.swing.JTextField jTextFieldPersonal1;
    private javax.swing.JTextField jTextFieldPersonal2;
    // End of variables declaration//GEN-END:variables
}
