package lab1.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Stat;

public final class Confide extends StatusMove{
    public Confide(){
        super(Type.NORMAL, 40.0, 100.0, 1, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon Opp){
        Opp.setCondition(new Effect().stat(Stat.DEFENSE, (int)(Opp.getStat(Stat.SPECIAL_ATTACK)*0.67)));
    }
    protected java.lang.String describe(){
        return ("использует Confide");
    }
}
