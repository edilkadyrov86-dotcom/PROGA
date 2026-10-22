package lab1.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Status;

public final class Scald extends StatusMove{
    private Pokemon opp_;
    private Pokemon self_;

    public Scald(){
        super(Type.WATER, 80.0, 100.0);
    }

    @Override
    protected void applyOppEffects(Pokemon Opp){
        Opp.setCondition(new Effect().chance(0.3).condition(Status.BURN));
        this.opp_ = Opp;
    }
    protected java.lang.String describe(){
        return ("использует Scald");
    }
}
