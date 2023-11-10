import java.util.List;

public class Rucksack {
    private final String firstCompartmentContent;
    private final String secondCompartmentContent;

    public Rucksack(String ruckSackContent) {
        firstCompartmentContent = ruckSackContent.substring(0, ruckSackContent.length() / 2);
        secondCompartmentContent = ruckSackContent.substring(ruckSackContent.length() / 2);
    }

    public String getFirstCompartmentContent() {
        return firstCompartmentContent;
    }

    public String getSecondCompartmentContent() {
        return secondCompartmentContent;
    }

    public Character findItemContainedInBothCompartments() {
        CommonItemIdentifier commonItemIdentifier = new CommonItemIdentifier();
        return commonItemIdentifier.findCommonItemInStrings(List.of(firstCompartmentContent, secondCompartmentContent));
    }

    public String getRucksackContent() {
        return getFirstCompartmentContent() + getSecondCompartmentContent();
    }
}
