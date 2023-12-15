// this class allows me to keep moves, abilities, and a pokemons type to be used later//
package com.mycompany.pokemon;


public class PokemonInfo {
    
    
    class SingleAbility{
        
        PokemonListResults ability;
    }
    class SingleMove{
        PokemonListResults move;
        
    }
    class SingleType{
        PokemonListResults type;
    }
    
    SingleAbility[] abilities;
    SingleMove[] moves;
    SingleType[] types;
}
