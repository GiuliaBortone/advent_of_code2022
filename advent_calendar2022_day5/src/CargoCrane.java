import java.util.List;
import java.util.Stack;

public class CargoCrane {

    private final List<MovingRule> movingRules;

    public CargoCrane(List<MovingRule> movingRules) {
        this.movingRules = movingRules;
    }

    public void executeMoves(Ship ship) {
        for (MovingRule movingRule : movingRules) {
            Stack<String> originStack = ship.getASpecificStack(movingRule.fromCrate());
            Stack<String> destinationStack = ship.getASpecificStack(movingRule.toCrate());

            Stack<String> cratesToMove = new Stack<>();

            for (int i = 0; i < movingRule.quantityOfCrates(); i++) {
                cratesToMove.push(originStack.pop());
            }

            for (int i = cratesToMove.size() - 1; i >= 0; i--) {
                destinationStack.push(cratesToMove.pop());
            }
        }
    }
}
