public class Main {
    public static void main(String[] args) {
        String fileContent = FileReader.copyFileContentToString("./longExample.txt");
        Expedition expedition = Expedition.createExpedition(fileContent);

        System.out.println(expedition.findHighestCaloriesBackpack().getTotalCalories());
    }
}