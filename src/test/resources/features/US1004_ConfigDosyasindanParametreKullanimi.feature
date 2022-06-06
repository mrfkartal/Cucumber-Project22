Feature: US1004 kullanici parametre ile configuration file'i kullanabilmeli

  @config
  Scenario: TC07 configuration properties dosyasindan parametre kullanimi


    Given kullanici "brcUrl" anasayfasinda
    And kullanici 15 sn bekler
    And Url'in "blue" icerdigini test eder
    Then sayfayi kapatir