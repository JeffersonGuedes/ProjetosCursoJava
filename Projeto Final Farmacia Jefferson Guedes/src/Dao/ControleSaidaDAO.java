package Dao;

import Dto.ControleSaidaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControleSaidaDAO {

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;

    public void cadastroSaidadao(ControleSaidaDTO csdto) {
        String sql = "insert into tbsaida (codigoproduto, codigoloja, datavenda, item, loja, quantidadevendida, preçounitario, valorvendatotal) values (?, ?, ?, ?, ?, ?, ?, ?)";
        con = ConexaoDAO.conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, csdto.getCodigoProduto());
            pstm.setInt(2, csdto.getCodigoLoja());
            pstm.setString(3, csdto.getDataVenda());
            pstm.setString(4, csdto.getNomeDoProduto());
            pstm.setString(5, csdto.getLoja());
            pstm.setInt(6, csdto.getQuantidadeVendida());
            pstm.setDouble(7, csdto.getPrecoUnitario());
            pstm.setDouble(8, csdto.getValorVendaTotal());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CadastroVendaDao" + e.getMessage());
        }
    }

    ArrayList<ControleSaidaDTO> lista = new ArrayList<>();

    public ArrayList<ControleSaidaDTO> pesquisarControleSaida() {

        String sql = "select * from tbsaida";
        con = new ConexaoDAO().conectaBD();
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                ControleSaidaDTO objControleSaidaDTO = new ControleSaidaDTO();
                objControleSaidaDTO.setCodigoProduto(rs.getInt("codigoproduto"));
                objControleSaidaDTO.setCodigoLoja(rs.getInt("codigoloja"));
                objControleSaidaDTO.setCodigoSaida(rs.getInt("codigosaida"));
                objControleSaidaDTO.setDataVenda(rs.getString("datavenda"));
                objControleSaidaDTO.setNomeDoProduto(rs.getString("item"));
                objControleSaidaDTO.setLoja(rs.getString("loja"));
                objControleSaidaDTO.setQuantidadeVendida(rs.getInt("quantidadevendida"));
                objControleSaidaDTO.setPrecoUnitario(rs.getDouble("preçounitario"));
                objControleSaidaDTO.setValorVendaTotal(rs.getDouble("valorvendatotal"));

                lista.add(objControleSaidaDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Pesquisar Controle Saida:" + e.getMessage());
        }
        return lista;
    }

    public void alterarControleSaida(ControleSaidaDTO cedto) {
        String sql = "update tbsaida set datavenda = ?, item = ?, loja = ?, quantidadevendida = ?, preçounitario = ?, valorvendatotal = ?, codigoproduto=?,  codigoloja=?  where codigosaida = ? ";

        con = ConexaoDAO.conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, cedto.getDataVenda());
            pstm.setString(2, cedto.getNomeDoProduto());
            pstm.setString(3, cedto.getLoja());
            pstm.setInt(4, cedto.getQuantidadeVendida());
            pstm.setDouble(5, cedto.getPrecoUnitario());
            pstm.setDouble(6, cedto.getValorVendaTotal());
            pstm.setInt(7, cedto.getCodigoProduto());
            pstm.setInt(8, cedto.getCodigoLoja());
            pstm.setInt(9, cedto.getCodigoSaida());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ControleSaidaDao Alterar" + e.getMessage());
        }
    }

    public void excluirControleSaida(ControleSaidaDTO cldto) {
        String sql = "delete from tbsaida where codigosaida = ? ";

        con = ConexaoDAO.conectaBD();

        try {
            pstm = con.prepareStatement(sql);

            pstm.setInt(1, cldto.getCodigoSaida());

            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ControleSaidaDao Excluir" + e.getMessage());
        }
    }
}
