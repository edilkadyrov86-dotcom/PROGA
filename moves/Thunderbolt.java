    package lab1.moves;

    import ru.ifmo.se.pokemon.Pokemon;
    import ru.ifmo.se.pokemon.Type;
    import ru.ifmo.se.pokemon.StatusMove;
    import ru.ifmo.se.pokemon.Effect;
    import ru.ifmo.se.pokemon.Status;
    import ru.ifmo.se.pokemon.Stat;

    public final class Thunderbolt extends StatusMove{
        private Pokemon opp_;
        private Pokemon self_;

        public Thunderbolt(){
            super(Type.ELECTRIC, 90.0, 100.0);
        }

        @Override
        protected void applyOppEffects(Pokemon Opp){
            Opp.setCondition(new Effect().chance(0.1).condition(Status.PARALYZE));
            this.opp_ = Opp;
        }
        protected java.lang.String describe(){
            return ("использует Thunderbolt");
        }
    }
