import java.util.ArrayList;
import java.util.List;

public class Partie {
    private List<Jeu> jeux;

    public Partie(Jeu leJeu) {
        this.jeux = new ArrayList<Jeu>();
        for(int i=0; i < 10; i++){
            this.jeux.add(leJeu);
        }
        if (jeux.get(9).isSpare()){
            this.jeux.add(leJeu);
        }
    }

    public int calculeScore() {
        int score=0;
        for (int i=0; i<10; i++){
            Jeu jeuCourant = this.jeux.get(i);
            score += jeuCourant.getScoreJeu();
            if(jeuCourant.isSpare()){
                score += this.jeux.get(i+1).getLancer1();
            }
        }
        return score;
    }
}
