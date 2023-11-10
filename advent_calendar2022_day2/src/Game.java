public class Game {
    private final Play[] plays;
    private int enemyPoints;
    private int myPoints;

    public Game(Play... plays) {
        this.plays = plays;
        calculatePoints();
    }

    private void calculatePoints() {
        for (Play play : plays) {
            enemyPoints += play.playPoints()[0];
            myPoints += play.playPoints()[1];
        }
    }

    public String getGameWinner() {
        return enemyPoints > myPoints? "enemy" : (enemyPoints == myPoints? "draw" : "me");
    }

    public int getPlayerPoints(String player) {
        return player.equals("enemy") ? enemyPoints : myPoints;
    }
}
