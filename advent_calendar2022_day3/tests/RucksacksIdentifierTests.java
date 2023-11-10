import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RucksacksIdentifierTests {
    @Test
    void shouldCorrectlySeparateAllBackpacksFromGivenInput() {

        RucksacksIdentifier rucksacksIdentifier = new RucksacksIdentifier("""
                vJrwpWtwJgWrhcsFMMfFFhFp
                jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
                PmmdzqPrVvPwwTWBwg
                wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
                ttgJtRGJQctTZtZT
                CrZsJsPPZsGzwwsLwLmpwMDw""");
        assertEquals("vJrwpWtwJgWrhcsFMMfFFhFp", rucksacksIdentifier.getRucksacks().get(0).getRucksackContent());
        assertEquals("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL", rucksacksIdentifier.getRucksacks().get(1).getRucksackContent());
        assertEquals("PmmdzqPrVvPwwTWBwg", rucksacksIdentifier.getRucksacks().get(2).getRucksackContent());
        assertEquals("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn", rucksacksIdentifier.getRucksacks().get(3).getRucksackContent());
        assertEquals("ttgJtRGJQctTZtZT", rucksacksIdentifier.getRucksacks().get(4).getRucksackContent());
        assertEquals("CrZsJsPPZsGzwwsLwLmpwMDw", rucksacksIdentifier.getRucksacks().get(5).getRucksackContent());
    }
}
