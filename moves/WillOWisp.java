    package lab1.moves;

    import ru.ifmo.se.pokemon.Pokemon;
    import ru.ifmo.se.pokemon.Type;
    import ru.ifmo.se.pokemon.StatusMove;
    import ru.ifmo.se.pokemon.Effect;
    import ru.ifmo.se.pokemon.Status;
    import ru.ifmo.se.pokemon.Stat;
    import java.lang.String;

    public final class WillOWisp extends StatusMove{
        private Pokemon opp_;
        private Pokemon self_;

        public WillOWisp(){
            super(Type.FIRE, 0.0, 85.0);
        }
        @Override
        protected void applyOppEffects(Pokemon Opp){
            Opp.setCondition(new Effect().condition(Status.BURN));
            this.opp_ = Opp;
        }
        protected String describe(){
            return ("использует Will-O-Wisp");
        }
    }
