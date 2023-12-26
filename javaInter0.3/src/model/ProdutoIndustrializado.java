package model;
public class ProdutoIndustrializado extends Produto {
    private String validade;
    

    public ProdutoIndustrializado(int id, String nomeProduto, double precoVenda, String validade) {
        super(id, nomeProduto, precoVenda);
        this.validade = validade;
    }



  

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    

    
    public String toString(){
        return String.format(" Produto %d: %s \n-------------------------------------------------------------\n Validade: %s\n Preço: %s\n------------------------------------------------------------- \n\n", getId() , getNomeProduto(), getValidade(), getPrecoVenda());
        
    }
}
