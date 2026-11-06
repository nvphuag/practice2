package ElementsDemoPage;

import Constants.TestData;
import Utils.WaitUtils;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;


public class ElementDemoPage {
    //driver
    WebDriver driver;
    WaitUtils waitUtils;
    //locator
    By ELEMENT_MENU = By.xpath("//h5[text()='Elements']");
    String ELEMENT_PAGE_URL = TestData.ELEMENT_PAGE_URL;

    //Contructor
    public ElementDemoPage (WebDriver driver){
        this.driver = driver;
        waitUtils = new WaitUtils(driver);
    }

    //action/method
    public void accessElementDemoPage(WebDriver driver){
        try{
            waitUtils.waitForPresenceOfElementLocated(ELEMENT_MENU).click();
        }catch (NoSuchElementException e){
            e.printStackTrace();
            throw e;
        }
    }
}
