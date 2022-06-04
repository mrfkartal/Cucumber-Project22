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
}
