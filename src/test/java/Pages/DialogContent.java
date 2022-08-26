package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText="Create an Account")
    private WebElement createAccount;

    @FindBy(id="firstname")
    private WebElement firstname;

    @FindBy(id="lastname")
    private WebElement lastname;

    @FindBy(id="email_address")
    private WebElement email_address;

    @FindBy(id="password")
    private WebElement password;

    @FindBy(id="password-confirmation")
    private WebElement passwordConfirmation;


    @FindBy(css="[title='Create an Account']>span")
    private WebElement createAccountBtn;

    @FindBy(css=" [data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    private WebElement verifyOne;

    @FindBy(css=" [class='authorization-link']>a")
    private WebElement signBtn;

    @FindBy (id = "email")
    public WebElement inputEmail2;

    @FindBy (id = "pass")
    public WebElement inputPassword2;

    @FindBy (id = "send2")
    public WebElement signInBtn;

    @FindBy (css = "[class='greet welcome'] > span")
    public WebElement verifyTwo;


    @FindBy (xpath="(//span/button)[1]")
    public WebElement menuBar;

    @FindBy(xpath=" /html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")
    private WebElement myAccountBtn;


    @FindBy(linkText="Manage Addresses")
    private WebElement manageAddressesBtn;

    @FindBy(css="[title='Add New Address']>span")
    private WebElement addNwwAdressBtn;



    @FindBy(id="company")
    private WebElement inputCompany;


    @FindBy(id="telephone")
    private WebElement inputtelephone;



    @FindBy(id="street_1")
    private WebElement inputStreetAddress;



    @FindBy(id="city")
    private WebElement city;



    @FindBy(css="[value='4']")
    private WebElement inputstate;

    @FindBy(id="zip")
    private WebElement inputZip;

    @FindBy(xpath="//span[text()=Save Address]")
    private WebElement saveAdressButn;


    @FindBy(css="  [data-ui-id='message-success']>div")
    private WebElement verifyAcntThree;


    @FindBy(css="[class='action more button']")
    private WebElement shopNewYogaBtn;
    @FindBy(css="  [alt='Echo Fit Compression Short']")
    private WebElement ShortBtn;


    @FindBy(id="send2")
    private WebElement send2;
    @FindBy(xpath="//select/option[@value='TR']")
    private WebElement turkey;

    @FindBy(id="country")
    private WebElement country;

    @FindBy(xpath="//select/option[@value='DE']")
    private WebElement germany;


    @FindBy(xpath="//select/option[@value='RU']")
    private WebElement russia;

    @FindBy(xpath="//a[@class=\"action showcart\"]")
    private WebElement showcart;

    @FindBy(id="top-cart-btn-checkout")
    private WebElement prodecetCheckout;

    @FindBy(xpath="//div[@data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]")
    private WebElement addToCartConfirm;

    @FindBy(xpath="//span[text()=\"Save Address\"]")
    private WebElement saveAddressButton;

    @FindBy(xpath="//button[@title=\"Place Order\"]")
    private WebElement placeOrder;

    @FindBy(xpath="(//button[@type=\"submit\"])[2]")
    private WebElement next;

    @FindBy(xpath="//*[@data-ui-id=\"message-success\"]/div")
    private WebElement addressVerify;

    @FindBy(css=" [id=option-label-size-143-item-171]")
    private WebElement shortSize;

    @FindBy(id="  option-label-color-93-item-49")
    private WebElement shortColor;

    @FindBy(id="product-addtocart-button")
    private WebElement addtocrdBtn;

    @FindBy(xpath="//img[@alt=\"Push It Messenger Bag\"]")
    private WebElement backPack;



    @FindBy(xpath="//span[text()=\"Thank you for your purchase!\"]")
    private WebElement thankYouOrder;








    WebElement myElement;
    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
           case "firstname" : myElement =firstname; break;
           case "lastname" : myElement =lastname; break;
           case "email_address" : myElement =email_address; break;
           case "password" : myElement =password; break;
           case "inputEmail2" : myElement =inputEmail2; break;
           case "inputPassword2" : myElement =inputPassword2; break;
           case "inputCompany" : myElement =inputCompany; break;
           case "inputtelephone" : myElement =inputtelephone; break;
           case "inputStreetAddress" : myElement =inputStreetAddress; break;
           case "city" : myElement =city; break;
                case "inputZip" : myElement =inputZip; break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "createAccount" : myElement =createAccount; break;
            case "createAccountBtn" : myElement =createAccountBtn; break;
            case "signBtn" : myElement =signBtn; break;
            case "signInBtn" : myElement =signInBtn; break;
            case "menuBar" : myElement =menuBar; break;
            case "myAccountBtn" : myElement =myAccountBtn; break;
            case "manageAddressesBtn" : myElement =manageAddressesBtn; break;
            case "addNwwAdressBtn" : myElement =addNwwAdressBtn; break;
            case "inputstate" : myElement =inputstate; break;
            case "saveAdressButn" : myElement =saveAdressButn; break;
            case "shopNewYogaBtn" : myElement =shopNewYogaBtn; break;
            case "ShortBtn" : myElement =ShortBtn; break;
            case "shortSize" : myElement =shortSize; break;
            case "shortColor" : myElement =shortColor; break;
            case "addtocrdBtn" : myElement =addtocrdBtn; break;
            case "country" : myElement =country; break;
            case "turkey" : myElement =turkey; break;
            case "germany" : myElement =germany; break;
            case "russia" : myElement =russia; break;
            case "saveAddressButton" : myElement =saveAddressButton; break;
            case "send2" : myElement =send2; break;
            case "backPack" : myElement =backPack; break;
            case "prodecetCheckout" : myElement =prodecetCheckout; break;
            case "showcart" : myElement =showcart; break;
            case "next" : myElement =next; break;
            case "placeOrder" : myElement =placeOrder; break;





        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
           case "verifyOne" : myElement =verifyOne; break;
           case "verifyTwo" : myElement =verifyTwo; break;
           case "verifyAcntThree" : myElement =verifyTwo; break;
            case "addressVerify" : myElement =addressVerify; break;
            case "addToCartConfirm" : myElement =addToCartConfirm; break;
            case "thankYouOrder" : myElement =thankYouOrder; break;

        }

        verifyContainsText(myElement,text);
    }


    public void SearchAndDelete(String searchText){
        findAndSend("searchInput", searchText); // aranacak kelimeyi kutucuğa gönder


//        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.stalenessOf(deleteButton));

        //     waitUntilLoading();

        // GWD.Bekle(2); // TODO: incelenecek

    }


}