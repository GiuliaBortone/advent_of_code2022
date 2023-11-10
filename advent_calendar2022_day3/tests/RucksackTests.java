import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RucksackTests {
    @Test
    void compartmentsSeparationOfInputShouldBeCorrect() {
        Rucksack rucksack = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");

        assertEquals("vJrwpWtwJgWr", rucksack.getFirstCompartmentContent());
        assertEquals("hcsFMMfFFhFp", rucksack.getSecondCompartmentContent());
    }

    @Test
    void returnsCorrectContentAfterCreation() {
        Rucksack rucksack = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");

        assertEquals("vJrwpWtwJgWrhcsFMMfFFhFp", rucksack.getRucksackContent());
    }

    @Test
    void shouldFindpItemInBothCompartmentsForvJrwpWtwJgWrhcsFMMfFFhFp() {
        Rucksack rucksack = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");
        assertEquals('p', rucksack.findItemContainedInBothCompartments());
    }

    @Test
    void shouldFindLItemInBothCompartmentsForjqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL() {
        Rucksack rucksack = new Rucksack("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");
        assertEquals('L', rucksack.findItemContainedInBothCompartments());
    }

    @Test
    void shouldFindPItemInBothCompartmentsForPmmdzqPrVvPwwTWBwg() {
        Rucksack rucksack = new Rucksack("PmmdzqPrVvPwwTWBwg");
        assertEquals('P', rucksack.findItemContainedInBothCompartments());
    }
}
