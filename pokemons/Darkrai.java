package lab1.pokemons;

import lab1.moves.ShadowBall;
import lab1.moves.Thunderbolt;
import lab1.moves.PoisonJab;
import lab1.moves.WillOWisp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Darkrai extends Pokemon{
    public Darkrai(){
        super("Botan", 84);
        this.addType(Type.NORMAL);
        this.setStats(70.0, 90.0, 90.0, 135.0, 90.0, 125.0);

        this.addMove(new ShadowBall());
        this.addMove(new Thunderbolt());
        this.addMove(new PoisonJab());
        this.addMove(new WillOWisp());
    }
}
