public enum HandShape {
    ROCK,
    PAPER,
    SCISSORS;

    public static HandShape handShapeIdentifier(String hand) {
        switch (hand) {
            case "A", "X" -> {
                return ROCK;
            }
            case "B", "Y" -> {
                return PAPER;
            }
            case "C", "Z" -> {
                return SCISSORS;
            }
            default -> throw new IllegalArgumentException();
        }
    }

    public static HandShape winningHandShape(HandShape firstHand, HandShape secondHand) {
        if (firstHand == ROCK && secondHand == SCISSORS || firstHand == SCISSORS && secondHand == ROCK) {
            return ROCK;
        } else if (firstHand == PAPER && secondHand == ROCK || firstHand == ROCK && secondHand == PAPER) {
            return PAPER;
        } else if (firstHand == SCISSORS && secondHand == PAPER || firstHand == PAPER && secondHand == SCISSORS) {
            return SCISSORS;
        } else {
            return firstHand;
        }
    }

    public static HandShape shapeToChose(HandShape enemyHand, String myInput) {
        return switch (myInput) {
            case "X" -> losingHand(enemyHand);
            case "Y" -> handToDraw(enemyHand);
            case "Z" -> winningHand(enemyHand);
            default -> throw new IllegalStateException();
        };
    }

    private static HandShape winningHand(HandShape enemyHand) {
        return switch (enemyHand) {
            case ROCK -> PAPER;
            case PAPER -> SCISSORS;
            case SCISSORS -> ROCK;
        };
    }

    private static HandShape losingHand(HandShape enemyHand) {
        return switch (enemyHand) {
            case ROCK -> SCISSORS;
            case PAPER -> ROCK;
            case SCISSORS -> PAPER;
        };
    }

    private static HandShape handToDraw(HandShape enemyHand) {
        return enemyHand;
    }
}
