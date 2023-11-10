import java.util.List;
import java.util.Stack;

public class Ship {
    List<Stack<String>> stacks;

    public Ship(List<Stack<String>> stacks) {
        this.stacks = stacks;
    }

    public Stack<String> getASpecificStack(int stackNumber) {
        return stacks.get(stackNumber - 1);
    }
}
