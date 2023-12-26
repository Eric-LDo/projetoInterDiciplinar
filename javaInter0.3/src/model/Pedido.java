package model;

public class Pedido {
    private Cliente clente;
    private String produtoDoPedido;
    private double precoTotal;
    public Pedido(Cliente clente,String produtoDoPedido , double precoTotal) {
        this.clente = clente;
        this.produtoDoPedido = produtoDoPedido;
        this.precoTotal = precoTotal;
    }
    public String getProdutoDoPedido() {
        return produtoDoPedido;
    }
    public void setProdutoDoPedido(String produtoDoPedido) {
        this.produtoDoPedido = produtoDoPedido;
    }
    public double getPrecoTotal() {
        return precoTotal;
    }
    public void setPrecoTotal(double precoTootal) {
        this.precoTotal = precoTootal;
    }
    public Cliente getClente() {
        return clente;
    }
    public void setClente(Cliente clente) {
        this.clente = clente;
    }
    @Override
    public String toString() {
        return String.format(" -------------------------------\n        %s      \n-------------------------------\n -------------------------------\n        %s      \n-------------------------------\n Valor total do pedido: %.2f " , getClente(),getProdutoDoPedido(), getPrecoTotal());
    }

}
