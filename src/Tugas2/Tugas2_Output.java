
import javax.swing.Icon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Indriawan N
 */
public class Tugas2_Output extends javax.swing.JFrame {

    /**
     * Creates new form Tugas2_Output
     */
    public Tugas2_Output() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public Tugas2_Output(String Nama, String ttl, String tl, String JK, String Alamat, String RT, String RW, String desa, String Kec, String kota, String agama,String status, String godar,String pekerjaan,String kewarganegaraan)
         {
        initComponents();
        jtnama.setText(Nama);
        jtttl1.setText(ttl);
        jtttl2.setText(tl);
        jkk.setText(""+JK);
        jtalmt.setText(Alamat);
        jtr12.setText(RT);
        jtr22.setText(RW);
        jtkd2.setText(desa);
        jtkec2.setText(Kec);
        jtkota2.setText(kota);
        jtagm2.setText(""+agama);
        jtsts2.setText(""+status);
        jtgd2.setText(""+godar);
        jtpek2.setText(pekerjaan);
        jtkew2.setText(""+kewarganegaraan);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nama2 = new javax.swing.JLabel();
        ttl2 = new javax.swing.JLabel();
        jk2 = new javax.swing.JLabel();
        almt2 = new javax.swing.JLabel();
        rr2 = new javax.swing.JLabel();
        kd2 = new javax.swing.JLabel();
        kec2 = new javax.swing.JLabel();
        kota2 = new javax.swing.JLabel();
        agm2 = new javax.swing.JLabel();
        sts2 = new javax.swing.JLabel();
        gd2 = new javax.swing.JLabel();
        pk2 = new javax.swing.JLabel();
        kw2 = new javax.swing.JLabel();
        jtnama = new javax.swing.JTextField();
        jtttl1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtttl2 = new javax.swing.JTextField();
        jtalmt = new javax.swing.JTextField();
        jtr12 = new javax.swing.JTextField();
        jtr22 = new javax.swing.JTextField();
        jtkd2 = new javax.swing.JTextField();
        jtkec2 = new javax.swing.JTextField();
        jtkota2 = new javax.swing.JTextField();
        jtpek2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtkew2 = new javax.swing.JTextField();
        jtgd2 = new javax.swing.JTextField();
        jtagm2 = new javax.swing.JTextField();
        jtsts2 = new javax.swing.JTextField();
        jkk = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("KARTU TANDA PENDUDUK");

        nama2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nama2.setText("Nama");

        ttl2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ttl2.setText("Tempat/Tanggal Lahir");

        jk2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jk2.setText("Jenis Kelamin");

        almt2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        almt2.setText("Alamat");

        rr2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rr2.setText("RT/RW");

        kd2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        kd2.setText("Kel/Desa");

        kec2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        kec2.setText("Kecamatan");

        kota2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        kota2.setText("Kota");

        agm2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        agm2.setText("Agama");

        sts2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sts2.setText("Status");

        gd2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        gd2.setText("Golongan Darah");

        pk2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pk2.setText("Pekerjaan");

        kw2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        kw2.setText("Kewarganeraan");

        jtnama.setEditable(false);

        jtttl1.setEditable(false);

        jLabel15.setText("/");

        jtttl2.setEditable(false);

        jtalmt.setEditable(false);

        jtr12.setEditable(false);

        jtr22.setEditable(false);

        jtkd2.setEditable(false);

        jtkec2.setEditable(false);
        jtkec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtkec2ActionPerformed(evt);
            }
        });

        jtkota2.setEditable(false);

        jtpek2.setEditable(false);

        jLabel16.setText("/");

        jtkew2.setEditable(false);

        jtgd2.setEditable(false);

        jtagm2.setEditable(false);

        jtsts2.setEditable(false);

        jkk.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama2)
                            .addComponent(ttl2)
                            .addComponent(jk2)
                            .addComponent(almt2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kd2)
                                    .addComponent(rr2)
                                    .addComponent(kec2)
                                    .addComponent(kota2)))
                            .addComponent(agm2)
                            .addComponent(sts2)
                            .addComponent(gd2)
                            .addComponent(pk2)
                            .addComponent(kw2))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtnama)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtttl1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtttl2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                            .addComponent(jtalmt)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtr12, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtr22))
                            .addComponent(jtkd2)
                            .addComponent(jtkec2)
                            .addComponent(jtkota2)
                            .addComponent(jtpek2)
                            .addComponent(jtkew2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtgd2)
                            .addComponent(jtagm2)
                            .addComponent(jtsts2)
                            .addComponent(jkk)))
                    .addComponent(jLabel1))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nama2)
                    .addComponent(jtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtttl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ttl2)
                        .addComponent(jLabel15)
                        .addComponent(jtttl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jk2)
                    .addComponent(jkk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(almt2)
                    .addComponent(jtalmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rr2)
                    .addComponent(jtr12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtr22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kd2)
                    .addComponent(jtkd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kec2)
                    .addComponent(jtkec2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kota2)
                    .addComponent(jtkota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agm2)
                    .addComponent(jtagm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sts2)
                    .addComponent(jtsts2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gd2)
                    .addComponent(jtgd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pk2)
                    .addComponent(jtpek2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kw2)
                    .addComponent(jtkew2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
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

   
    private void jtkec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtkec2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtkec2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tugas2_Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas2_Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas2_Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas2_Output.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas2_Output().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agm2;
    private javax.swing.JLabel almt2;
    private javax.swing.JLabel gd2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jk2;
    private javax.swing.JTextField jkk;
    private javax.swing.JTextField jtagm2;
    private javax.swing.JTextField jtalmt;
    private javax.swing.JTextField jtgd2;
    private javax.swing.JTextField jtkd2;
    private javax.swing.JTextField jtkec2;
    private javax.swing.JTextField jtkew2;
    private javax.swing.JTextField jtkota2;
    private javax.swing.JTextField jtnama;
    private javax.swing.JTextField jtpek2;
    private javax.swing.JTextField jtr12;
    private javax.swing.JTextField jtr22;
    private javax.swing.JTextField jtsts2;
    private javax.swing.JTextField jtttl1;
    private javax.swing.JTextField jtttl2;
    private javax.swing.JLabel kd2;
    private javax.swing.JLabel kec2;
    private javax.swing.JLabel kota2;
    private javax.swing.JLabel kw2;
    private javax.swing.JLabel nama2;
    private javax.swing.JLabel pk2;
    private javax.swing.JLabel rr2;
    private javax.swing.JLabel sts2;
    private javax.swing.JLabel ttl2;
    // End of variables declaration//GEN-END:variables
}
