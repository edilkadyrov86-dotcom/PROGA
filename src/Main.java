package lab1.src;
/*9834 variant */
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import lab1.pokemons.Poliwhirl;
import lab1.pokemons.Politoed;
import lab1.pokemons.Poliwag;
import lab1.pokemons.Eevee;
import lab1.pokemons.Espeon;
import lab1.pokemons.Darkrai;
import lab1.pokemons.Buffer;

class Main{
    public static void main(String args[]){

        Battle battlescene = new Battle();

        Poliwhirl Aqua = new Poliwhirl();
        Eevee Korone = new Eevee();
        Darkrai Botan = new Darkrai();
        Poliwag Ina = new Poliwag();
        Politoed Cecilia = new Politoed();
        Espeon Raora = new Espeon();
        Pokemon[] team = {Ina, Cecilia, Raora};
        Buffer Bobo = new Buffer(team);

        battlescene.addAlly(Aqua);
        battlescene.addAlly(Korone);
        battlescene.addAlly(Botan);
        battlescene.addFoe(Bobo);
        battlescene.addFoe(Raora);
        battlescene.addFoe(Cecilia);
        battlescene.addFoe(Ina);

        battlescene.go();

    }
}
