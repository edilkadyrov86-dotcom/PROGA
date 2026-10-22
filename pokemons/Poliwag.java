package lab1.pokemons;

import lab1.moves.Hypnosis;
import lab1.moves.Scald;
import lab1.moves.WaterGun;
import lab1.moves.HyperVoice;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Poliwag extends Pokemon{
    public Poliwag(){
        super("Ina", 1);
        this.addType(Type.WATER);
        this.setStats(40.0, 50.0, 40.0, 40.0, 40.0, 90.0);

        this.addMove(new Hypnosis());
        this.addMove(new Scald());
    }
}
