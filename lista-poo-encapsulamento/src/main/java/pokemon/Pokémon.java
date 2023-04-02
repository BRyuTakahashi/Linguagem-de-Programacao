package pokemon;

public class Pokémon {
    private String nomePokemon;
    private String tipo;
    private Double forca;
    private Integer doce = 0;
    
    String getNomePokemon(){
        return nomePokemon;
    }
    
    void setNomePokemon(String nomePokemon){
        this.nomePokemon = nomePokemon;
    }
    
    String getTipo(){
        return tipo;
    }
    
    void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    Double getForca(){
        return forca;
    }
    
    void setForca(Double forca){
        this.forca = forca;
    }
    
    Integer getDoce(){
        return doce;
    }
    
    void setDoce(Integer doce){
        this.doce = doce;
    }
}
