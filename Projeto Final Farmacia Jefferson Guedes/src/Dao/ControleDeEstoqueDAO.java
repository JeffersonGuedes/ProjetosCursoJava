package Dao;



import Dto.ControleDeEstoqueDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControleDeEstoqueDAO{

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    
 
            ArrayList<ControleDeEstoqueDTO> lista = new ArrayList<>();    
   public ArrayList<ControleDeEstoqueDTO> pesquisarControleEstoque() {
        String sql = "select * from tbestoque";
        con = new ConexaoDAO().conectaBD();
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                ControleDeEstoqueDTO objControledeestoqueDTO = new ControleDeEstoqueDTO();
               

                //CadastroProdutosDTO
                objControledeestoqueDTO.setCodigoProduto(rs.getInt("codigoproduto"));
                objControledeestoqueDTO.setEstoqueMinimo(rs.getInt("estoqueminimo"));
                objControledeestoqueDTO.setItem(rs.getString("item"));
                //ControleEntradaDTO
                objControledeestoqueDTO.setQuantidade(rs.getInt("quantidade"));
                //ControleSaidaDTO
                objControledeestoqueDTO.setQuantidadeVendida(rs.getInt("quantidadevendida"));
                lista.add(objControledeestoqueDTO);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Pesquisar Estoque:" + e.getMessage());
        }
        return lista;
    }
}
