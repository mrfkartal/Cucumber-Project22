package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@datatable",
        dryRun = true
)

public class Runner {


    /*
    Bir framework'de bir  tek Runner class'i yeterli olabilir
    Runner class'inda calss body'sinde hic bir sey olmaz
    Runner class'imizi oneli yapan 2 adeta annotaion vardir.
    @RunWith(Cucumber.class) notasyonu Runner class"ina calisma ozelligi katar
    Bu notasyon oldugu icin Cucumber framework'umuzde Junit kullanmayi tercih ediyoruz

    features : Runner dosyasinin feature dosyalarini nereden bulacafgini tarif eder
    glue : step definitions dosyalarini nerede bulacagmizi gosterir
    tag : o an hangi tag'i calistirmak istiyorsak onu belli eder

    dryRun : iki secenek var
    dryRun=true; yazdigimizda testimiz calistirmadan sadece eksik adimlari bize verir
    dryRun=false;
     */

}
