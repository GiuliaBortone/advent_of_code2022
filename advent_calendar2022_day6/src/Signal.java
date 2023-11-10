public class Signal {
    private final String signalContent;

    public Signal(String signalContent) {
        this.signalContent = signalContent;
    }

    public int detectMarker(int numberOfDistinctCharacters) {
        int markerPosition = -1;
        for (int i = 0; i < signalContent.length(); i++) {
            if (!hasDuplicate(signalContent.substring(i, i + numberOfDistinctCharacters))) {
                markerPosition = i + numberOfDistinctCharacters;
                break;
            }
        }
        return markerPosition;
    }

    private boolean hasDuplicate(String subString) {
        return subString.length() != subString.chars().distinct().count();
    }
}
