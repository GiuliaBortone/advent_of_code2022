public class ElfPair {
    private final Elf firstElf;
    private final Elf secondElf;

    public ElfPair(Elf firstElf, Elf secondElf) {
        this.firstElf = firstElf;
        this.secondElf = secondElf;
    }

    public boolean findIfOverlap() {
        return firstElf.isOneOfElfSections(secondElf.getFirstSection()) || firstElf.isOneOfElfSections(secondElf.getLastSection()) ||
                secondElf.isOneOfElfSections(firstElf.getFirstSection()) || secondElf.isOneOfElfSections(firstElf.getLastSection());
    }
}
