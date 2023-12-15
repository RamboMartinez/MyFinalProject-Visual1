// this class was able to get the name of each pokemon//
// Made it easier to keep the main code in a seperate file//


package com.mycompany.pokemon;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PokemonSearchResults {
    
    String name;
    PokemonListResults[] results;
    
  
    
    
    public String getName(int index) throws FileNotFoundException {
       Gson gson = new Gson();

                                                                                                
       File f = new File(getClass().getResource("/pokemonlist.json").getFile());       //Creates a new file with all of the pokemon info//
       FileReader fr = new FileReader(f);                                                     //Creates a file reader to read the previous Dile//
       PokemonSearchResults psr = gson.fromJson(fr, PokemonSearchResults.class);       //Pars the info needed from the file into psr//

       name = psr.results[index].name;                           //This allows the name to stored depending on the index (pokemon num)//
       return name;                                               //This returns the name so that it can be called in a seperate class//
    }    
}
   
