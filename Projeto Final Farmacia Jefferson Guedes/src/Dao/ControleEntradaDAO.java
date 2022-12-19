package Dao;

import Dto.ControleEntradaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControleEntradaDAO{

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;

    public void cadastroEntradadao(ControleEntradaDTO cedto) {
        String sql = "insert into tbentrada (codigoproduto, codigofornecedor, datacompra, item, empresa, quantidade, custounitario, valorcompratotal) values (?, ?, ?, ?, ?, ?, ?, ?)";
        con = ConexaoDAO.conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, cedto.getCodigoProduto());
            pstm.setInt(2, cedto.getCodigoFornecedor());
            pstm.setString(3, cedto.getDataCompra());
            pstm.setString(4, cedto.getNomeDoProduto());
            pstm.setString(5, cedto.getEmpresa());
            pstm.setInt(6, cedto.getQuantidade());
            pstm.setDouble(7, cedto.getCustoUnitario());
            pstm.setDouble(8, cedto.getValorCompraTotal());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CadastroEntradaDao" + e.getMessage());
        }
    }

    ArrayList<ControleEntradaDTO> lista = new ArrayList<>();

    public ArrayList<ControleEntradaDTO> pesquisarControleEntrada() {

        String sql = "select * from tbentrada";
        con = new ConexaoDAO().conectaBD();
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                ControleEntradaDTO objControleEntradaDTO = new ControleEntradaDTO();
                objControleEntradaDTO.setCodigoProduto(rs.getInt("codigoproduto"));
                objControleEntradaDTO.setCodigoFornecedor(rs.getInt("codigofornecedor"));
                objControleEntradaDTO.setCodigoEntrada(rs.getInt("codigoentrada"));
                objControleEntradaDTO.setDataCompra(rs.getString("datacompra"));
                objControleEntradaDTO.setNomeDoProduto(rs.getString("item"));
                objControleEntradaDTO.setEmpresa(rs.getString("empresa"));
                objControleEntradaDTO.setQuantidade(rs.getInt("quantidade"));
                objControleEntradaDTO.setCustoUnitario(rs.getDouble("custounitario"));
                objControleEntradaDTO.setValorCompraTotal(rs.getDouble("valorcompratotal"));

                lista.add(objControleEntradaDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Pesquisar Controle Entrada:" + e.getMessage());
        }
        return lista;
    }

    public void alterarControleEntrada(ControleEntradaDTO cedto) {
        String sql = "update tbentrada set datacompra = ?, item = ?, empresa = ?, quantidade = ?, custounitario = ?, valorcompratotal = ? , codigoproduto=?, codigofornecedor=? where codigoentrada = ? ";

        con = ConexaoDAO.conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, cedto.getDataCompra());
            pstm.setString(2, cedto.getNomeDoProduto());
            pstm.setString(3, cedto.getEmpresa());
            pstm.setInt(4, cedto.getQuantidade());
            pstm.setDouble(5, cedto.getCustoUnitario());
            pstm.setDouble(6, cedto.getValorCompraTotal());
            pstm.setInt(7, cedto.getCodigoProduto());
            pstm.setInt(8, cedto.getCodigoFornecedor());
            pstm.setInt(9, cedto.getCodigoEntrada());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ControleEntradaDao Alterar" + e.getMessage());
        }
    }

    public void excluirControleEntrada(ControleEntradaDTO cldto) {
        String sql = "delete from tbentrada where codigoentrada = ? ";

        con = ConexaoDAO.conectaBD();

        try {
            pstm = con.prepareStatement(sql);

            pstm.setInt(1, cldto.getCodigoEntrada());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ControleEntradaDao Excluir" + e.getMessage());
        }
    }
}
