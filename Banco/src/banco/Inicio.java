/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author dog_a
 */
public class Inicio extends javax.swing.JFrame {

    int i=1;
    int ins=0,elim=0;
    int cola[]=new int[5];
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        vtn1.setText(Integer.toString(i));
        vtn2.setText(Integer.toString(i+1));
        vtn3.setText(Integer.toString(i+2));
        MsjV1.setVisible(false);
        MsjV2.setVisible(false);
        MsjV3.setVisible(false);
        
           for(int j=ins;j<cola.length;j++){
              encolar(cola,ins,elim,i);
              i++;
              System.out.println(cola[ins]+"\t");
           }
           
        tuS.setText(Integer.toString(cola[elim]));
        desencolar(cola,ins,elim,i);
    }
    
    Usuario us=new Usuario("Eliud","123",150);
    String cad="";
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btnV1 = new javax.swing.JButton();
        btnV2 = new javax.swing.JButton();
        btnV3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lstV1 = new javax.swing.JComboBox<>();
        lstV2 = new javax.swing.JComboBox<>();
        lstV3 = new javax.swing.JComboBox<>();
        tuS = new javax.swing.JLabel();
        vtn1 = new javax.swing.JLabel();
        vtn2 = new javax.swing.JLabel();
        vtn3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        MsjV1 = new javax.swing.JLabel();
        btnSig = new javax.swing.JButton();
        MsjV2 = new javax.swing.JLabel();
        MsjV3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuRep = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnV1.setText("Liberar Ventanilla 1");
        btnV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnV1ActionPerformed(evt);
            }
        });

        btnV2.setText("Liberar Ventanilla 2");
        btnV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnV2ActionPerformed(evt);
            }
        });

        btnV3.setText("Liberar Ventanilla 3");
        btnV3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnV3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ventanilla 1");

        jLabel2.setText("Ventanilla 2");

        jLabel3.setText("Ventanilla 3");

        jLabel4.setText("Turno tratando:");

        lstV1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Depositar", "Retirar ", "Estado de cuenta", "Transferir" }));
        lstV1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstV1MouseClicked(evt);
            }
        });
        lstV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstV1ActionPerformed(evt);
            }
        });

        lstV2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Depositar", "Retirar ", "Estado de cuenta", "Transferir" }));
        lstV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstV2ActionPerformed(evt);
            }
        });

        lstV3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Depositar", "Retirar ", "Estado de cuenta", "Transferir" }));
        lstV3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstV3ActionPerformed(evt);
            }
        });

        vtn1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        vtn2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        vtn3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel9.setText("Turnos Actuales");

        MsjV1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        MsjV1.setText("Turno"
            + "Terminado");

        btnSig.setText("Siguiente");
        btnSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigActionPerformed(evt);
            }
        });

        MsjV2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        MsjV2.setText("Turno"
            + "Terminado");

        MsjV3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        MsjV3.setText("Turno"
            + "Terminado");

        mnuRep.setText("Reporte");
        mnuRep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuRepMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuRep);

        mnuSalir.setText("Salir");
        mnuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tuS, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(vtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vtn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(199, 199, 199)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(vtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lstV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lstV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnV1)
                                    .addGap(108, 108, 108)
                                    .addComponent(btnV2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MsjV1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(231, 231, 231)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lstV3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnV3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(MsjV2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MsjV3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSig)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lstV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lstV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lstV3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MsjV2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MsjV3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MsjV1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnV1)
                    .addComponent(btnV2)
                    .addComponent(btnV3))
                .addGap(37, 37, 37)
                .addComponent(btnSig)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tuS, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28))
        );

        vtn1.getAccessibleContext().setAccessibleName("vtn1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnV3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnV3ActionPerformed
        lstV3.setEnabled(false);
        MsjV3.setVisible(true);
        btnV3.setEnabled(false);
        tuS.setText(Integer.toString(cola[elim]));
        desencolar(cola,ins,elim,i);
        elim++;
    }//GEN-LAST:event_btnV3ActionPerformed

    private void mnuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSalirMouseClicked
        int op;
       JDialog.setDefaultLookAndFeelDecorated(true);
       op=JOptionPane.showConfirmDialog(null, "Quieres salir?" ,null, JOptionPane.INFORMATION_MESSAGE);
       if (op==JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(null, "ADIOS!!!");
        System.exit(0);
       }  
    }//GEN-LAST:event_mnuSalirMouseClicked

    private void lstV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstV1MouseClicked

    }//GEN-LAST:event_lstV1MouseClicked

    private void lstV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstV1ActionPerformed
        String opc=(String) lstV1.getSelectedItem();
        int dep;
        if (opc.equals("Depositar")){
           String cue=JOptionPane.showInputDialog("Ingrese el numero de cuenta");
           if(cue.equals(us.getCue())){
                dep=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a depositar"));
               us.setCant(dep);
           }else {
            dep=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a depositar"));}
           
           JOptionPane.showMessageDialog(null,"No. Cuenta: "+cue+"\nDéposito: $"+dep);
           cad+="Cliente: "+i+" Deposito de: "+dep+"\n";
           i++;
       }
    }//GEN-LAST:event_lstV1ActionPerformed

    private void btnV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnV1ActionPerformed
        lstV1.setEnabled(false);
        MsjV1.setVisible(true);
        btnV1.setEnabled(false);
        tuS.setText(Integer.toString(cola[elim]));
        desencolar(cola,ins,elim,i);
        elim++;
    }//GEN-LAST:event_btnV1ActionPerformed

    private void lstV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstV2ActionPerformed
        String opc=(String) lstV2.getSelectedItem();
        if (opc.equals("Depositar")){
           String cue=JOptionPane.showInputDialog("Ingrese el numero de cuenta");
           int dep=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a depositar"));
           
           JOptionPane.showMessageDialog(null,"No. Cuenta: "+cue+"\nDéposito: $"+dep);
           cad+="Cliente: "+i+" Deposito de: "+dep+"\n";
           i++;
       }
    }//GEN-LAST:event_lstV2ActionPerformed

    private void btnSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigActionPerformed
        JOptionPane.showMessageDialog(null,cad);
    }//GEN-LAST:event_btnSigActionPerformed

    private void mnuRepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuRepMouseClicked
        JOptionPane.showMessageDialog(null,cad);
    }//GEN-LAST:event_mnuRepMouseClicked

    private void btnV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnV2ActionPerformed
        lstV2.setEnabled(false);
        MsjV2.setVisible(true);
        btnV2.setEnabled(false);
        tuS.setText(Integer.toString(cola[elim]));
        desencolar(cola,ins,elim,i);
        elim++;
    }//GEN-LAST:event_btnV2ActionPerformed

    private void lstV3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstV3ActionPerformed
        String opc=(String) lstV3.getSelectedItem();
        if (opc.equals("Depositar")){
           String cue=JOptionPane.showInputDialog("Ingrese el numero de cuenta");
           int dep=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto a depositar"));
           
           JOptionPane.showMessageDialog(null,"No. Cuenta: "+cue+"\nDéposito: $"+dep);
           cad+="Cliente: "+i+" Deposito de: "+dep+"\n";
           i++;
       }
    }//GEN-LAST:event_lstV3ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MsjV1;
    private javax.swing.JLabel MsjV2;
    private javax.swing.JLabel MsjV3;
    private javax.swing.JButton btnSig;
    private javax.swing.JButton btnV1;
    private javax.swing.JButton btnV2;
    private javax.swing.JButton btnV3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JComboBox<String> lstV1;
    private javax.swing.JComboBox<String> lstV2;
    private javax.swing.JComboBox<String> lstV3;
    private javax.swing.JMenu mnuRep;
    private javax.swing.JMenu mnuSalir;
    private javax.swing.JLabel tuS;
    private javax.swing.JLabel vtn1;
    private javax.swing.JLabel vtn2;
    private javax.swing.JLabel vtn3;
    // End of variables declaration//GEN-END:variables

    public void encolar(int[] cola, int ins, int elim, int i) {
        if(ins==0){
            cola[ins]=i;
            i++;
            ins++;
        }else
        
        if (ins==elim){
            JOptionPane.showMessageDialog(null,"No hay espacio en la cola");
        } else 
            
            if (ins>elim && ins<cola.length || ins<elim){
            cola[ins]=i;
            i++;
            ins++;
        } else
        
        if (ins==cola.length && elim>0){
            ins=0;
            cola[ins]=i;
            i++;
            ins++;
        }
    }
    
    public void desencolar(int cola[],int ins, int elim, int turn){
        
        if (elim==0){
            cola[elim]=0;
            elim++;
        } else 
            
            if(elim==cola.length && ins!=0 && ins!=elim){
                elim=0;
                cola[elim]=0;
                elim++;
            }
        if (elim==ins){
            JOptionPane.showMessageDialog(null,"No hay espacio en la cola");
        }
    }
    
}
