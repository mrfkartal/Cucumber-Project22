package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
Cucumber'da step definitions package'i içerisinde
@before @after gibi bir notasyon varsa
extends testBase dememize gerek kalmadan
her scenario'dan önce ve/veya sonra bu methodlar çalışacaktır

Bu da bizim isteyeceğimiz bir durum değildir

Cucumber'da @before @after kullanma ihtiyacımız olursa
bunu stepDefinitions package'i altında oluşturacağımız
Hooks class'ına koyarız

Biz her scenario'dan sonra test sonucunu kontrol edip failed olan
scenario'lar için screenshoot olmasi amaciyla
@After methodu kullanacağız

 */
    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot;

        if (scenario.isFailed()) {
            screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshots");
        }
        Driver.closeDriver();
    }
}
