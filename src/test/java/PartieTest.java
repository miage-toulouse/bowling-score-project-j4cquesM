import org.junit.Test;

import static org.junit.Assert.*;

public class PartieTest {
    // On teste les cas normaux (=nominaux) d'abord puis les cas limites et les cas
    @Test
    public void testCalculeScoreSansStrikeSansSpare(){
        // given: une partie avec 10 jeux identiques faisant tomber 5 quilles par frame (tous les deux lancers).
        Jeu leJeu = new Jeu(5,0);
        Partie laPartie = new Partie(leJeu); // comme tous les jeux sont identiques, on peut choisir directement un jeu simple plutôt qu'une liste de jeux
        // when: on calcule le score
        int score = laPartie.calculeScore();
        // then: on obtient un score de 50
        assertEquals(50,score);

    }
    @Test
    public void testCalculeScoreQueDesSpares(){
        // given: une partie avec 10 jeux identiques faisant que des spares.
        Jeu leJeu = new Jeu(5,5);
        Partie laPartie = new Partie(leJeu); // comme tous les jeux sont identiques, on peut choisir directement un jeu simple plutôt qu'une liste de jeux
        // when: on calcule le score
        int score = laPartie.calculeScore();
        // then: on obtient un score de 150
        assertEquals(150,score);

    }

    @Test
    public void testCalculeScoreQueDesStrikes(){
        // given: une partie avec 10 jeux identiques faisant que des spares.
        Jeu leJeu = new Jeu(10);
        Partie laPartie = new Partie(leJeu);
        // when: on calcule le score
        int score = laPartie.calculeScore();
        // then: on obtient un score de 150
        assertEquals(300,score);

    }

}