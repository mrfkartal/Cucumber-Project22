package stepDefinitions;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {

    GuruPage guruPage=new GuruPage();
    @Given("cookies sorulursa kabul eder")
    public void cookies_sorulursa_kabul_eder() {
        Driver.getDriver().switchTo().frame(guruPage.cookiesIframe);
        guruPage.acceptCookies.click();
    }
    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenSutun) {

        List<WebElement> tabloBaslikListesi= guruPage.baslikListesi;
        // listemiz webelementlerden olusuyor
        // dolayisiyla bu webelementlerden hangisi
        // istenen sutun basligini tasiyor bilemeyiz
        int istenenBaslikIndexi=-3;
        for (int i = 0; i < tabloBaslikListesi.size(); i++) {
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)){
                istenenBaslikIndexi=i+1;
                break;
            }
        }

        // for loop ile tum sutun basliklarini bana verilen istenenSutun degeri ile karsilastirdim
        // loop biittiginde basligin bulunup bulunmadigini kontrol etmek ve
        // bulundu ise yoluma devam etmek istiyorum

        if (istenenBaslikIndexi != -3){ // baslik bulundu
            List<WebElement> istenenSutundakiElementler=
                    Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslikIndexi+"]"));
            for (WebElement each:istenenSutundakiElementler
            ) {
                System.out.println(each.getText());
            }


        } else{ // baslik bulunamadi
            System.out.println("istenen baslik bulunamadi");
        }

    }
}