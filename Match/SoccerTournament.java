package Match;

import java.util.*;

public class SoccerTournament {
    private Collection<Match> matches;
    private ArrayList<String> squadre;

    SoccerTournament(ArrayList<String> squadre, ArrayList<Match> matches) throws MatchException {

        for (Match m : matches) {
            if (!(m instanceof SoccerMatch)) {
                throw new MatchException("Non è istanza di SoccerMatch");
            }
            if (!(squadre.contains(m.get_nome1()))) {
                throw new MatchException("Input incorretto");
            }
            if (!(squadre.contains(m.get_nome2()))) {
                throw new MatchException("Input incorretto");
            }
        }

        this.matches = matches;
        this.squadre = squadre;
    }

    public int get_res(String squadra) {
        int res = 0;

        for (Match m : matches) {
            if (m.winner().equals(squadra)) {
                res += 3;
            }
            if (m.winner() == null) {
                res += 1;
            }
        }
        return res;
    }

}
