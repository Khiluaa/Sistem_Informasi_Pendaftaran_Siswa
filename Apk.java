package projek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Apk extends javax.swing.JFrame {

    private DefaultTableModel model;

    public Apk() {
        initComponents();
        model = (DefaultTableModel) tabel_siswa.getModel();
        showData();  // Menampilkan data dari database saat program dijalankan
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_submit = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_siswa = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_jeniskelamin = new javax.swing.JTextField();
        txt_ttl = new javax.swing.JTextField();
        txt_nik = new javax.swing.JTextField();
        txt_nama_ayah = new javax.swing.JTextField();
        txt_nama_ibu = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PENDAFTARAN SISWA BARU ");

        jLabel2.setText("Nama Lengkap ");

        jLabel3.setText("Jenis kelamin  ");

        jLabel4.setText("NIK Calon Mahasiswa ");

        jLabel5.setText("Tempat, Tanggal lahir ");

        jLabel6.setText("Nama ayah");

        jLabel7.setText("Nama ibu ");

        jLabel8.setText("Alamat ");

        btn_submit.setText("SUBMIT ");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        btn_cancel.setText("CANCEL");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        tabel_siswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Jenis Kelamin", "NIK", "TTL", "Nama Ayah", "Nama Ibu", "Alamat"
            }
        ));
        jScrollPane1.setViewportView(tabel_siswa);
        if (tabel_siswa.getColumnModel().getColumnCount() > 0) {
            tabel_siswa.getColumnModel().getColumn(1).setResizable(false);
            tabel_siswa.getColumnModel().getColumn(2).setResizable(false);
            tabel_siswa.getColumnModel().getColumn(3).setResizable(false);
            tabel_siswa.getColumnModel().getColumn(4).setResizable(false);
            tabel_siswa.getColumnModel().getColumn(5).setResizable(false);
            tabel_siswa.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DATA CALON SISWA BARU ");

        txt_jeniskelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jeniskelaminActionPerformed(evt);
            }
        });

        txt_nama_ibu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_ibuActionPerformed(evt);
            }
        });

        txt_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alamatActionPerformed(evt);
            }
        });

        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(119, 119, 119)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_jeniskelamin, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addComponent(txt_nama)
                            .addComponent(txt_nik)
                            .addComponent(txt_ttl)
                            .addComponent(txt_nama_ayah)
                            .addComponent(txt_nama_ibu)
                            .addComponent(txt_alamat)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(btn_submit)
                        .addGap(45, 45, 45)
                        .addComponent(btn_delete)
                        .addGap(42, 42, 42)
                        .addComponent(btn_update)
                        .addGap(41, 41, 41)
                        .addComponent(btn_cancel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(483, 483, 483)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(549, 549, 549)
                        .addComponent(jLabel9)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_jeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_ttl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_nama_ayah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_nama_ibu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_submit)
                    .addComponent(btn_cancel)
                    .addComponent(btn_delete)
                    .addComponent(btn_update))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(121, 121, 121))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        // Ambil data dari input fields
        String nama = txt_nama.getText();
        String jeniskelamin = txt_jeniskelamin.getText();
        String nik = txt_nik.getText();
        String tempatlahir = txt_ttl.getText();
        String namaayah = txt_nama_ayah.getText();
        String namaibu = txt_nama_ibu.getText();
        String alamat = txt_alamat.getText();

        // Validasi input (dapat disesuaikan sesuai kebutuhan)
        if (nama.isEmpty() || jeniskelamin.isEmpty() || nik.isEmpty() || tempatlahir.isEmpty()
                || namaayah.isEmpty() || namaibu.isEmpty() || alamat.isEmpty()) {
            // Tampilkan pesan kesalahan jika ada field yang kosong
            System.out.println("Silakan lengkapi semua data!");
        } else {
            // Tambahkan data ke dalam tabel di UI
            model.addRow(new Object[]{nama, jeniskelamin, nik, tempatlahir, namaayah, namaibu, alamat});

            // Simpan data ke dalam database
            saveToDatabase(nama, jeniskelamin, nik, tempatlahir, namaayah, namaibu, alamat);

            // Bersihkan input fields setelah ditambahkan ke dalam tabel
            clearInputFields();
        }
    }//GEN-LAST:event_btn_submitActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        clearInputFields();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void txt_jeniskelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jeniskelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jeniskelaminActionPerformed

    private void txt_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alamatActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        // Ambil baris terpilih dari tabel
        int selectedRow = tabel_siswa.getSelectedRow();

        // Pastikan ada baris yang terpilih
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Ambil NIK dari baris terpilih
        String nikToDelete = (String) model.getValueAt(selectedRow, 2);

        // Panggil metode deleteFromDatabase
        deleteFromDatabase(nikToDelete);

        // Hapus baris dari tabel di UI
        model.removeRow(selectedRow);
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        // Ambil baris terpilih dari tabel
        int selectedRow = tabel_siswa.getSelectedRow();

        // Pastikan ada baris yang terpilih
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin diupdate.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Ambil data dari input fields
        String nama = txt_nama.getText();
        String jeniskelamin = txt_jeniskelamin.getText();
        String nik = txt_nik.getText();
        String tempatlahir = txt_ttl.getText();
        String namaayah = txt_nama_ayah.getText();
        String namaibu = txt_nama_ibu.getText();
        String alamat = txt_alamat.getText();

        // Validasi input (dapat disesuaikan sesuai kebutuhan)
        if (isEmpty(nama, jeniskelamin, nik, tempatlahir, namaayah, namaibu, alamat)) {
            // Tampilkan pesan kesalahan jika ada field yang kosong
            JOptionPane.showMessageDialog(this, "Silakan lengkapi semua data!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Ambil NIK dari baris terpilih
            String nikToUpdate = (String) model.getValueAt(selectedRow, 2);

            // Panggil metode updateDatabase
            updateDatabase(nikToUpdate, nama, jeniskelamin, nik, tempatlahir, namaayah, namaibu, alamat);

            // Update data pada tabel di UI
            model.setValueAt(nama, selectedRow, 0);
            model.setValueAt(jeniskelamin, selectedRow, 1);
            model.setValueAt(nik, selectedRow, 2);
            model.setValueAt(tempatlahir, selectedRow, 3);
            model.setValueAt(namaayah, selectedRow, 4);
            model.setValueAt(namaibu, selectedRow, 5);
            model.setValueAt(alamat, selectedRow, 6);

            // Bersihkan input fields setelah diupdate
            clearInputFields();
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void txt_nama_ibuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_ibuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_ibuActionPerformed

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
            java.util.logging.Logger.getLogger(Apk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apk().setVisible(true);
            }
        });
    }

    private boolean isEmpty(String... values) {
        for (String value : values) {
            if (value.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private void saveToDatabase(String nama, String jeniskelamin, String nik, String tempatlahir, String namaayah, String namaibu, String alamat) {
        try {
            Connection connection = ConfigDB();  // Panggil metode ConfigDB() untuk mendapatkan koneksi

            // Query SQL untuk menyimpan data
            String query = "INSERT INTO pendaftaran_siswa (nama_lengkap, jenis_kelamin, nik, tempat_tanggal_lahir, nama_ayah, nama_ibu, alamat) VALUES (?, ?, ?, ?, ?, ?, ?)";

            // Buat prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // Set nilai parameter sesuai data yang akan disimpan
            preparedStatement.setString(1, nama);
            preparedStatement.setString(2, jeniskelamin);
            preparedStatement.setString(3, nik);
            preparedStatement.setString(4, tempatlahir);
            preparedStatement.setString(5, namaayah);
            preparedStatement.setString(6, namaibu);
            preparedStatement.setString(7, alamat);

            // Eksekusi perintah SQL untuk menyimpan data
            preparedStatement.executeUpdate();

            // Tutup prepared statement dan koneksi
            preparedStatement.close();
            connection.close();

            // Tampilkan pesan berhasil (optional)
            System.out.println("Data berhasil disimpan ke database.");

            // Refresh tabel di UI dengan menampilkan data terbaru dari database
            showData();

        } catch (SQLException e) {
            // Tangkap eksepsi jika terjadi masalah
            e.printStackTrace();
            System.out.println("Gagal menyimpan data ke database: " + e.getMessage());
        }
    }

    private void clearInputFields() {
        // Bersihkan semua input fields
        txt_nama.setText("");
        txt_jeniskelamin.setText("");
        txt_nik.setText("");
        txt_ttl.setText("");
        txt_nama_ayah.setText("");
        txt_nama_ibu.setText("");
        txt_alamat.setText("");
    }

    private void showData() {
        try {
            // Bersihkan data di tabel
            model.setRowCount(0);

            // Buat koneksi ke database
            Connection connection = ConfigDB();

            // Query SQL untuk mendapatkan data dari database
            String query = "SELECT * FROM pendaftaran_siswa";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Tambahkan data ke tabel di UI
            while (resultSet.next()) {
                model.addRow(new Object[]{
                    resultSet.getString("nama_lengkap"),
                    resultSet.getString("jenis_kelamin"),
                    resultSet.getString("nik"),
                    resultSet.getString("tempat_tanggal_lahir"),
                    resultSet.getString("nama_ayah"),
                    resultSet.getString("nama_ibu"),
                    resultSet.getString("alamat")
                });
            }

            // Tutup result set dan statement (Jangan tutup koneksi di sini)
            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            // Tangkap eksepsi jika terjadi masalah
            e.printStackTrace();
            System.out.println("Gagal mengambil data dari database: " + e.getMessage());
        }
    }

    private void deleteFromDatabase(String nikToDelete) {
        try {
            Connection connection = ConfigDB();
            String query = "DELETE FROM pendaftaran_siswa WHERE nik=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nikToDelete);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();

            System.out.println("Data berhasil dihapus dari database.");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Gagal menghapus data dari database: " + e.getMessage());
        }
    }

    private void updateDatabase(String nikToUpdate, String nama, String jeniskelamin, String nik, String tempatlahir, String namaayah, String namaibu, String alamat) {
        try {
            Connection connection = ConfigDB();
            String query = "UPDATE pendaftaran_siswa SET nama_lengkap=?, jenis_kelamin=?, nik=?, tempat_tanggal_lahir=?, nama_ayah=?, nama_ibu=?, alamat=? WHERE nik=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, nama);
            preparedStatement.setString(2, jeniskelamin);
            preparedStatement.setString(3, nik);
            preparedStatement.setString(4, tempatlahir);
            preparedStatement.setString(5, namaayah);
            preparedStatement.setString(6, namaibu);
            preparedStatement.setString(7, alamat);
            preparedStatement.setString(8, nikToUpdate);

            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();

            System.out.println("Data berhasil diupdate ke database.");

            // Refresh tabel di UI dengan menampilkan data terbaru dari database
            showData();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Gagal mengupdate data ke database: " + e.getMessage());
        }
    }

    private Connection ConfigDB() throws SQLException {
        try {
            // Ubah sesuai dengan konfigurasi database Anda
            String url = "jdbc:mysql://localhost:3306/pendafatransiswa";
            String username = "root";
            String password = "";

            // Buat koneksi ke database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Return the connection
            return connection;
        } catch (SQLException e) {
            // Tangkap eksepsi dan lempar kembali
            throw new SQLException("Gagal membuat koneksi ke database: " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_submit;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_siswa;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_jeniskelamin;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nama_ayah;
    private javax.swing.JTextField txt_nama_ibu;
    private javax.swing.JTextField txt_nik;
    private javax.swing.JTextField txt_ttl;
    // End of variables declaration//GEN-END:variables
}
