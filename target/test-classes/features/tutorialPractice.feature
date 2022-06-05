Feature: Tutorial Ninja Sitesi


  Scenario: TC01 kullanici telefonlari sepete ekler

    Given  kullanici tuturial ninja sayfasina gider
    Then kullanici telefonlarin oldugu butona tiklar
    And kullanici telefonlari markalarini listeler
    And kullanici telefonlari sepete ekler
    And kullanici sepete gider ve sepetteki urunleri listeye ekler
    And kullanici urun listesi ile sepetteki urunleri karsilastir
    And kullanici sayfadan ayril