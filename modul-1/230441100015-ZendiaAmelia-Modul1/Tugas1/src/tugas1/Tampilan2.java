/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas1;


/**
 *
 * @author ZENDIA AMELIA
 */
public class Tampilan2 extends javax.swing.JFrame {

    /**
     * Creates new form Tampilan2
     */
    public Tampilan2() {
        initComponents();
    }

    Tampilan2(String nama, String tempat_lahir, String tanggal_lahir, String jenis_kelamin, String alamat, String no_telepon, String email, String prodi, String beasiswa) {
        
        Inputsatu.setText(nama);  
        Inputdua.setText(tempat_lahir);  
        Inputtiga.setText(tanggal_lahir);  
        Inputempat.setText(jenis_kelamin);
        Inputlima.setText(alamat);  
        Inputenam.setText(no_telepon);  
        Inputtujuh.setText(email);  
        Inputdelapan.setText(prodi); 
        Beasiswa2.setText(beasiswa);
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
        jPanel1 = new javax.swing.JPanel();
        Judul1 = new javax.swing.JLabel();
        Judul2 = new javax.swing.JLabel();
        Judul3 = new javax.swing.JLabel();
        Judul4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nama2 = new javax.swing.JLabel();
        Tempatlahir2 = new javax.swing.JLabel();
        Tanggallahir2 = new javax.swing.JLabel();
        Jeniskelamin2 = new javax.swing.JLabel();
        Alamat2 = new javax.swing.JLabel();
        Notelpon2 = new javax.swing.JLabel();
        Email2 = new javax.swing.JLabel();
        Prodi2 = new javax.swing.JLabel();
        Beasiswa2 = new javax.swing.JLabel();
        Keluar = new javax.swing.JButton();
        Inputsatu = new javax.swing.JTextField();
        Inputdua = new javax.swing.JTextField();
        Inputtiga = new javax.swing.JTextField();
        Inputempat = new javax.swing.JTextField();
        Inputlima = new javax.swing.JTextField();
        Inputenam = new javax.swing.JTextField();
        Inputtujuh = new javax.swing.JTextField();
        Inputdelapan = new javax.swing.JTextField();
        Inputsembilan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setForeground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        Judul1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Judul1.setText("FORMULIR PENDAFTARAN BEASISWA UTM");
        Judul1.setAlignmentY(10.0F);

        Judul2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Judul2.setText("UNIVERSITAS TRUNOJOYO MADURA");
        Judul2.setAlignmentY(10.0F);

        Judul3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Judul3.setText("Jl. Raya Telang. PO.Box. 2. Kamal, Bangkalan - Madura");

        Judul4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Judul4.setText("Telp : (031) 3011146, Fax. (056) 311109");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas1/logo wargalab.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Judul3))
                            .addComponent(Judul2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Judul4)
                                .addGap(55, 55, 55)))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Judul1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Judul1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Judul2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Judul3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Judul4)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Nama2.setForeground(new java.awt.Color(255, 255, 255));
        Nama2.setText("Nama :");

        Tempatlahir2.setForeground(new java.awt.Color(255, 255, 255));
        Tempatlahir2.setText("Tempat Lahir :");

        Tanggallahir2.setForeground(new java.awt.Color(255, 255, 255));
        Tanggallahir2.setText("Tanggal Lahir :");

        Jeniskelamin2.setForeground(new java.awt.Color(255, 255, 255));
        Jeniskelamin2.setText("Jenis Kelamin :");

        Alamat2.setForeground(new java.awt.Color(255, 255, 255));
        Alamat2.setText("Alamat :");

        Notelpon2.setForeground(new java.awt.Color(255, 255, 255));
        Notelpon2.setText("No Telepon :");

        Email2.setForeground(new java.awt.Color(255, 255, 255));
        Email2.setText("Email :");

        Prodi2.setForeground(new java.awt.Color(255, 255, 255));
        Prodi2.setText("Prodi :");

        Beasiswa2.setForeground(new java.awt.Color(255, 255, 255));
        Beasiswa2.setText("Beasiswa :");

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        Inputsatu.setEditable(false);
        Inputsatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputsatuActionPerformed(evt);
            }
        });

        Inputdua.setEditable(false);

        Inputtiga.setEditable(false);

        Inputempat.setEditable(false);

        Inputlima.setEditable(false);

        Inputenam.setEditable(false);

        Inputtujuh.setEditable(false);

        Inputdelapan.setEditable(false);

        Inputsembilan.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tanggallahir2)
                    .addComponent(Tempatlahir2)
                    .addComponent(Nama2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Alamat2)
                        .addComponent(Jeniskelamin2)
                        .addComponent(Notelpon2)
                        .addComponent(Email2)
                        .addComponent(Prodi2)
                        .addComponent(Beasiswa2)))
                .addGap(99, 99, 99)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Inputsatu)
                    .addComponent(Inputdua)
                    .addComponent(Inputtiga)
                    .addComponent(Inputempat)
                    .addComponent(Inputlima)
                    .addComponent(Inputenam)
                    .addComponent(Inputtujuh)
                    .addComponent(Inputdelapan)
                    .addComponent(Inputsembilan, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Keluar)
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                            .addComponent(Nama2)
                                                                            .addComponent(Inputsatu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                            .addComponent(Tempatlahir2)
                                                                            .addComponent(Inputdua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(Tanggallahir2))
                                                                    .addComponent(Inputtiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(Jeniskelamin2))
                                                            .addComponent(Inputempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(Alamat2))
                                                    .addComponent(Inputlima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Notelpon2))
                                            .addComponent(Inputenam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Email2))
                                    .addComponent(Inputtujuh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Prodi2))
                            .addComponent(Inputdelapan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Beasiswa2))
                    .addComponent(Inputsembilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(Keluar)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputsatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputsatuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputsatuActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        Tampilan1benar Tampilan1=new Tampilan1benar();
        Tampilan1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Tampilan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tampilan2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alamat2;
    private javax.swing.JLabel Beasiswa2;
    private javax.swing.JLabel Email2;
    public javax.swing.JTextField Inputdelapan;
    public javax.swing.JTextField Inputdua;
    public javax.swing.JTextField Inputempat;
    public javax.swing.JTextField Inputenam;
    public javax.swing.JTextField Inputlima;
    public javax.swing.JTextField Inputsatu;
    public javax.swing.JTextField Inputsembilan;
    public javax.swing.JTextField Inputtiga;
    public javax.swing.JTextField Inputtujuh;
    private javax.swing.JLabel Jeniskelamin2;
    private javax.swing.JLabel Judul1;
    private javax.swing.JLabel Judul2;
    private javax.swing.JLabel Judul3;
    private javax.swing.JLabel Judul4;
    private javax.swing.JButton Keluar;
    private javax.swing.JLabel Nama2;
    private javax.swing.JLabel Notelpon2;
    private javax.swing.JLabel Prodi2;
    private javax.swing.JLabel Tanggallahir2;
    private javax.swing.JLabel Tempatlahir2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}