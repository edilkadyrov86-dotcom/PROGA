package lab1.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.SpecialMove;

public final class WaterGun extends SpecialMove{
    private Pokemon opp_;
    private Pokemon self_;

    public WaterGun(){
        super(Type.WATER, 40.0, 100.0);
    }

    @Override
    protected java.lang.String describe(){
        return "использует Water Gun";
    }
}
