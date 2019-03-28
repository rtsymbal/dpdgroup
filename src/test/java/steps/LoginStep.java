package steps;

import base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPage;

import java.util.Collections;
import java.util.List;

public class LoginStep extends BaseUtil {
    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {

        System.out.println("I navigate to the login page");
        base.driver.get("http://www.executeautomation.com/demosite/Login.html");
    }

    @And("I enter a credentials for Login")
    public void iEnterAFollowingCredentialsForLogin(DataTable table) {
        List<List<String>> data = Collections.singletonList(table.row(1));

        LoginPage page = new LoginPage(base.driver);
        System.out.println("I enter a following credentials for Login: " +data.get(0).get(0)+ " " +data.get(0).get(1));
        page.login(data.get(0).get(0), data.get(0).get(1));
//        base.driver.findElement(By.name("UserName")).sendKeys(data.get(0).get(0));
//        base.driver.findElement(By.name("Password")).sendKeys(data.get(0).get(1));
    }

    @And("I click login button")
    public void iClickLoginButton() {
        System.out.println("I click login button");
        LoginPage page = new LoginPage(base.driver);
        page.clickLogin();
//        base.driver.findElement(By.name("Login")).submit();
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        System.out.println("I should see the userform page");
        Assert.assertTrue(base.driver.findElement(By.id("Initial")).isDisplayed());
    }



//    @And("I enter a {string} and {string}")
//    public void iEnterAUserNameAndPassword(String userName, String password) {
//        System.out.println("Login " +userName+ ", Password " +password);
//    }
}
