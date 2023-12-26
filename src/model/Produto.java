package model;


public class Produto {
    private int id;
    private String nomeProduto;
    private double precoVenda;
    

  

    

    public Produto( int id, String nomeProduto, double precoVenda) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.precoVenda = precoVenda;
        
        
    }
    public Produto( String nomeProduto) {
        this.id++;
        this.nomeProduto = nomeProduto;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public double getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    @Override
    public String toString() {
        return String.format("%s - %.2f",getNomeProduto(), getPrecoVenda());
    }

    

    
    
    
}
