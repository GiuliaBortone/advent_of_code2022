import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonIdentifierTests {
    @Test
    void findCommonItemInTwoStrings() {
        CommonItemIdentifier commonItemIdentifier = new CommonItemIdentifier();
        assertEquals('r', commonItemIdentifier.findCommonItemInStrings(List.of("vJrwpWtwJgWrhcsFMMfFFhFp", "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL", "PmmdzqPrVvPwwTWBwg")));
    }
}
