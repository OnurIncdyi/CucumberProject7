package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_EnterSign {

    DialogContent dc=new DialogContent();
    @When("Enter mail and password and click button")
    public void enterMailAndPasswordAndClickButton() {
        dc.findAndClick("signBtn");
        dc.findAndSend("inputEmail2","Medchno3645@gmail.com");
        dc.findAndSend("inputPassword2","12345678Techno");
        dc.findAndClick("signInBtn");



    }


    @Then("Click Menu and My Account Click Manage Adreess")
    public void clickMenuAndMyAccountClickManageAdreess() {
        dc.findAndClick("menuBar");
        GWD.Bekle(4);
        dc.findAndClick("myAccountBtn");
        GWD.Bekle(2);
        dc.findAndClick("manageAddressesBtn");
    }
}
