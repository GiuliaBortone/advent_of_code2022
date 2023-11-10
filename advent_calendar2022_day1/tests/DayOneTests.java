import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DayOneTests {
    String shortFilePath = "./shortExample.txt";
    String longFilePath = "./longExample.txt";

    @Test
    public void checkCorrectlyAddedCaloriesToBackpack() {
        Backpack backpack = new Backpack(1000, 2000);

        assertEquals(3000, backpack.getTotalCalories());
    }

    @Test
    public void addBackpackToExpedition() {
        Backpack backpack = new Backpack();
        Expedition expedition = new Expedition(backpack);

        assertEquals(backpack, expedition.backpacks()[0]);
    }

    @Test
    public void addCaloriesToBackpackInExpedition() {
        Backpack backpack = new Backpack(1000);
        Expedition expedition = new Expedition(backpack);

        assertEquals(1000, expedition.backpacks()[0].getTotalCalories());
    }

    @Test
    public void addThreeBackpacksToExpeditionAndFindHighestCaloriesBackpack() {
        Backpack firstBackpack = new Backpack(6000);
        Backpack secondBackpack = new Backpack(4000);
        Backpack thirdBackpack = new Backpack(7000, 8000, 9000);

        Expedition expedition = new Expedition(firstBackpack, secondBackpack, thirdBackpack);

        assertEquals(thirdBackpack, expedition.findHighestCaloriesBackpack());
        assertEquals(24000, expedition.findHighestCaloriesBackpack().getTotalCalories());
    }

    @Test
    public void findHighestCaloriesBackpackCreatingExpeditionFromShortFile() {
        String fileContent = FileReader.copyFileContentToString(shortFilePath);
        Expedition expedition = Expedition.createExpedition(fileContent);

        assertEquals(24000, expedition.findHighestCaloriesBackpack().getTotalCalories());
    }

    @Test
    public void findHighestCaloriesBackpackCreatingExpeditionFromLongFile() {
        String fileContent = FileReader.copyFileContentToString(longFilePath);
        Expedition expedition = Expedition.createExpedition(fileContent);

        assertEquals(66306, expedition.findHighestCaloriesBackpack().getTotalCalories());
    }

    @Test
    public void findFirstThreeHighestCaloriesFromShortFile() {
        String fileContent = FileReader.copyFileContentToString(shortFilePath);
        Expedition expedition = Expedition.createExpedition(fileContent);

        assertEquals(45000, expedition.findFirstThreeCaloriesBackpacks());
    }

    @Test
    public void findFirstThreeHighestCaloriesFromLongFile() {
        String fileContent = FileReader.copyFileContentToString(longFilePath);
        Expedition expedition = Expedition.createExpedition(fileContent);

        assertEquals(195292, expedition.findFirstThreeCaloriesBackpacks());
    }
}
