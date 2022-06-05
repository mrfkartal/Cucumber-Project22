Feature: Tutorial Ninja Sitesi



  Scenario: kullanici telefonlari sepete ekler


    Given kullanici tutorial ninja sayfasina gider
    Then kullanici telefonlarin oldugu butona basar
    And kullanici telefonlarin markalarini listeler
    And kullanici telefonlari sepete ekler
    And kullanici sepete gider ve sepetteki urunleri listeye ekler
    And kullanici urun listesi ile sepetteki urunleri karsilastirir
    And kullanici sayafadan ayrilir