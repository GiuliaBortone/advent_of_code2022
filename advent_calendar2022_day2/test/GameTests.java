import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GameTests {
    String enemyRock = "A";
    String enemyPaper = "B";
    String enemyScissors = "C";
    String lose = "X";
    String win = "Z";

    @Test
    void enemyLossWithPaperMyWinWithRockShouldBeDraw() {
        Play firstPlay = new Play(enemyPaper, lose);
        Play secondPlay = new Play(enemyRock, win);

        Game game = new Game(firstPlay, secondPlay);

        assertEquals("draw", game.getGameWinner());
    }

    @Test
    void bothMyWinsMeShouldWin() {
        Play firstPlay = new Play(enemyRock, win);
        Play secondPlay = new Play(enemyPaper, win);

        Game game = new Game(firstPlay, secondPlay);

        assertEquals("me", game.getGameWinner());
    }

    @Test
    void enemyWinWithScissorsEnemyShouldWinWithNinePointsMeShouldLoseWithTwoPoints() {
        Play play = new Play(enemyScissors, lose);
        Game game = new Game(play);

        assertEquals(9, game.getPlayerPoints("enemy"));
        assertEquals(2, game.getPlayerPoints("me"));
    }

    @Test
    void playsFromFileMeShouldWinWith15632Points() throws IOException {
        String filePath = "./gamePredictions.txt";
        String fileContent = Files.readString(Paths.get(filePath));
        List<Play> plays = new ArrayList<>();

        for (int i = 0; i < fileContent.length(); i += 4) {
            Play play = new Play(String.valueOf(fileContent.charAt(i)), String.valueOf(fileContent.charAt(i + 2)));
            plays.add(play);
        }

        Game game = new Game(plays.toArray(Play[]::new));

        assertEquals(14416, game.getPlayerPoints("me"));
    }
}
