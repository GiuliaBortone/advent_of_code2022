import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RucksacksIdentifier {
    private final List<Rucksack> expeditionRucksacks = new ArrayList<>();

    public RucksacksIdentifier(String listOfExpeditionRucksacks) {
        separateRucksacks(listOfExpeditionRucksacks);
    }

    private void separateRucksacks(String listOfExpeditionRucksacks) {
        String[] individualRucksacks = listOfExpeditionRucksacks.split("\n");

        expeditionRucksacks.addAll(Arrays.stream(individualRucksacks).map(Rucksack::new).toList());
    }


    public List<Rucksack> getRucksacks() {
        return expeditionRucksacks;
    }
}
