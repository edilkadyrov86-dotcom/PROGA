package lab1.pokemons;

import lab1.moves.Tailwhip;
import lab1.moves.QuickAttack;
import lab1.moves.Confide;
import lab1.moves.DreamEater;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Espeon extends Pokemon{
    public Espeon(){
        super("Raora", 23);
        this.addType(Type.NORMAL);
        this.setStats(65.0, 65.0, 60.0, 130.0, 95.0, 110.0);

        this.addMove(new Tailwhip());
        this.addMove(new QuickAttack());
        this.addMove(new Confide());
        this.addMove(new DreamEater());
    }
}
