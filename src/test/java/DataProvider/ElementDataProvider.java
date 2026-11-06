package DataProvider;
import org.testng.annotations.DataProvider;

public class ElementDataProvider {

    @DataProvider(name = "testDataWithCustomerData")

    public static Object[][] testDataWithCustomerData(){
        return new Object[][]{
                {
                        ElementDemoData.builder()
                                .name("phu")
                                .email("nvphu1@gmail.com")
                                .duration("2 years")
                                .role("QC Engineer")
                                .build()
                },
                {
                        ElementDemoData.builder()
                                .name("tien")
                                .email("tienvan1@gmail.com")
                                .duration("7 years")
                                .role("Automation QC Engineer")
                                .build()
                }
        };
    };
}
