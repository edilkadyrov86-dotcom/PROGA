package lab1.pokemons;

import lab1.moves.Tailwhip;
import lab1.moves.QuickAttack;
import lab1.moves.Confide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Eevee extends Pokemon{
    public Eevee(){
        super("Korone", 27);
        this.addType(Type.NORMAL);
        this.setStats(55.0, 55.0, 50.0, 45.0, 65.0, 55.0);

        this.addMove(new Tailwhip());
        this.addMove(new QuickAttack());
        this.addMove(new Confide());
    }
}
