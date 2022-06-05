package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import java.util.ArrayList;
import java.util.List;
public class TutorialStepDefinitions {
    static List<String> urunListesi=new ArrayList<>();
    static List<String> sepetListesi=new ArrayList<>();
    @Given("kullanici tutorial ninja sayfasina gider")
    public void kullanici_tutorial_ninja_sayfasina_gider() {
        Driver.getDriver().get("http://tutorialsninja.com/demo/index.php?route=common/home");
    }
    @Then("kullanici telefonlarin oldugu butona basar")
    public void kullanici_telefonlarin_oldugu_butona_basar() {
        Driver.getDriver().findElement(By.xpath("//a[text()='Phones & PDAs']"));
    }
    @Then("kullanici telefonlarin markalarini listeler")
    public void kullanici_telefonlarin_markalarini_listeler() {
        List<WebElement> tumUrunlerLislesi= Driver.getDriver().findElements(By.xpath("//h4"));
        tumUrunlerLislesi.stream().forEach(t-> System.out.println(t.getText()));
        for (WebElement a: tumUrunlerLislesi
        ) {
            urunListesi.add(a.getText());
        }
    }
    @Then("kullanici telefonlari sepete ekler")
    public void kullanici_telefonlari_sepete_ekler() throws InterruptedException {
        List<WebElement> addToChartButonlari=Driver.getDriver().findElements(By.xpath("//*[text()='Add to Cart']"));
        for (WebElement b: addToChartButonlari
        ) {
            b.click();
        }
        Thread.sleep(3000);
    }
    @Then("kullanici sepete gider ve sepetteki urunleri listeye ekler")
    public void kullanici_sepete_gider_ve_sepetteki_urunleri_listeye_ekler() {
        Driver.getDriver().findElement(By.id("cart-total")).click();
        List<WebElement> sepettekiUrunlerListesi=Driver.getDriver().findElements(By.xpath("//*[@id='cart']//table/tbody//td[2]/a"));
        sepettekiUrunlerListesi.stream().forEach(t-> System.out.println(t.getText()));
        for (WebElement a: sepettekiUrunlerListesi
        ) {
            sepetListesi.add(a.getText());
        }
    }
    @Then("kullanici urun listesi ile sepetteki urunleri karsilastirir")
    public void kullanici_urun_listesi_ile_sepetteki_urunleri_karsilastirir() {
        Assert.assertTrue(urunListesi.containsAll(sepetListesi));
    }
    @Then("kullanici sayafadan ayrilir")
    public void kullanici_sayafadan_ayrilir() {
        Driver.closeDriver();
    }
}