public class File implements Node {
    private final int dimension;

    public File(int dimension) {
        this.dimension = dimension;
    }

    @Override
    public int calculateDimension() {
        return dimension;
    }
}
