package model;

public class Endereco {
    private String cidade;
    private String rua;
    private String bairro;
    private int numeroCasa;
    private String complemento;
    //construtor
    public Endereco(String cidade, String rua, String bairro, int numeroCasa, String complemento) {
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
        this.numeroCasa = numeroCasa;
        if(this.complemento != null){
            this.complemento = complemento;
        }else{
            this.complemento = "Não há complemento";
        }
        
    }
    public Endereco(){
        
    }
    //metodos especificos
    @Override
    public String toString() {
        String endereco = String.format("Cidade: %s \nBairro: %s \nRua: %s \nNumero: %d \nComplemento: %s",
        cidade,
        bairro,
        rua,
        numeroCasa,
        complemento);
        return endereco;
    }
    //Getter and Setters
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public int getNumeroCasa() {
        return numeroCasa;
    }
    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    


    
    
}
