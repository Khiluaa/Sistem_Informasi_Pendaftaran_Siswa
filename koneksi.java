package projek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {

    private static Connection pendafatransiswa;

    public static Connection koneksiDB() throws SQLException {
        if (pendafatransiswa == null) {
            try {
                String DB = "jdbc:mysql://localhost/pendafatransiswa";
                String user = "root";
                String pass = "";
                Class.forName("com.mysql.cj.jdbc.Driver");
                pendafatransiswa = DriverManager.getConnection(DB, user, pass);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "koneksi gagal");
            }
        }
        return pendafatransiswa;
    }
}
