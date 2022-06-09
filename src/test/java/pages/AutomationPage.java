package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {

     public AutomationPage(){

         PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[@class='login']")
    public WebElement singInButton;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//i[@class='icon-user left']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//input[@id='id_gender1']")
   public WebElement gender;

   @FindBy(xpath = "//input[@id='customer_firstname']")
   public WebElement firstName;

   @FindBy(xpath = "//input[@id='customer_lastname']")
   public WebElement lastName;

   @FindBy(xpath = "//input[@id='passwd']")
   public WebElement password;

   @FindBy(xpath = "//select[@id='days']")
   public WebElement ddmDay;

   @FindBy(xpath = "//select[@id='months']")
   public WebElement ddmMonth;

   @FindBy(xpath = "//select[@id='years']")
   public WebElement ddmYear;

   @FindBy(xpath = "//input[@id='firstname']")
   public WebElement firstName2;

   @FindBy(xpath = "//input[@id='lastname']")
   public WebElement lastName2;

   @FindBy(xpath = "//input[@id='company']")
   public WebElement company;

   @FindBy(xpath = "//input[@id='address1']")
   public WebElement address1;

   @FindBy(xpath = "//input[@id='address2']")
   public WebElement address2;

   @FindBy(xpath = "//input[@id='city']")
   public WebElement city;

   @FindBy(xpath = "//select[@id='id_state']")
   public WebElement ddmState;

   @FindBy(xpath = "//input[@id='postcode']")
   public WebElement zip;

   @FindBy(xpath = "//select[@id='id_country']")
   public WebElement ddmCountry;

   @FindBy(xpath = "//textarea[@id='other']")
   public WebElement info;

   @FindBy(xpath = "//input[@id='phone']")
   public WebElement homePhone;

   @FindBy(xpath = "//input[@id='phone_mobile']")
   public WebElement mobilePhone;

   @FindBy(xpath = "//input[@id='alias']")
   public WebElement myAddress;

   @FindBy(xpath = "//*[text()='Register']")
   public WebElement registerButton;

   @FindBy(xpath = "//*[text()='Welcome to your account. Here you can manage all of your personal information and orders.']")
   public WebElement positiveResultText;

   @FindBy(xpath = "//*[text()='Invalid email address.']")
   public WebElement negativeResultText;



}
