
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Indriawan N
 */
public class Tugas2 extends javax.swing.JFrame {

   
    public Tugas2() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        ttl = new javax.swing.JLabel();
        jk = new javax.swing.JLabel();
        almt = new javax.swing.JLabel();
        rr = new javax.swing.JLabel();
        kd = new javax.swing.JLabel();
        kec = new javax.swing.JLabel();
        kota = new javax.swing.JLabel();
        agm = new javax.swing.JLabel();
        sts = new javax.swing.JLabel();
        gd = new javax.swing.JLabel();
        pk = new javax.swing.JLabel();
        kw = new javax.swing.JLabel();
        jtnama = new javax.swing.JTextField();
        jtttl1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtttl2 = new javax.swing.JTextField();
        rblaki = new javax.swing.JRadioButton();
        rbp = new javax.swing.JRadioButton();
        jtalmt = new javax.swing.JTextField();
        jtr1 = new javax.swing.JTextField();
        jtr2 = new javax.swing.JTextField();
        jtkd = new javax.swing.JTextField();
        jtkec = new javax.swing.JTextField();
        jtkota = new javax.swing.JTextField();
        cbagm = new javax.swing.JComboBox<>();
        cbsts = new javax.swing.JComboBox<>();
        cbgd = new javax.swing.JComboBox<>();
        jtpek = new javax.swing.JTextField();
        rbkew1 = new javax.swing.JRadioButton();
        rbkew2 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        breset = new javax.swing.JButton();
        bregister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("FORM KARTU TANDA PENDUDUK");

        nama.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nama.setText("Nama");

        ttl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ttl.setText("Tempat/Tanggal Lahir");

        jk.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jk.setText("Jenis Kelamin");

        almt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        almt.setText("Alamat");

        rr.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rr.setText("RT/RW");

        kd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        kd.setText("Kel/Desa");

        kec.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        kec.setText("Kecamatan");

        kota.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        kota.setText("Kota");

        agm.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        agm.setText("Agama");

        sts.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sts.setText("Status");

        gd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        gd.setText("Golongan Darah");

        pk.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pk.setText("Pekerjaan");

        kw.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        kw.setText("Kewarganeraan");

        jLabel15.setText("/");

        buttonGroup1.add(rblaki);
        rblaki.setText("Laki-Laki");

        buttonGroup1.add(rbp);
        rbp.setText("Perempuan");
        rbp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbpActionPerformed(evt);
            }
        });

        cbagm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Hindu", "Kong Hu Cu" }));

        cbsts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kawin", "Belum Kawin", " " }));

        cbgd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "AB", "B", "O" }));

        buttonGroup2.add(rbkew1);
        rbkew1.setText("WNI");

        buttonGroup2.add(rbkew2);
        rbkew2.setText("WNA");

        jLabel16.setText("/");

        breset.setText("Reset");
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });

        bregister.setText("Register");
        bregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bregisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama)
                            .addComponent(ttl)
                            .addComponent(jk)
                            .addComponent(almt)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kd)
                                    .addComponent(rr)
                                    .addComponent(kec)
                                    .addComponent(kota)))
                            .addComponent(agm)
                            .addComponent(sts)
                            .addComponent(gd)
                            .addComponent(pk)
                            .addComponent(kw))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbkew1)
                                .addGap(10, 10, 10)
                                .addComponent(rbkew2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbgd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbsts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbagm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtnama)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jtttl1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtttl2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                                .addComponent(jtalmt)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jtr1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtr2))
                                .addComponent(jtkd)
                                .addComponent(jtkec)
                                .addComponent(jtkota)
                                .addComponent(jtpek)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(rblaki)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbp)))))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(breset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bregister)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nama)
                    .addComponent(jtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtttl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ttl)
                        .addComponent(jLabel15)
                        .addComponent(jtttl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jk)
                    .addComponent(rblaki)
                    .addComponent(rbp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(almt)
                    .addComponent(jtalmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rr)
                    .addComponent(jtr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kd)
                    .addComponent(jtkd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kec)
                    .addComponent(jtkec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kota)
                    .addComponent(jtkota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agm)
                    .addComponent(cbagm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sts)
                    .addComponent(cbsts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gd)
                    .addComponent(cbgd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pk)
                    .addComponent(jtpek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kw)
                    .addComponent(rbkew1)
                    .addComponent(rbkew2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breset)
                    .addComponent(bregister))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbpActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_rbpActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
        // TODO add your handling code here:
        jtnama.setText("");
        jtttl1.setText("");
        jtttl2.setText("");
        buttonGroup1.clearSelection();
        jtalmt.setText("");
        jtr1.setText("");
        jtr2.setText("");
        jtkd.setText("");
        jtkec.setText("");
        jtkota.setText("");
        cbagm.setSelectedItem(null);
        cbsts.setSelectedItem(null);
        cbgd.setSelectedItem(null);
        jtpek.setText("");
        buttonGroup2.clearSelection();
    }//GEN-LAST:event_bresetActionPerformed

    private void bregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bregisterActionPerformed
        // TODO add your handling code here:
        String Nama, ttl, tl, Alamat, RT, RW, desa, Kec, kota, agama, status, godar, pekerjaan;
        Nama = jtnama.getText();
        ttl = jtttl1.getText();
        tl = jtttl2.getText();
        String JK = null;
            if (rblaki.isSelected())
            {JK = rblaki.getText();}
            else if (rbp.isSelected())
            {JK =rbp.getText();}
        Alamat =jtalmt.getText();
        RT = jtr1.getText();
        RW = jtr2.getText();
        desa = jtkd.getText();
        Kec = jtkec.getText();
        kota = jtkota.getText();
        agama = cbagm.getSelectedItem().toString();
        status = cbsts.getSelectedItem().toString();
        godar = cbgd.getSelectedItem().toString();
        pekerjaan = jtpek.getText();
        String kewarganegaraan=null;
            if (rbkew1.isSelected())
            {kewarganegaraan = rbkew2.getText();}
            else if (rbkew2.isSelected())
            {kewarganegaraan = rbkew1.getText();}
            
       
       Tugas2_Output x = new Tugas2_Output(Nama, ttl, tl, JK, Alamat, RT, RW, desa, Kec, kota, agama, status, godar, pekerjaan, kewarganegaraan);
        x.setVisible(true);
             
    }//GEN-LAST:event_bregisterActionPerformed

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
            java.util.logging.Logger.getLogger(Tugas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agm;
    private javax.swing.JLabel almt;
    private javax.swing.JButton bregister;
    private javax.swing.JButton breset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbagm;
    private javax.swing.JComboBox<String> cbgd;
    private javax.swing.JComboBox<String> cbsts;
    private javax.swing.JLabel gd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jk;
    private javax.swing.JTextField jtalmt;
    private javax.swing.JTextField jtkd;
    private javax.swing.JTextField jtkec;
    private javax.swing.JTextField jtkota;
    private javax.swing.JTextField jtnama;
    private javax.swing.JTextField jtpek;
    private javax.swing.JTextField jtr1;
    private javax.swing.JTextField jtr2;
    private javax.swing.JTextField jtttl1;
    private javax.swing.JTextField jtttl2;
    private javax.swing.JLabel kd;
    private javax.swing.JLabel kec;
    private javax.swing.JLabel kota;
    private javax.swing.JLabel kw;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel pk;
    private javax.swing.JRadioButton rbkew1;
    private javax.swing.JRadioButton rbkew2;
    private javax.swing.JRadioButton rblaki;
    private javax.swing.JRadioButton rbp;
    private javax.swing.JLabel rr;
    private javax.swing.JLabel sts;
    private javax.swing.JLabel ttl;
    // End of variables declaration//GEN-END:variables
}
