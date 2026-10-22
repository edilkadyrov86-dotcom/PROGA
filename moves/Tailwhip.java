package lab1.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Stat;

public final class Tailwhip extends StatusMove{
    private Pokemon opp_;
    private Pokemon self_;

    public Tailwhip(){
        super(Type.NORMAL, 0.0, 100.0);
    }

    @Override
    protected void applyOppEffects(Pokemon Opp){
        Opp.setCondition(new Effect().stat(Stat.DEFENSE, (int)(Opp.getStat(Stat.DEFENSE)*0.67)));
        this.opp_ = Opp;
    }
    protected java.lang.String describe(){
        return ("использует Tail Whip");
    }
}
