package model;
import java.util.ArrayList;


public class Verificacao {
    
    public static int verificaClienteCadastrado(Cliente cliente,ArrayList<Cliente> usuarios, String nome, String senha){
        
            for (Cliente usuario : usuarios) {
                if(usuario.getNome().equals(nome) && usuario.getSenha().equals(senha)){    
                    return usuario.getId();

                }
            }
            return 0;
        
    }
    public static Cliente receberCliente(ArrayList<Cliente> usuarios,String nome, String senha) {
        
        for (Cliente cliente : usuarios) {
            if (cliente.getNome().equals(nome) && cliente.getSenha().equals(senha)) {
                return cliente;
                
            }
        }
        return null;
    }    
    public static int verificaFuncionarioCadastrado(ArrayList<Funcionario> usuarios, String nome, String senha){
        
            for (Funcionario usuario : usuarios) {
                if(usuario.getNome().equals(nome) && usuario.getSenha().equals(senha)){    
                    return usuario.getId();
                }
            }
            return 0;
        
    }
    
    
}
