package lab1.pokemons;

import lab1.moves.Hypnosis;
import lab1.moves.Scald;
import lab1.moves.WaterGun;
import lab1.moves.HyperVoice;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Politoed extends Pokemon{
    public Politoed(){
        super("Cecilia", 1);
        this.addType(Type.WATER);
        this.setStats(90.0, 75.0, 75.0, 90.0, 100.0, 70.0);

        this.addMove(new Hypnosis());
        this.addMove(new Scald());
        this.addMove(new WaterGun());
        this.addMove(new HyperVoice());
    }
}
