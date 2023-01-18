package Match;

public class SoccerMatch extends Match {

    private int score1, score2;

    SoccerMatch(int score1, int score2, String nome1, String nome2) {
        super(nome1, nome2);
        this.score1 = score1;
        this.score2 = score2;
    }

    @Override
    String winner() {
        if (this.score1 > this.score2) {
            return super.get_nome1();
        } else if (this.score2 > this.score1) {
            return super.get_nome2();
        } else
            return null;
    }

}
