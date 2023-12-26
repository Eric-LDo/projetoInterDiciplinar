package model;

public class Funcionario extends Usuario{
    private String cargo;

    public Funcionario(String nome, String senha, String cpf, String cargo) {
        super(nome, senha, cpf);
        this.cargo = cargo;
        setId(1);
    }

    

    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public String toString() {
        
        return String.format("Nome %s\nCPF: %s \nCargo ocupado: %s"
        ,getNome()
        ,getCpf()
        ,getCargo()
        );
    }
    
}
