import java.util.ArrayList;
import java.util.List;

public class Expedition {
    private final List<Rucksack> rucksacks;
    private final List<ElfGroup> elfGroups = new ArrayList<>();

    public Expedition(List<Rucksack> listOfRucksacks) {
        this.rucksacks = listOfRucksacks;
        identifyGroups();
    }

    public int getTotalExpeditionPriorities() {
        ItemPrioritizer itemPrioritizer = new ItemPrioritizer();

        return rucksacks.stream().map(rucksack -> itemPrioritizer.getPriorityForItem(rucksack.findItemContainedInBothCompartments())).reduce(0, Integer::sum);
    }

    private void identifyGroups() {
        for (int i = 0; i < rucksacks.size(); i += 3) {
            elfGroups.add(new ElfGroup(List.of(rucksacks.get(i), rucksacks.get(i + 1), rucksacks.get(i + 2))));
        }
    }

    public int getTotalElfGroupsPriorites() {
        ItemPrioritizer itemPrioritizer = new ItemPrioritizer();

        return elfGroups.stream().map(group -> itemPrioritizer.getPriorityForItem(group.findBadge())).reduce(0, Integer::sum);
    }
}
