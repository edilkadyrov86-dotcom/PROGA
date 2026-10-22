package lab1.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Stat;

public final class ShadowBall extends StatusMove{
    private Pokemon opp_;
    private Pokemon self_;

    public ShadowBall(){
        super(Type.GHOST, 80.0, 100.0);
    }

    @Override
    protected void applyOppEffects(Pokemon Opp){
        Opp.setCondition(new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, (int)(Opp.getStat(Stat.SPECIAL_DEFENSE)*0.67)));
        this.opp_ = Opp;
    }
    protected java.lang.String describe(){
        return ("использует Shadow Ball");
    }
}
