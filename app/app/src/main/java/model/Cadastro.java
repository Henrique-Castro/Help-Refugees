package model;

public class Cadastro {
    private String nome;
    private String senha;
    private String email;
    private String confirmar;
    private String estado;
    private String cidade;
    private String rg;
    private String nascimento;
    private String sexo;
    private String celular;
    private String telefone;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getConfirmar() {

        return confirmar;
    }

    public void setConfirmar(String confirmar) {

        this.confirmar = confirmar;
    }

    public String getEstado() {

        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {

        this.cidade = cidade;
    }

    public void setEstado(String estado) {

        this.estado = estado;
    }

    public Cadastro(String senha, String nome, String email, String confirmar, String estado, String cidade) {
        this.senha = senha;
        this.nome = nome;
        this.email = email;
        this.confirmar = confirmar;
        this.estado = estado;
        this.cidade = cidade;
    }
    
    public Cadastro(){
        this("","","","","","");
    }
}
