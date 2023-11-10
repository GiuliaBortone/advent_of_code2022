import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ElfPairTests {
    @Test
    void shouldFindThat2And4ElfIsAllContainedIn2And5Elf() {
        ElfPair elfPair = new ElfPair(new Elf("2-4"), new Elf("2-5"));

        assertTrue(elfPair.findIfOverlap());
    }
}
