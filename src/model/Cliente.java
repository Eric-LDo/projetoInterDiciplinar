package model;

public class Cliente extends Usuario{
    private String email;
    private String telefone;
    private Endereco endereco;
    
    //construtores
    public Cliente(String nome, String senha, String cpf, String email, String telefone, Endereco endereco) {
        super(nome, senha, cpf);
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        setId(2);
    }
    
     

    
    public Cliente(){

    }
    //montar toString
    //metodos especificos 
    
    
    
   
    // getters e setters

    

    
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
    
    public Endereco getEndereco() {
        return endereco;
    }
    //

    public void setEndereco(String cidade, String rua, String bairro, int numeroCasa, String complemento ) {
        Endereco novoEndereco = new Endereco(cidade, rua, bairro, numeroCasa, complemento);
        this.endereco = novoEndereco;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Nome: %s\nCPF: %s\ne-mail: %s\nTelefone: %s Endereco: %s"
        ,getNome()
        ,getCpf()
        ,getEmail()
        ,getTelefone()
        ,getEndereco()
        );
    }
    

    
}
