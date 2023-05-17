package pokemon;

public class TestePokemon {
    public static void main(String[] args) {
        TreinadorPokemon treinador = new TreinadorPokemon();
        TreinadorPokemon treinador2 = new TreinadorPokemon();
        
        Pokémon pokemon1 = new Pokémon();
        Pokémon pokemon2 = new Pokémon();
        Pokémon pokemon3 = new Pokémon();
        Pokémon pokemon4 = new Pokémon();
        Pokémon pokemon5 = new Pokémon();
        
        treinador2.nomeTreinador = "Satoshi";
        
        pokemon5.setNomePokemon("Chikorita");
        pokemon5.setForca(120.50);
        pokemon5.setTipo("Planta");
        
        System.out.println(pokemon5.getForca());
        
        treinador2.treinarPokemon(pokemon5, pokemon5, pokemon5);
        
        System.out.println(pokemon5.getForca());
        treinador2.treinarPokemon(pokemon5, pokemon5, pokemon5);
        treinador2.treinarPokemon(pokemon5, pokemon5, pokemon5);
        treinador2.treinarPokemon(pokemon5, pokemon5, pokemon5);
        treinador2.treinarPokemon(pokemon5, pokemon5, pokemon5);        

        
        treinador2.evoluirPokemon(pokemon5, "Bayleaf", pokemon5);
        
        
//        pokemon1.setNomePokemon("Piplup");
//        pokemon1.setTipo("Água");
//        pokemon1.setForca(10.0);
//        
//        pokemon2.setNomePokemon("Magikarp");
//        pokemon2.setTipo("Água");
//        pokemon2.setForca(0.0);
//        
//        pokemon3.setNomePokemon("Charmander");
//        pokemon3.setTipo("Fogo");
//        pokemon3.setForca(300.0);
//        
//        pokemon4.setNomePokemon("Pikachu");
//        pokemon4.setTipo("Elétrico");
//        pokemon4.setForca(500.0);
//        
//        treinador.nomeTreinador = "Red";;
        
//        treinador.treinarPokemon(pokemon4, pokemon4, pokemon4);
//        treinador.treinarPokemon(pokemon4, pokemon4, pokemon4);
//        treinador.treinarPokemon(pokemon4, pokemon4, pokemon4);
//        treinador.treinarPokemon(pokemon4, pokemon4, pokemon4);
//        treinador.treinarPokemon(pokemon4, pokemon4, pokemon4);
//        treinador.treinarPokemon(pokemon4, pokemon4, pokemon4);
//        
//        System.out.println(pokemon4.getDoce());
//        
//        treinador.evoluirPokemon(pokemon4, "Raichu", pokemon4);
//        System.out.println(pokemon4.getForca());
//        System.out.println(pokemon4.getDoce());
//        
//        treinador.treinarPokemon(pokemon4, pokemon4, pokemon4);
//        treinador.treinarPokemon(pokemon4, pokemon4, pokemon4);
//        treinador.treinarPokemon(pokemon4, pokemon4, pokemon4);
//        treinador.treinarPokemon(pokemon4, pokemon4, pokemon4);
//        treinador.evoluirPokemon(pokemon4, "Mega Raichu", pokemon4);
        
        
//        treinador.treinarPokemon(pokemon3, pokemon3, pokemon3);
//        treinador.treinarPokemon(pokemon3, pokemon3, pokemon3);
//        treinador.treinarPokemon(pokemon3, pokemon3, pokemon3);
//        treinador.treinarPokemon(pokemon3, pokemon3, pokemon3);
//        treinador.treinarPokemon(pokemon3, pokemon3, pokemon3);
//        
//        treinador.evoluirPokemon(pokemon3, "Charmileon", pokemon3);
//        
//        treinador.treinarPokemon(pokemon3, pokemon3, pokemon3);
//        treinador.treinarPokemon(pokemon3, pokemon3, pokemon3);
//        treinador.treinarPokemon(pokemon3, pokemon3, pokemon3);
//        treinador.treinarPokemon(pokemon3, pokemon3, pokemon3);
//        treinador.treinarPokemon(pokemon3, pokemon3, pokemon3);
//        treinador.evoluirPokemon(pokemon3, "Charizard", pokemon3);
        
        
        
//        treinador.treinarPokemon(pokemon1, pokemon1, pokemon1);
//        treinador.treinarPokemon(pokemon1, pokemon1, pokemon1);
//        treinador.treinarPokemon(pokemon1, pokemon1, pokemon1);
//        treinador.treinarPokemon(pokemon1, pokemon1, pokemon1);
//        treinador.treinarPokemon(pokemon1, pokemon1, pokemon1);
//        
//        System.out.println(pokemon1.getNomePokemon());
//        System.out.println(pokemon1.getTipo());
//        System.out.println(pokemon1.getForca());
//        System.out.println(pokemon1.getDoce());
//        
//        treinador.evoluirPokemon(pokemon1, "Prinplup", pokemon1);
//        
//        System.out.println(pokemon1.getNomePokemon());
//        System.out.println(pokemon1.getTipo());
//        System.out.println(pokemon1.getForca());
//        System.out.println(pokemon1.getDoce());
//        
//        treinador.treinarPokemon(pokemon2, pokemon2, pokemon2);
//        treinador.treinarPokemon(pokemon2, pokemon2, pokemon2);
//        
//        System.out.println(pokemon2.getNomePokemon());
//        System.out.println(pokemon2.getTipo());
//        System.out.println(pokemon2.getForca());
//        System.out.println(pokemon2.getDoce());
//        
//        treinador.evoluirPokemon(pokemon2, "Gyarados", pokemon2);
//        
//        System.out.println(treinador.nomeTreinador);
//        System.out.println(treinador.nivel);
    }
}
