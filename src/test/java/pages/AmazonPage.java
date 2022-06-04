package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
        //bunun vazifesi ....
    }

    @FindBy(id="twotabsearchtextbox")
    public static WebElement aramaKutusu;


    @FindBy (xpath= "//div[@class='a-section a-spacing-small a-spacing-top-small']")

    public static WebElement aramaSonucElementi;

}
