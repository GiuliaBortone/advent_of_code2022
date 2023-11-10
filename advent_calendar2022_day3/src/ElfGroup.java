import java.util.List;

public class ElfGroup {
    private final List<Rucksack> rucksacks;

    public ElfGroup(List<Rucksack> elvesRucksacks) {
        this.rucksacks = elvesRucksacks;
    }

    public Character findBadge() {
        CommonItemIdentifier commonItemIdentifier = new CommonItemIdentifier();
        return commonItemIdentifier.findCommonItemInStrings(rucksacks.stream().map(Rucksack::getRucksackContent).toList());
    }
}
