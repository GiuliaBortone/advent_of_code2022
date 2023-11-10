import java.util.Arrays;

public class Backpack {
    private final int totalCalories;

    public Backpack(int... calories) {
        this.totalCalories = Arrays.stream(calories).sum();
    }

    public int getTotalCalories() {
        return totalCalories;
    }
}
