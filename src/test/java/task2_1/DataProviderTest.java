package task2_1;

import org.testng.annotations.DataProvider;
import task2_1.utils.DataManager;
import task2_1.utils.JsonReader;

public class DataProviderTest {

    @DataProvider(name = "privacy policy")
    public static Object [][] getDataForPrivacyPolicy() {

        DataManager dataManager = new DataManager();
        dataManager.setLanguages(
                JsonReader.getDataFromJsonFile("src/test/resources/testdata/PrivacyPolicyTestData.json",
                        "languages"));

        return new Object[][] {{dataManager}};

    }
}
