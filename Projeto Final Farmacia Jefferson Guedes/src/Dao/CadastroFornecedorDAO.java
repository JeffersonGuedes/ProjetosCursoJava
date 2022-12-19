package Dao;

import Dto.CadastroFornecedorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroFornecedorDAO {

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;

    public void cadastroFornecedordao(CadastroFornecedorDTO cfdto) {
        String sql = "insert into tbfornecedor (codigofornecedor, empresa, telefone, email, endereco, totalcomprado) values (?, ?, ?, ?, ?, ?)";
        con = ConexaoDAO.conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, cfdto.getCodigoFornecedor());
            pstm.setString(2, cfdto.getEmpresa());
            pstm.setString(3, cfdto.getTelefone());
            pstm.setString(4, cfdto.getEmail());
            pstm.setString(5, cfdto.getEndereco());
            pstm.setDouble(6, cfdto.getTotalComprado());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CadastroFornecedorDao" + e.getMessage());
        }
    }
    
    ArrayList<CadastroFornecedorDTO> lista = new ArrayList<>();

    public ArrayList<CadastroFornecedorDTO> pesquisarCadastroFornecedor() {

        String sql = "select * from tbfornecedor";
        con = new ConexaoDAO().conectaBD();
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                CadastroFornecedorDTO objCadastrofornecedorDTO = new CadastroFornecedorDTO();
                
                objCadastrofornecedorDTO.setEmpresa(rs.getString("empresa"));
                objCadastrofornecedorDTO.setCodigoFornecedor(rs.getInt("codigofornecedor"));
                objCadastrofornecedorDTO.setTelefone(rs.getString("telefone"));
                objCadastrofornecedorDTO.setEmail(rs.getString("email"));
                objCadastrofornecedorDTO.setEndereco(rs.getString("endereco"));
                objCadastrofornecedorDTO.setTotalComprado(rs.getDouble("totalcomprado"));
                
                lista.add(objCadastrofornecedorDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Pesquisar Cadastro Fornecedor:" + e.getMessage());
        }
        return lista;
    }
    
    public void alterarCadastroFornecedor(CadastroFornecedorDTO cpdto) {
        String sql = "update tbfornecedor set empresa = ?, telefone = ?, email = ?, endereco = ?, totalcomprado = ? where codigofornecedor = ? ";

        con = ConexaoDAO.conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, cpdto.getEmpresa());
            pstm.setString(2, cpdto.getTelefone());
            pstm.setString(3, cpdto.getEmail());
            pstm.setString(4, cpdto.getEndereco());
            pstm.setDouble(5, cpdto.getTotalComprado());
            pstm.setInt(6, cpdto.getCodigoFornecedor());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CadastroFornecedorDao Alterar" + e.getMessage());
        }
    }
    
    public void excluirCadastroFornecedor(CadastroFornecedorDTO cpdto) {
        String sql = "delete from tbfornecedor where codigofornecedor = ? ";

        con = ConexaoDAO.conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, cpdto.getCodigoFornecedor());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CadastroFornecedorDao Excluir" + e.getMessage());
        }
    }
}
