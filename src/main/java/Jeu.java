public class Jeu {

    private Integer lancer1;
    private Integer lancer2;

    public Jeu(Integer lancer1, Integer lancer2) {
        this.lancer1 = lancer1;
        this.lancer2 = lancer2;
    }

    public Jeu(Integer lancer1) {
        this.lancer1 = lancer1;
    }

    public int getScoreJeu(){
        return this.lancer1+this.lancer2;

    }
    public boolean isSpare(){
        if(this.lancer1==5 && this.lancer2==5)
            return true;
        else {
            return false;
        }
    }

    public int getLancer1(){
        return this.lancer1;
    }
}
