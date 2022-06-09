package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuappPage;
import utilities.Driver;

import java.time.Duration;

public class HerokuStepDefinitions {
    HerokuappPage herokuappPage=new HerokuappPage();

    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuappPage.addElementButtonu.click();
    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herokuappPage.deleteElementButonu));
    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteElementButonu.isDisplayed());
    }
    @Then("Delete butonuna basar")
    public void delete_butonuna_basar() {
        herokuappPage.deleteElementButonu.click();
    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
        Assert.assertTrue(herokuappPage.deleteListesi.isEmpty());
    }
}