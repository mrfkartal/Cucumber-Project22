package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();


    @Given("kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("Nutella icin arama yapar")
    public void nutella_icin_arama_yapar() {
    AmazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

    }
    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        String aranaKelime="Nutella";
        String actualAramaSonucStr=AmazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucStr.contains(aranaKelime));

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
    Driver.closeDriver();
    }

    @Then("kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        AmazonPage.aramaKutusu.sendKeys("Java"+ Keys.ENTER);
    }
    @Then("sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        String aranaKelime="Java";
        String actualAramaSonucStr=AmazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucStr.contains(aranaKelime));
    }
    @And("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
     AmazonPage.aramaKutusu.sendKeys("iphone"+ Keys.ENTER);
    }

    @Then("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String aranaKelime="iphone";
        String actualAramaSonucStr=AmazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucStr.contains(aranaKelime));
    }
    @Given("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String istenenKelime) {
        AmazonPage.aramaKutusu.sendKeys(istenenKelime+ Keys.ENTER);


    }
    @Given("sonuclarin {string} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder(String istenenKelime) {
        String aranaKelime="istenenKelime";
        String actualAramaSonucStr=AmazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucStr.contains(aranaKelime));


    }

    @Given("kullanici {string} anasayfasinda") //amazonUrl
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("istenenUrl"));

    }

    @And("Url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {

        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @And("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye ) {

        try{
            Thread.sleep(istenenSaniye*1000);

        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
