import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemPrioritizerTests {
    @Test
    void pShouldHavePriority16() {
        ItemPrioritizer itemPrioritizer = new ItemPrioritizer();
        assertEquals(16, itemPrioritizer.getPriorityForItem('p'));
    }

    @Test
    void PShouldHavePriority42() {
        ItemPrioritizer itemPrioritizer = new ItemPrioritizer();
        assertEquals(42, itemPrioritizer.getPriorityForItem('P'));
    }
}
