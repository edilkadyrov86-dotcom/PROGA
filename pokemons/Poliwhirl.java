package lab1.pokemons;

import lab1.moves.Hypnosis;
import lab1.moves.Scald;
import lab1.moves.WaterGun;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Poliwhirl extends Pokemon{
    public Poliwhirl(){
        super("Aqua", 1);
        this.addType(Type.WATER);
        this.setStats(65.0, 65.0, 65.0, 50.0, 50.0, 90.0);

        this.addMove(new Hypnosis());
        this.addMove(new Scald());
        this.addMove(new WaterGun());
    }
}
