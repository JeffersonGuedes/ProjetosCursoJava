package Dto;

public class ControleDeEstoqueDTO extends ControleSaidaDTO {
        CadastroProdutosDTO objcpldto = new CadastroProdutosDTO();
        CadastroFornecedorDTO objcfldto = new CadastroFornecedorDTO();
        CadastroLojaDTO objcldto = new CadastroLojaDTO();
        ControleEntradaDTO objcedto = new ControleEntradaDTO();
        ControleSaidaDTO objcsdto = new ControleSaidaDTO();
    
    public void Controle() {
        
        
        

        //CadastroProdutosDTO
        objcpldto.getCodigoProduto();
        objcpldto.getCustoUnitario();
        objcpldto.getEstoqueMinimo();
        objcpldto.getItem();
        objcpldto.getPrecoUnitario();
        objcpldto.getUnidadeDeMedida();
        //CadastroFornecedorDTO
        objcfldto.getCodigoFornecedor();
        objcfldto.getEmail();
        objcfldto.getEmpresa();
        objcfldto.getEndereco();
        objcfldto.getTelefone();
        objcfldto.getTotalComprado();
        //CadastroLojaDTO
        objcldto.getCodigoLoja();
        objcldto.getEmail();
        objcldto.getEndereco();
        objcldto.getLoja();
        objcldto.getTelefone();
        objcldto.getTotalVendido();
        //ControleEntradaDTO
        objcedto.getCodigoFornecedor();
        objcedto.getCodigoProduto();
        objcedto.getCustoUnitario();
        objcedto.getDataCompra();
        objcedto.getEmpresa();
        objcedto.getNomeDoProduto();
        objcedto.getQuantidade();
        objcedto.getValorCompraTotal();
        //ControleSaidaDTO
        objcsdto.getCodigoLoja();
        objcsdto.getCodigoProduto();
        objcsdto.getDataVenda();
        objcsdto.getLoja();
        objcsdto.getNomeDoProduto();
        objcsdto.getPrecoUnitario();
        objcsdto.getQuantidadeVendida();
        objcsdto.getValorVendaTotal();
    }
}
