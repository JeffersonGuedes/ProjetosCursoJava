
package Dao;





import Dto.CadastroLojaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CadastroLojaDAO{
 Connection con;
    PreparedStatement pstm;
    ResultSet rs;

    public void cadastroLojadao(CadastroLojaDTO cldto) {
        String sql = "insert into tbloja (codigoloja, loja, telefone, email, endereco, totalvendido) values (?, ?, ?, ?, ?, ?)";
        con = ConexaoDAO.conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, cldto.getCodigoLoja());
            pstm.setString(2, cldto.getLoja());
            pstm.setString(3, cldto.getTelefone());
            pstm.setString(4, cldto.getEmail());
            pstm.setString(5, cldto.getEndereco());
            pstm.setDouble(6, cldto.getTotalVendido());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CadastroLojaDao" + e.getMessage());
        }
    }
    
    ArrayList<CadastroLojaDTO> lista = new ArrayList<>();

    public ArrayList<CadastroLojaDTO> pesquisarCadastroLoja() {

        String sql = "select * from tbloja";
        con = new ConexaoDAO().conectaBD();
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                CadastroLojaDTO objCadastrolojaDTO = new CadastroLojaDTO();
                objCadastrolojaDTO.setCodigoLoja(rs.getInt("codigoloja"));
                objCadastrolojaDTO.setLoja(rs.getString("loja"));
                objCadastrolojaDTO.setTelefone(rs.getString("telefone"));
                objCadastrolojaDTO.setEmail(rs.getString("email"));
                objCadastrolojaDTO.setEndereco(rs.getString("endereco"));
                objCadastrolojaDTO.setTotalVendido(rs.getDouble("totalvendido"));
                
                lista.add(objCadastrolojaDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Pesquisar Cadastro Loja:" + e.getMessage());
        }
        return lista;
    }
    
    public void alterarCadastroLoja(CadastroLojaDTO cldto) {
        String sql = "update tbloja set loja = ?, telefone = ?, email = ?, endereco = ?, totalvendido = ? where codigoloja = ? ";

        con = ConexaoDAO.conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, cldto.getLoja());
            pstm.setString(2, cldto.getTelefone());
            pstm.setString(3, cldto.getEmail());
            pstm.setString(4, cldto.getEndereco());
            pstm.setDouble(5, cldto.getTotalVendido());
            pstm.setInt(6, cldto.getCodigoLoja());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CadastroLojaDao Alterar" + e.getMessage());
        }
    }
    
    public void excluirCadastroFornecedor(CadastroLojaDTO cldto) {
        String sql = "delete from tbloja where codigoloja = ? ";

        con = ConexaoDAO.conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, cldto.getCodigoLoja());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CadastroLojaDao Excluir" + e.getMessage());
        }
    }
}
