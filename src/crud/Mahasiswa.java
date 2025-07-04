package crud;

import java.sql.*;

public class Mahasiswa {

    public String nim;
    public String nama;
    public Integer nilai;

    public boolean tambah()  {
        String DBDRIVER = "com.mysql.cj.jdbc.Driver";
        String DBCONNECTION = "jdbc:mysql://localhost:3306/test";
        String DBUSER = "root";
        String DBPASS = "";

        Connection conn = null;
        PreparedStatement st;

        try {
            Class.forName(DBDRIVER);
            conn = DriverManager.getConnection(DBCONNECTION, DBUSER, DBPASS);

            // prepare select statement
            String sql = "INSERT INTO mahasiswa (nim,nama,nilai) values (?,?,?)";
            st = conn.prepareStatement(sql);
            st.setString(1, this.nim);
            st.setString(2, this.nama);
            st.setInt(3, this.nilai);
            st.executeUpdate();
            conn.close();
            return true;
        } catch (SQLSyntaxErrorException ex) {
            System.out.println("Error");
            return false;
        } catch (SQLException ex) {
            System.out.println("Error Koneksi");
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        } finally {
            
        }

    }
}