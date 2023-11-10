import java.util.HashMap;

public class ItemPrioritizer {
    HashMap<Character, Integer> priorities = new HashMap<>();

    public ItemPrioritizer() {
        createPriorityRules();
    }

    private void createPriorityRules() {
        for (char currentCharacter = 'a'; currentCharacter != 'z' + 1; currentCharacter++) {
            priorities.put(currentCharacter, currentCharacter - 'a' + 1);
        }

        for (char currentCharacter = 'A'; currentCharacter != 'Z' + 1; currentCharacter++) {
            priorities.put(currentCharacter, currentCharacter - 'A' + 27);
        }
    }

    public int getPriorityForItem(Character characterToPrioritize) {
        return priorities.get(characterToPrioritize);
    }
}
