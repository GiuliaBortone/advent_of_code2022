import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayTests {
    String enemyRock = "A";
    String enemyPaper = "B";
    String enemyScissors = "C";
    String lose = "X";
    String draw = "Y";
    String win = "Z";

    @Test
    void enemyRockMyLossEnemyShouldWin() {
        Play play = new Play(enemyRock, lose);

        assertEquals("enemy", play.getPlayWinner());
    }

    @Test
    void enemyRockMyDrawShouldDraw() {
        Play play = new Play(enemyRock, draw);

        assertEquals("draw", play.getPlayWinner());
    }

    @Test
    void enemyRockMyWinMeShouldWin() {
        Play play = new Play(enemyRock, win);

        assertEquals("me", play.getPlayWinner());
    }

    @Test
    void enemyPaperMyDrawShouldDraw() {
        Play play = new Play(enemyPaper, draw);

        assertEquals("draw", play.getPlayWinner());
    }

    @Test
    void enemyPaperMyWinMeShouldWin() {
        Play play = new Play(enemyPaper, win);

        assertEquals("me", play.getPlayWinner());
    }

    @Test
    void enemyPaperMyLossEnemyShouldWin() {
        Play play = new Play(enemyPaper, lose);

        assertEquals("enemy", play.getPlayWinner());
    }

    @Test
    void enemyScissorsMyWinMeShouldWin() {
        Play play = new Play(enemyScissors, win);

        assertEquals("me", play.getPlayWinner());
    }

    @Test
    void enemyScissorsMyDrawShouldDraw() {
        Play play = new Play(enemyScissors, draw);

        assertEquals("draw", play.getPlayWinner());
    }

    @Test
    void enemyScissorsMyLossEnemyShouldWin() {
        Play play = new Play(enemyScissors, lose);

        assertEquals("enemy", play.getPlayWinner());
    }
}
