
package test;


/**
 *
 * @author esper
 */
public class ProfileUssers extends javax.swing.JFrame {

    public ProfileUssers(String id, String height,  String name, String surname, String service, String type, String gender,String price,String dater, String dated) {
        initComponents();
        
        idFld.setText(id);
        heightFld.setText(height);
        nameFld.setText(name);
        surnameFld.setText(surname);
        serviceFld.setText(service);
        typeFld.setText(type);
        genderFld.setText(gender);
        PriceFld.setText(price);
        DateR.setText(dater);
        DateD.setText(dated);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nameFld = new javax.swing.JTextField();
        idFld = new javax.swing.JTextField();
        heightFld = new javax.swing.JTextField();
        serviceFld = new javax.swing.JTextField();
        typeFld = new javax.swing.JTextField();
        genderFld = new javax.swing.JTextField();
        surnameFld = new javax.swing.JTextField();
        Printer = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        PriceFld = new javax.swing.JTextField();
        DateR = new javax.swing.JTextField();
        DateD = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 42, 54, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 115, 54, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Height:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 82, 54, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Surname:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 152, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Service:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 197, 54, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nr: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 238, 54, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sex:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 40, -1));

        nameFld.setEditable(false);
        nameFld.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(nameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 112, 100, -1));

        idFld.setEditable(false);
        idFld.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(idFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 39, 100, -1));

        heightFld.setEditable(false);
        heightFld.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(heightFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 79, 100, -1));

        serviceFld.setEditable(false);
        serviceFld.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(serviceFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 194, 100, -1));

        typeFld.setEditable(false);
        typeFld.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(typeFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 235, 100, -1));

        genderFld.setEditable(false);
        genderFld.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(genderFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 100, -1));

        surnameFld.setEditable(false);
        surnameFld.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(surnameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 149, 100, -1));

        Printer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Printer.setText("Print");
        Printer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrinterActionPerformed(evt);
            }
        });
        getContentPane().add(Printer, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 332, 100, 37));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Price:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 279, 42, -1));

        PriceFld.setEditable(false);
        PriceFld.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(PriceFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 276, 100, -1));

        DateR.setBackground(new java.awt.Color(51, 255, 51));
        DateR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DateR.setEnabled(false);
        getContentPane().add(DateR, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 222, -1));

        DateD.setBackground(new java.awt.Color(255, 51, 51));
        DateD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DateD.setEnabled(false);
        getContentPane().add(DateD, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 222, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DateR:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Deadline:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apps-system-users-icon.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 280, 226));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/999999.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PrinterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrinterActionPerformed
        String receipt = null;
        receipt = "ID: "+idFld.getText() + "\n"+
               
                 "Name: "+nameFld.getText() + "\n"+
                 "Surname: "+surnameFld.getText() + "\n"+
                 "Gender: "+genderFld.getText()+"\n"+
                 "Height: "+heightFld.getText() + "\n"+
                 "Service: "+serviceFld.getText() + "\n"+
                 "Phone: "+typeFld.getText() + "\n"+
                 "DateR:"+ DateR.getText() +"\n"+
                 "DateD:"+ DateD.getText() +"\n"+"\n"+"\n"+"\n"+"\n"+
                 "Price: "+ PriceFld.getText() ;
        
                Print pr = new Print(receipt);
                 pr.setVisible(true);
                this.setVisible(false);

    }//GEN-LAST:event_PrinterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
           
           
    }
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ProfileUssers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ProfileUssers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ProfileUssers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ProfileUssers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ProfileUssers().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DateD;
    private javax.swing.JTextField DateR;
    private javax.swing.JTextField PriceFld;
    private javax.swing.JButton Printer;
    private javax.swing.JTextField genderFld;
    private javax.swing.JTextField heightFld;
    private javax.swing.JTextField idFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameFld;
    private javax.swing.JTextField serviceFld;
    private javax.swing.JTextField surnameFld;
    private javax.swing.JTextField typeFld;
    // End of variables declaration//GEN-END:variables
}
