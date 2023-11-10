import java.util.List;

public class Camp {
    List<ElfPair> elfPairs;

    public Camp(String elfPairsStringFormat) {
        this.elfPairs = ElfPairsIdentifier.elfPairSeparator(elfPairsStringFormat);
    }

    public int findOverlappingPairs() {
        return (int) elfPairs.stream().map(ElfPair::findIfOverlap).filter(pair -> pair).count();
    }
}
