
package Dao;

import Dto.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UsuarioDAO {
    Connection conn;
    public ResultSet autenticacaoUsuario(UsuarioDTO objetoUsuarioDTO){
        conn=new ConexaoDAO().conectaBD();
        try {
            String sql="select * from tblogin where usuario=? and senha=?";
            PreparedStatement pstm= conn.prepareStatement(sql);
            pstm.setString(1,objetoUsuarioDTO.getUsuario());
            pstm.setString(2, objetoUsuarioDTO.getSenha());
            ResultSet rs=pstm.executeQuery();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + e.getMessage());
            return null;
        }
    
}
}
