
package Dto;


public class ControleSaidaDTO extends ControleEntradaDTO {
    private int codigoSaida;
    private int codigoProduto;
    private int codigoLoja;
    private String dataVenda;
    private String nomeDoProduto;
    private String loja;
    private int quantidadeVendida;
    private Double valorVendaTotal;
    private Double precoUnitario;

    public int getCodigoSaida() {
        return codigoSaida;
    }

    public void setCodigoSaida(int codigoSaida) {
        this.codigoSaida = codigoSaida;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getCodigoLoja() {
        return codigoLoja;
    }

    public void setCodigoLoja(int codigoLoja) {
        this.codigoLoja = codigoLoja;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public Double getValorVendaTotal() {
        return valorVendaTotal;
    }

    public void setValorVendaTotal(Double valorVendaTotal) {
        this.valorVendaTotal = valorVendaTotal;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

   
}
