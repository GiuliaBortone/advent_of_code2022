import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShipAndRulesTranslator {
    int CARGO_SPACE = 4;

    private final List<Stack<String>> cargoStacks = new ArrayList<>();
    private List<MovingRule> movingRules = new ArrayList<>();

    public ShipAndRulesTranslator(String shipAndRulesStringFormat) {
        String[] separated = shipAndRulesStringFormat.split("\n\n");
        createCargoStacks(separated[0]);
        createMovingRules(separated[1]);
    }

    private void createCargoStacks(String cargoStringFormat) {
        String[] cargoStringLines = cargoStringFormat.split("\n");

        for (int i = 0; i < cargoStringLines[0].length(); i += CARGO_SPACE) {
            Stack<String> currentStack = new Stack<>();

            for (int j = cargoStringLines.length - 2; j >= 0; j--) {
                String crateContent = String.valueOf(cargoStringLines[j].charAt(i + 1));
                if (!crateContent.equals(" ")) {
                    currentStack.push(crateContent);
                }
            }

            cargoStacks.add(currentStack);
        }
    }

    private void createMovingRules(String movingRulesStringFormat) {
        String[] rulesLines = movingRulesStringFormat.split("\n");

        for (String ruleLine : rulesLines) {
            Pattern pattern = Pattern.compile("move (\\d+) from (\\d+) to (\\d+)");
            Matcher matcher = pattern.matcher(ruleLine);

            while (matcher.find()) {
                movingRules.add(new MovingRule(Integer.parseInt(matcher.group(1)),
                        Integer.parseInt(matcher.group(2)),
                        Integer.parseInt(matcher.group(3))));
            }
        }
    }

    public List<Stack<String>> getCargoStacks() {
        return cargoStacks;
    }

    public List<MovingRule> getMovingRules() {
        return movingRules;
    }
}
