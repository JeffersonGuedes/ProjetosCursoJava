
public class Clientes {
    private String codigoClientes;
    private String nome;
    private String cpf;
    private int idade;
    private String telefone;
    private String sexo;
    private String estado;
    private String cidade;
    private String turno;

    public String getCodigoClientes() {
        return codigoClientes;
    }

    public void setCodigoClientes(String codigoClientes) {
        this.codigoClientes = codigoClientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade.toLowerCase();
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno.toLowerCase();
    }

    
    
    
}
