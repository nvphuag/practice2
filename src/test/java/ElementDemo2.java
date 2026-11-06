import BaseTest.BaseTest;
import ElementsDemoPage.ElementDemoPage;
import org.testng.annotations.Test;

public class ElementDemo2 extends BaseTest {

    @Test
    public void TC_01(){
        ElementDemoPage elementDemoPage = new ElementDemoPage(driver);
        elementDemoPage.accessElementDemoPage(driver);
    }
}
