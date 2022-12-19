
package Dto;


public class ControleEntradaDTO extends CadastroLojaDTO {
    private int codigoEntrada;
    private int codigoProduto;
    private int codigoFornecedor;
    private String dataCompra;
    private String nomeDoProduto;
    private String empresa;
    private int quantidade;
    private Double valorCompraTotal;
    private Double custoUnitario;

    public int getCodigoEntrada() {
        return codigoEntrada;
    }

    public void setCodigoEntrada(int codigoEntrada) {
        this.codigoEntrada = codigoEntrada;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(int codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorCompraTotal() {
        return valorCompraTotal;
    }

    public void setValorCompraTotal(Double valorCompraTotal) {
        this.valorCompraTotal = valorCompraTotal;
    }

    public Double getCustoUnitario() {
        return custoUnitario;
    }

    public void setCustoUnitario(Double custoUnitario) {
        this.custoUnitario = custoUnitario;
    }

    
}
