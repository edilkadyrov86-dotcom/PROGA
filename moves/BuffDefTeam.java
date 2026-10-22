package lab1.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Type;

public final class BuffDefTeam extends StatusMove{
    private Pokemon[] team_ = new Pokemon[3];

    public BuffDefTeam(Pokemon[] team){
        super(Type.ELECTRIC, 0.0, 100.0);
        this.team_ = team;
    }
        @Override protected void applySelfEffects(Pokemon p){
            for(Pokemon a : this.team_){
                a.addEffect(new Effect().stat(Stat.DEFENSE, (int)(a.getStat(Stat.DEFENSE)*1.1)));
            }
        }
        protected java.lang.String describe(){
            return "использует Buff Defense";
        }
}
