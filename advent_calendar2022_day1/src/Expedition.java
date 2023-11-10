import java.util.Comparator;

import static java.util.Arrays.stream;
import static java.util.Collections.reverseOrder;

public record Expedition(Backpack... backpacks) {
    public Backpack findHighestCaloriesBackpack() {
        return stream(backpacks)
                .max(Comparator.comparing(Backpack::getTotalCalories))
                .orElse(null);
    }

    public int findFirstThreeCaloriesBackpacks() {
        return stream(backpacks)
                .sorted(reverseOrder(Comparator.comparing(Backpack::getTotalCalories)))
                .limit(3)
                .mapToInt(Backpack::getTotalCalories)
                .sum();
    }

    public static Expedition createExpedition(String contentFromFile) {
        String[] backpacksAsString = contentFromFile.split("\n\n");

        Backpack[] expeditionBackpacks = stream(backpacksAsString).map(lines -> {
            String[] backpackItems = lines.split("\n");

            return new Backpack(stream(backpackItems).mapToInt(Integer::parseInt).toArray());
        }).toArray(Backpack[]::new);

        return new Expedition(expeditionBackpacks);
    }
}
