package model;
import java.util.Scanner;

public class ProdutoPreparado extends Produto {
    private String ingredientes;
    private String tempoPreparo;
    private String descricao;

    Scanner e = new Scanner(System.in);

    int opcao = 0;

    

    public ProdutoPreparado(int id, String nomeProduto, double precoVenda, String descricao, String ingredientes, String tempoPreparo) {
        super(id, nomeProduto, precoVenda);
        this.descricao = descricao;
        this.ingredientes = ingredientes;
        this.tempoPreparo = tempoPreparo;
        
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(String tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

   

    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString(){
       return String.format("Produto %d: %s \n-------------------------------------------------------------\nIngredientes: %s\n Descricao: %s\n Tempo de Preparo: %s\n Preço: %s\n------------------------------------------------------------- \n\n" , getId(), getNomeProduto(), getIngredientes(), getDescricao(), getTempoPreparo(),getPrecoVenda());
    }

    
    
    
}
