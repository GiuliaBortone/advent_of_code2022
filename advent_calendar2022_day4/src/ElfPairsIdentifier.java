import java.util.ArrayList;
import java.util.List;

public class ElfPairsIdentifier {
    public static List<ElfPair> elfPairSeparator(String elfPairsStringFormat) {
        String[] elfPairsSeparatedStringFormat = elfPairsStringFormat.split("\n");
        List<ElfPair> elfPairs = new ArrayList<>();

        for (String individualElfPairStringFormat : elfPairsSeparatedStringFormat) {
            String[] individualElfPairSeparatedStringFormat = individualElfPairStringFormat.split(",");

            elfPairs.add(new ElfPair(new Elf(individualElfPairSeparatedStringFormat[0]), new Elf(individualElfPairSeparatedStringFormat[1])));
        }

        return elfPairs;
    }
}
