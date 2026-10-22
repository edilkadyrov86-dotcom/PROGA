package lab1.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;

public final class QuickAttack extends PhysicalMove{
    private Pokemon opp_;
    private Pokemon self_;

    public QuickAttack(){
        super(Type.NORMAL, 40.0, 100.0, 1, 1);
    }

    @Override
    protected java.lang.String describe(){
        return "использует Quick Attack";
    }
}
