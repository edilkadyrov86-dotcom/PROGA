package lab1.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Status;

public final class HyperVoice extends SpecialMove{
    private Pokemon opp_;
    private Pokemon self_;

    public HyperVoice(){
        super(Type.NORMAL, 90.0, 100.0);
    }

    @Override
    protected java.lang.String describe(){
        return "использует Hyper Voice";
    }
}
