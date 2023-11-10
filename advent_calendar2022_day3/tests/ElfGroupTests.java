import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElfGroupTests {
    List<Rucksack> rucksacks = List.of(
            new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp"),
            new Rucksack("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL"),
            new Rucksack("PmmdzqPrVvPwwTWBwg"));

    @Test
    void elfGroupBadgeShouldBeLowercaseR() {
        ElfGroup elfGroup = new ElfGroup(rucksacks);
        assertEquals('r', elfGroup.findBadge());
    }
}
