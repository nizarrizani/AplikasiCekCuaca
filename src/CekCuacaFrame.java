
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.json.JSONObject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class CekCuacaFrame extends javax.swing.JFrame {

    /**
     * Creates new form CekCuacaFrame
     */
    public CekCuacaFrame() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNamaKota = new javax.swing.JTextField();
        btnCekCuaca = new javax.swing.JButton();
        lblIcon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblCuaca = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblKeteranganCuaca = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSuhuCuaca = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblAnginCuaca = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblAwanCuaca = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nama Kota");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(txtNamaKota, gridBagConstraints);

        btnCekCuaca.setText("Cek Cuaca");
        btnCekCuaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekCuacaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(btnCekCuaca, gridBagConstraints);

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setText("ICON");
        lblIcon.setPreferredSize(new java.awt.Dimension(60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(lblIcon, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("Cuaca :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel2.add(jLabel3, gridBagConstraints);

        lblCuaca.setText("-");
        lblCuaca.setPreferredSize(new java.awt.Dimension(80, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel2.add(lblCuaca, gridBagConstraints);

        jLabel5.setText("Keterangan :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel2.add(jLabel5, gridBagConstraints);

        lblKeteranganCuaca.setText("-");
        lblKeteranganCuaca.setPreferredSize(new java.awt.Dimension(80, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel2.add(lblKeteranganCuaca, gridBagConstraints);

        jLabel7.setText("Suhu :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel2.add(jLabel7, gridBagConstraints);

        lblSuhuCuaca.setText("-");
        lblSuhuCuaca.setPreferredSize(new java.awt.Dimension(80, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel2.add(lblSuhuCuaca, gridBagConstraints);

        jLabel9.setText("Angin :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel2.add(jLabel9, gridBagConstraints);

        lblAnginCuaca.setText("-");
        lblAnginCuaca.setPreferredSize(new java.awt.Dimension(80, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel2.add(lblAnginCuaca, gridBagConstraints);

        jLabel10.setText("Awan :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel2.add(jLabel10, gridBagConstraints);

        lblAwanCuaca.setText("-");
        lblAwanCuaca.setPreferredSize(new java.awt.Dimension(80, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel2.add(lblAwanCuaca, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jPanel2, gridBagConstraints);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.2;
        jPanel1.add(jPanel3, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCekCuacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekCuacaActionPerformed
        String kota = txtNamaKota.getText();
        cekCuaca(kota);
    }//GEN-LAST:event_btnCekCuacaActionPerformed

    private void cekCuaca(String kota) {
        // Cek dulu apakah kota kosong
        if (kota == null || kota.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama kota tidak boleh kosong!", "Error", JOptionPane.WARNING_MESSAGE);
            return; // Hentikan proses jika kota kosong
        }

        String apiKey = "07df57ec686790b155da3f0b59a7c39a"; // Ganti dengan API key OpenWeatherMap-mu
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + kota + "&appid=" + apiKey + "&units=metric";

        try {
            // Buat URL dan koneksi
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Baca respon API-nya
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Parsing JSON respon dari API
            JSONObject json = new JSONObject(response.toString());

            // Ambil data cuaca
            String cuaca = json.getJSONArray("weather").getJSONObject(0).getString("main");
            String keterangan = json.getJSONArray("weather").getJSONObject(0).getString("description");
            String iconCode = json.getJSONArray("weather").getJSONObject(0).getString("icon");
            double suhu = json.getJSONObject("main").getDouble("temp");
            double angin = json.getJSONObject("wind").getDouble("speed");
            int awan = json.getJSONObject("clouds").getInt("all");

            // Update label di GUI
            lblCuaca.setText(cuaca);

            // Tampilkan keterangan dengan tooltip jika teksnya panjang
            lblKeteranganCuaca.setText(keterangan);
            lblKeteranganCuaca.setToolTipText(keterangan);

            lblSuhuCuaca.setText(suhu + " °C");
            lblAnginCuaca.setText(angin + " m/s");
            lblAwanCuaca.setText(awan + " %");

            // Set icon cuaca
            String iconUrl = "http://openweathermap.org/img/wn/" + iconCode + "@2x.png";
            lblIcon.setIcon(new ImageIcon(new URL(iconUrl)));

        } catch (Exception e) {
            // Tampilkan error tanpa URL, hanya pesan kesalahan
            JOptionPane.showMessageDialog(this, "Gagal mengambil data cuaca: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            lblCuaca.setText("Error");
            lblKeteranganCuaca.setText("Tidak dapat memuat cuaca");
            lblKeteranganCuaca.setToolTipText(null); // Hapus tooltip jika error
            lblSuhuCuaca.setText("-");
            lblAnginCuaca.setText("-");
            lblAwanCuaca.setText("-");
            lblIcon.setIcon(null);
        }
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
            java.util.logging.Logger.getLogger(CekCuacaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CekCuacaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CekCuacaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CekCuacaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CekCuacaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCekCuaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAnginCuaca;
    private javax.swing.JLabel lblAwanCuaca;
    private javax.swing.JLabel lblCuaca;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblKeteranganCuaca;
    private javax.swing.JLabel lblSuhuCuaca;
    private javax.swing.JTextField txtNamaKota;
    // End of variables declaration//GEN-END:variables
}
