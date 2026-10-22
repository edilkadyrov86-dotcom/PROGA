package lab1.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Stat;

public final class DreamEater extends StatusMove{
    private Pokemon opp_;
    private Pokemon self_;

    public DreamEater(){
        super(Type.PSYCHIC, 100.0, 100.0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return def.getCondition() == Status.SLEEP;
    }
    protected void applySelfEffects(Pokemon Self){
        Self.setCondition(new Effect().stat(Stat.HP, (int)Self.getStat(Stat.HP)+50));
        this.self_ = Self;
    }
    protected java.lang.String describe(){
        return ("использует Dream Eater");
    }
}
