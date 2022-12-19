
package Dto;


public class CadastroLojaDTO extends CadastroFornecedorDTO {
    private String loja;
    private String telefone;
    private String email;
    private String endereco;
    private int codigoLoja;
    private Double totalVendido;

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCodigoLoja() {
        return codigoLoja;
    }

    public void setCodigoLoja(int codigoLoja) {
        this.codigoLoja = codigoLoja;
    }

    public Double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(Double totalVendido) {
        this.totalVendido = totalVendido;
    }
    
    
}
