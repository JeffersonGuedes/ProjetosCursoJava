package Dao;

import Dto.CadastroProdutosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroProdutosDAO {

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;

    public void cadastroProdutodao(CadastroProdutosDTO cpdto) {
        String sql = "insert into tbproduto (codigoproduto, item, unidademedida, estoqueminimo, custounitario, precounitario) values (?, ?, ?, ?, ?, ?)";
        con = ConexaoDAO.conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, cpdto.getCodigoProduto());
            pstm.setString(2, cpdto.getItem());
            pstm.setString(3, cpdto.getUnidadeDeMedida());
            pstm.setInt(4, cpdto.getEstoqueMinimo());
            pstm.setDouble(5, cpdto.getCustoUnitario());
            pstm.setDouble(6, cpdto.getPrecoUnitario());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CadastroProdutoDao Cadastrar" + e.getMessage());
        }
    }

    ArrayList<CadastroProdutosDTO> lista = new ArrayList<>();

    public ArrayList<CadastroProdutosDTO> pesquisarCadastroProdutos() {

        String sql = "select * from tbproduto";
        con = new ConexaoDAO().conectaBD();
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                CadastroProdutosDTO objCadastroprodutosDTO = new CadastroProdutosDTO();
                objCadastroprodutosDTO.setCodigoProduto(rs.getInt("codigoproduto"));
                objCadastroprodutosDTO.setItem(rs.getString("item"));
                objCadastroprodutosDTO.setUnidadeDeMedida(rs.getString("unidademedida"));
                objCadastroprodutosDTO.setEstoqueMinimo(rs.getInt("estoqueminimo"));
                objCadastroprodutosDTO.setCustoUnitario(rs.getDouble("custounitario"));
                objCadastroprodutosDTO.setPrecoUnitario(rs.getDouble("precounitario"));

                lista.add(objCadastroprodutosDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Pesquisar Cadastro Produtos:" + e.getMessage());
        }
        return lista;
    }

    public void alterarCadastroProdutos(CadastroProdutosDTO cpdto) {
        String sql = "update tbproduto set item = ?, unidademedida = ?, estoqueminimo = ?, custounitario = ?, precounitario = ? where codigoproduto = ? ";

        con = ConexaoDAO.conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, cpdto.getItem());
            pstm.setString(2, cpdto.getUnidadeDeMedida());
            pstm.setInt(3, cpdto.getEstoqueMinimo());
            pstm.setDouble(4, cpdto.getCustoUnitario());
            pstm.setDouble(5, cpdto.getPrecoUnitario());
            pstm.setInt(6, cpdto.getCodigoProduto());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CadastroProdutoDao Alterar" + e.getMessage());
        }
    }
    
    public void excluirCadastroProdutos(CadastroProdutosDTO cpdto) {
        String sql = "delete from tbproduto where codigoproduto = ? ";

        con = ConexaoDAO.conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, cpdto.getCodigoProduto());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CadastroProdutoDao Excluir" + e.getMessage());
        }
    }
}
