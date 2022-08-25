package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _01_Scenario {

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

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        GWD.Bekle(3);

        for (int i = 0; i < listElement.size(); i++)

        dc.findAndContainsText(listElement.get(i).get(0), listElement.get(i).get(1));



    }

    @And("Click on the element in Buttons")
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
}