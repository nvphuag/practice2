import BaseTest.BaseTest;
import ElementsDemoPage.ElementDemoPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import DataProvider.*;
import Utils.ScreenshotUtils;

public class ElementDemo extends BaseTest {

    @Test@Parameters({"data"})
    public void TC_01(String text){
        ElementDemoPage elementDemoPage = new ElementDemoPage(driver);
        elementDemoPage.accessElementDemoPage(driver);
        System.out.println("In parameter :"+text);
    }
    @Test(dataProvider = "testDataWithCustomerData", dataProviderClass = ElementDataProvider.class)
    public void TC_02(ElementDemoData data){
//        ElementDemoPage elementDemoPage = new ElementDemoPage(driver);
//        elementDemoPage.accessElementDemoPage(driver);
        System.out.println("In name :"+data.getName());
        System.out.println("In duration :"+data.getDuration());
    }
}
