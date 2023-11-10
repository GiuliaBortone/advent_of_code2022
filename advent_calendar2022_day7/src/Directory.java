import java.util.Arrays;

public class Directory {
    Node[] directoryContent;

    public Directory(Node... directoryContent) {
        this.directoryContent = directoryContent;
    }

    public int calculateDimension() {
        int dimension = 0;

        if (directoryContent != null) {
            dimension = Arrays.stream(directoryContent).mapToInt(Node::calculateDimension).sum();
        }
        return dimension;
    }
}
