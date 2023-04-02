package pokemon;

public class TreinadorPokemon {
    String nomeTreinador;
    Integer nivel = 0;
    
    void treinarPokemon(Pokémon nomePokemon, Pokémon getForca, Pokémon doce){
        nomePokemon.setForca(nomePokemon.getForca() * 1.1);
        nomePokemon.setDoce(nomePokemon.getDoce() + 10);
        nivel += 2;
    }
    
    void evoluirPokemon(Pokémon nomePokemon, String nomeEvolucao, Pokémon doce){
        if(nomePokemon.getDoce() >= 50){
            System.out.println(String.format("Pokémon %s evoluiu para %s", nomePokemon.getNomePokemon(), nomeEvolucao));
            nomePokemon.setNomePokemon(nomeEvolucao);
            nomePokemon.setDoce(nomePokemon.getDoce() - 50);
            nivel += 10;
        } else {
            System.out.println("Não foi possível realizar operação");
        }
        
    }
}
