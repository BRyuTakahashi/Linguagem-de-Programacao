package carros;

public class Carro {
    private String modelo;
    private Double valor;
    private Integer ano;
    private String marca;
    
    public Carro(String modelo, Double valor, Integer ano, String marca){
        this.modelo = modelo;
        this.valor = valor;
        this.ano = ano;
        this.marca = marca;
    }
    
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    String getModelo(){
        return modelo;
    }
    
    void setValor(Double valor){
        this.valor = valor;
    }
    
    Double getValor(){
        return valor;
    }
    
    void setAno(Integer ano){
        this.ano = ano;
    }
    
    Integer getAno(){
        return ano;
    }
    
    @Override public String toString(){
        return String.format("Modelo: %s\nValor: %.2f\nAno: %d\nMarca: %s", modelo, valor, ano, marca);
    }
}
