package lab1.pokemons;

import lab1.moves.BuffAtkTeam;
import lab1.moves.BuffDefTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Buffer extends Pokemon{
    public Buffer(Pokemon[] team){
        super("Bobo", 10);
        this.addType(Type.ELECTRIC);
        this.setStats(70.0, 90.0, 90.0, 50.0, 70.0, 100.0);

        this.addMove(new BuffAtkTeam(team));
        this.addMove(new BuffDefTeam(team));
    }
}
