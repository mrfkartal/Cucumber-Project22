package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HMCPage {
   public HMCPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement loginButonu;

    @FindBy(xpath = "//input[@class='form-control required']")
    public WebElement usernameKutusu;

    @FindBy(xpath = "//input[@class='form-control required password']")
    public WebElement passwordKutusu;

    @FindBy(id = "btnSubmit")
    public WebElement loginButonu2;

    @FindBy(id = "menuHotels")
    public WebElement hotelManagement;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[2]")
    public WebElement hotelList;

    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addHotel;

    @FindBy(xpath = "//input[@name='Code']")
    public WebElement codeKutusu;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement saveButonu;

    @FindBy(xpath = "//select[@class='form-control input-lg required']")
    public   WebElement ddm;
}
