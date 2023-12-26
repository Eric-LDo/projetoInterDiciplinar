import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class CoordenadorExecucao {
    public Scanner scan = new Scanner(System.in);
    
    public Endereco enderecos = new Endereco(null, null, null, 0,null);
    public Cliente clienteCadastrado = new Cliente(null, null, null,null, null, enderecos);
    public Cliente clienteLogado = new Cliente();
    public Cliente pedindo = new Cliente();
    public ArrayList<Usuario> user = new ArrayList<>();
    public ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    public ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    public ArrayList<ProdutoPreparado> preparados = new ArrayList<>();
    public ArrayList<ProdutoIndustrializado> industrializados = new ArrayList<>();
    public ArrayList<Produto> produtos = new ArrayList<>();
    public ArrayList<Produto> produtosDosPedidos = new ArrayList<>();
    public ArrayList<Pedido> pedidos = new ArrayList<>();
    
   
    public void executaTudo(){
            boolean verif = false;
            Cliente clienteFantasma = new Cliente("nome" , "senha", "null", "null", "null", null);
            Funcionario func = new Funcionario("funcionario", "senhadois", "null", "null");
            funcionarios.add(func);
            clientes.add(clienteFantasma);
            
            
            do {
                  
                  System.out.println("menu de entrada");
                  System.out.println("ESCOLHA:");
                  System.out.println("Opção 1 - Logar-se");
                  System.out.println("Opção 2 - Cadastrar-se.");
                  
                  int opcao = scan.nextInt();
                  scan.nextLine();
                  
                  
                  
                  if (opcao == 1){
                    int login =telaLogin();
                       if(login == 2){

                        System.out.println("Login Cliente");
                        clienteLogado();
                        verif = true;
                       }if(login == 1){
                        System.out.println("Login Funcionario");
                        funcLogado();
                        verif=true;
                    }if(login==0){
                        System.out.println("Usuario ou senha invalidos");                       
                        verif=true;
                    }
                    
                    
                        
                        
                       
                        
                        
                  }if (opcao == 2){
                        cadastrar();
                        System.out.println("Cadastro realizado com sucesso! gostaria de realizar o login?(s/n)");
                        String resposta = scan.nextLine();
                        resposta.toLowerCase();
                        if(resposta.equals("n")||resposta.equals("não")||resposta.equals("nao") ){
                              verif = false;
                        }else{
                              verif= true;

                        }
                  }
                  
            } while (verif);
      
       
      }
      
    

    public void cadastrar() {
        boolean ttrue = false;
        String senha;
        String confSenha;
        

        System.out.println("Digite seu nome:");
        String nome = scan.nextLine();
        clienteCadastrado.setNome(nome);
        do { 
            System.out.println("Digite uma senha:");
            senha = scan.nextLine();
            clienteCadastrado.setSenha(senha);  
                 
            System.out.println("Confirme a senha:");
            confSenha = scan.nextLine();
            if(senha.equals(confSenha)){
                ttrue = true;
            } else{
                System.out.println("As senhas nao conferem!");
            }

        } while (!ttrue);
        System.out.println("Digite seu CPF:");
        String cpf = scan.nextLine();
        clienteCadastrado.setCpf(cpf);

        System.out.println("Digite seu e-mail:");
        String email = scan.nextLine();
        clienteCadastrado.setEmail(email);
        System.out.println("Digite seu telefone:");
        String telefone = scan.nextLine();
        clienteCadastrado.setTelefone(telefone);
        System.out.println("-----Endereço-------");
        System.out.println("Digite o nome da sua Cidade:");
        String cidade = scan.nextLine();
        enderecos.setCidade(cidade);
        System.out.println("Digite o nome do seu Bairro:");
        String bairro = scan.nextLine();
        enderecos.setBairro(bairro);
        System.out.println("Digite o nome da sua rua:");
        String rua = scan.nextLine();
        enderecos.setRua(rua);
        System.out.println("Digite numero da sua casa:");
        int nuCasa = scan.nextInt();
        enderecos.setNumeroCasa(nuCasa);
        scan.nextLine();
        System.out.println("Digite existe algum complemento que gostaria de acrecentar?");
        String complemento = scan.nextLine();
        enderecos.setComplemento(complemento);
        clientes.add(clienteCadastrado);
        user.addAll(clientes);
        
        
        
        

        
           
    }
    
 
    public int telaLogin(){

       
       
        System.out.println("-----------------------");
        System.out.println("|                      |");
        System.out.println("|   LOGIN DE USUARIO   |");
        System.out.println("|                      |");
        System.out.println("-----------------------");
        System.out.print("Digite o usuario: ");
        String users = scan.nextLine();
        System.out.print("Digite a senha: ");
        String pass = scan.nextLine();
        
        if( Verificacao.verificaClienteCadastrado(clienteLogado, clientes,users, pass ) == 2){
            pedindo = Verificacao.receberCliente( clientes,users, pass );
            return Verificacao.verificaClienteCadastrado( clienteLogado,clientes,users, pass );
            
        }if(Verificacao.verificaFuncionarioCadastrado( funcionarios,users, pass )==1){
            return Verificacao.verificaFuncionarioCadastrado( funcionarios,users, pass ); 
        }
        
      return 0;
    }
    
    
    public void cardapio(){
        ProdutoPreparado produto1 = new ProdutoPreparado(1,"Feijoada", 45.90,"Temperada, com bastante carne de porco com uma porção de arroz", "Feijão, partes de porco, arroz, linguiça toscana", "Em media de meia hora"  );
        preparados.add(produto1);


        ProdutoPreparado produto2 = new ProdutoPreparado(2,"Bife a parmejiana",39.90, "Contra filé a parmejiana e uma porção de arroz", "Contra filé, molho de tomate e arroz", "Em media 20min"   );
        preparados.add(produto2);
        

        ProdutoPreparado produto3 = new ProdutoPreparado(3, "X-Salada",14.90, "Lanche feito com os melhores ingredientes", "Pão, alface, tomate, hamburger, presunto, mussarela e molho", "em média 10 min" );
        preparados.add(produto3);

        ProdutoIndustrializado produto4 = new ProdutoIndustrializado(4,"Coca-cola 2l", 11.75, "12/03/2024");
        industrializados.add(produto4);
        

        ProdutoIndustrializado produto5 = new ProdutoIndustrializado(5,"Coca-cola lata", 5.50,"12/03/2024" );
        industrializados.add(produto5);
    }
    
   

    private void clienteLogado() {
        cardapio();
        String stringPedido;
        int fimDoLoop=0;
        double totalPreco = 0;
        produtos.addAll(industrializados);
        produtos.addAll(preparados);
        do{ 
            
            System.out.println("-------------------------------------------------------------");
            System.out.println("|               Mostrando os Itens no cardapio              |");
            System.out.println("-------------------------------------------------------------");
            System.out.println("|                     Escolha um Produto                    |");
            System.out.println("-------------------------------------------------------------");
            for (ProdutoPreparado preparados : preparados) {
                System.out.println(preparados);   
            }
            for (ProdutoIndustrializado industrializado : industrializados) {
                System.out.println(industrializado);
            }
            System.out.println("-------------------------------------------------------------");
            System.out.println("|                     Escolha um Produto                    |");
            System.out.println("-------------------------------------------------------------");
            int escolha = scan.nextInt();
            scan.nextLine();
            for (Produto produtos : produtos) {
                if(escolha == produtos.getId()){
                    produtosDosPedidos.add(produtos);
                    totalPreco = totalPreco + produtos.getPrecoVenda();
                }
            }

            System.out.println(produtosDosPedidos);
            
            System.out.println("Quer pedir mais alguma coisa?");
            System.out.println("1-Sim");
            System.out.println("2-Não");
            fimDoLoop = scan.nextInt();
            scan.nextLine();

        }while(fimDoLoop == 1);
        stringPedido = produtosDosPedidos.toString();
        System.out.println("-------------------------------------------------------------");
        System.out.println("|               PEDIDO REALIZADO COM SUCESSO                |");
        System.out.println("-------------------------------------------------------------");
        Pedido pedido = new Pedido(pedindo, stringPedido, totalPreco );
        pedidos.add(pedido);
        

        
            

        
    }

    private void funcLogado() {
        System.out.println(pedidos);
        
    }

    
    
      
    
      
      

      
    
    



  
}

    