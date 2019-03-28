package steps;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtil {
    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void intitializeTest() {
        System.out.println("Opening the browser: Chrome");

        System.setProperty("webdriver.chrome.driver", "D:\\Development\\chromedriver.exe");
        base.driver = new ChromeDriver();
    }

    @After
    public void tearDownTest(Scenario scenario) {
        if(scenario.isFailed()) {
            //Take a screenshot
            System.out.println(scenario.getName());
        }

        System.out.println("Closing the browser: Chrome");
//        base.driver.close();
    }
}
