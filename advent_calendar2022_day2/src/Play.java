public class Play {
    private final HandShape enemyHand;
    private final HandShape myHand;

    public Play(String enemyHand, String myHand) {
        this.enemyHand = HandShape.handShapeIdentifier(enemyHand);
        this.myHand = HandShape.shapeToChose(this.enemyHand, myHand);
    }

    protected String getPlayWinner() {
        HandShape winningHand = HandShape.winningHandShape(enemyHand, myHand);
        if (enemyHand == myHand) {
            return "draw";
        }

        if (winningHand == enemyHand) {
            return "enemy";
        }

        return "me";
    }

    public int[] playPoints() {
        String playResult = this.getPlayWinner();
        int[] playersPoints = new int[2];

        playersPoints[0] = getShapePoints(enemyHand);
        playersPoints[1] = getShapePoints(myHand);

        switch (playResult) {
            case "enemy" -> playersPoints[0] += 6;
            case "me" -> playersPoints[1] += 6;
            case "draw" -> {
                playersPoints[0] += 3;
                playersPoints[1] += 3;
            }
        }

        return playersPoints;
    }

    private int getShapePoints(HandShape hand) {
        return switch (hand) {
            case ROCK -> 1;
            case PAPER -> 2;
            case SCISSORS -> 3;
        };
    }
}
