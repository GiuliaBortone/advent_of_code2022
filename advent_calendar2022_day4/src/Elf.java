public class Elf {
    private final int firstSection;
    private final int lastSection;

    public Elf(String sections) {
        String[] separatedSections = sections.split("-");
        this.firstSection = Integer.parseInt(separatedSections[0]);
        this.lastSection = Integer.parseInt(separatedSections[1]);
    }

    public int getFirstSection() {
        return firstSection;
    }

    public int getLastSection() {
        return lastSection;
    }

    public boolean isOneOfElfSections(int sectionToFind) {
        return sectionToFind >= firstSection && sectionToFind <= lastSection;
    }
}
