package models;

public class Cliente {
    
    private int id;
    private String nome;
    private String CPF;
    private String senha;
    private String email;
    private String telefone;

    public Cliente(String nome, String CPF, String senha, String email, String telefone) {
        this.nome = nome;
        this.CPF = CPF;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
    }

    public Cliente(int id, String nome, String CPF, String senha, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
