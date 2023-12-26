package model;

public class Usuario  {
    private int id;
    private String nome;
    private String senha;
    private String cpf;
    // construtor
    public Usuario( String nome, String senha, String cpf) {
        
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;

    
    }
    public Usuario( int id, String nome, String senha, String cpf) {
        
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.id = id;

    
    }
    public Usuario(){

    }

    
    
    public void mostrar() {

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



    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    

}
