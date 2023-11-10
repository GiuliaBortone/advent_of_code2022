import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShipTests {
    public static Stack<String> firstStack = new Stack<>();
    public static Stack<String> secondStack = new Stack<>();
    public static Stack<String> thirdStack = new Stack<>();

    @BeforeAll
    public static void createStacks() {
        firstStack.push("Z");
        firstStack.push("N");
        secondStack.push("M");
        secondStack.push("C");
        secondStack.push("D");
        thirdStack.push("P");
    }

    @Test
    void topCratesShouldBeNDP() {
        Ship ship = new Ship(List.of(firstStack, secondStack, thirdStack));

        assertEquals("N", ship.getASpecificStack(1).peek());
        assertEquals("D", ship.getASpecificStack(2).peek());
        assertEquals("P", ship.getASpecificStack(3).peek());
    }
}
