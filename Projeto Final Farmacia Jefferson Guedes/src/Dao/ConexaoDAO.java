package Dao;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoDAO {

    public static Connection conectaBD() {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/bdfarmacia?user=root&password=";
            conn = DriverManager.getConnection(url);

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ModuloConexao" + erro.getMessage());

        }

        return conn;
    }
}
