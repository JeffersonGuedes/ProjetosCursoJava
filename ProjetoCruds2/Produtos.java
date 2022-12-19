
public class Produtos extends Funcionarios {
    private String codigoProdutos;
    private String modelo;
    private String tamanho;
    private double valorDoModelo;

    public String getCodigoProdutos() {
        return codigoProdutos;
    }

    public void setCodigoProdutos(String codigoProdutos) {
        this.codigoProdutos = codigoProdutos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho.toLowerCase();
    }

    public double getValorDoModelo() {
        return valorDoModelo;
    }

    public void setValorDoModelo(double valorDoModelo) {
        this.valorDoModelo = valorDoModelo;
    }
    
}
