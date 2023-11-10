import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShipAndRulesTranslatorTests {
    String shortInput = """
                [D]   \s
            [N] [C]   \s
            [Z] [M] [P]
             1   2   3\s
            
            move 1 from 2 to 1
            move 3 from 1 to 3
            move 2 from 2 to 1
            move 1 from 1 to 2""";

    @Test
    void shouldFindThreeStacksAndFourRules() {
        ShipAndRulesTranslator translator = new ShipAndRulesTranslator(shortInput);

        assertEquals(3, translator.getCargoStacks().size());
        assertEquals(4, translator.getMovingRules().size());
    }

    @Test
    void stacksShouldHaveCorrectCrates() {
        ShipAndRulesTranslator translator = new ShipAndRulesTranslator(shortInput);

        assertEquals("N", translator.getCargoStacks().get(0).peek());
        assertEquals("D", translator.getCargoStacks().get(1).peek());
        assertEquals("P", translator.getCargoStacks().get(2).peek());
    }
}
