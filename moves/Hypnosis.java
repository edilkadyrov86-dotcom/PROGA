package lab1.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Status;

public final class Hypnosis extends StatusMove{
    private Pokemon opp_;
    private Pokemon self_;

    public Hypnosis(){
        super(Type.PSYCHIC, 0.0, 60.0);
    }

    @Override
    protected void applyOppEffects(Pokemon Opp){
        Opp.setCondition(new Effect().condition(Status.SLEEP));
        this.opp_ = Opp;
    }
    protected java.lang.String describe(){
        return ("использует Hypnosis");
    }
}
