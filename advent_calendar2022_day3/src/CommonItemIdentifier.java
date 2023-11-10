import java.util.ArrayList;
import java.util.List;

public class CommonItemIdentifier {
    public Character findCommonItemInStrings(List<String> strings) {
        String firstStringToCompare = strings.get(0);

        List<Character> commonCharacters = new ArrayList<>();

        for (int i = 0; i < firstStringToCompare.length(); i++) {
            Character currentChar = firstStringToCompare.charAt(i);
            if (strings.get(1).contains(String.valueOf(currentChar))) {
                commonCharacters.add(currentChar);
            }
        }

        for (int i = 2; i < strings.size(); i++) {
            for (int j = commonCharacters.size() - 1; j >= 0; j--) {
                if (!strings.get(i).contains(String.valueOf(commonCharacters.get(j)))) {
                    commonCharacters.remove(commonCharacters.get(j));
                }
            }
        }

        return commonCharacters.get(0);
    }
}
