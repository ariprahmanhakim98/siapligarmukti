package koneksi;
import java.sql.*;

public class koneksi {
        
    public Connection koneksi;
    public Statement stm;
    
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil koneksi");
        }catch(ClassNotFoundException ex){
            System.out.println("Gagal koneksi" +ex);
        }
        String url = "jdbc:mysql://localhost/dbligarmukti";
        try{
            koneksi = DriverManager.getConnection(url,"root","");
            stm=koneksi.createStatement();
            System.out.println("Berhasil koneksi database");
        }catch(SQLException ex){
            System.out.println("Gagal koneksi database");
        }
        return koneksi;
    }
}
