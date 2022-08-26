package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AccountSteps {

    DialogContent dc = new DialogContent();

    @Given("Navigate to basqar")
    public void navigateToBasqar() {

        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Create Account")
    public void createAccount() {
        dc.findAndClick("createAccount");


    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));


    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        GWD.Bekle(3);

        for (int i = 0; i < listElement.size(); i++)

        dc.findAndContainsText(listElement.get(i).get(0), listElement.get(i).get(1));



    }

    @When("Click on the element in Buttons")
    public void clickOnTheElementInButtons(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
                    dc.findAndClick(listElement.get(i));
        }


    }

    @When("User a Address name as {string} short name as {string}")
    public void userAAddressNameAsShortNameAs(String contactInformation, String shortName) {
        dc.findAndSend(contactInformation,shortName);
      dc.findAndClick("inputstate");
    }

    @And("fill in the information")
    public void fillInTheInformation(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @Then("verifyThatYourAccount")
    public void verifythatyouraccount(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndContainsText(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @And("waitText")
    public void waittext() {
        WebDriverWait wait=new WebDriverWait(GWD.driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.xpath("(//li[@class=\"greet welcome\"]/span)[1]"),"Welcome"));
    }

    @And("VisibleLoading")
    public void visibleloading() {
        WebDriverWait wait=new WebDriverWait(GWD.driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[@alt=\"Loading...\"]")));
    }
}