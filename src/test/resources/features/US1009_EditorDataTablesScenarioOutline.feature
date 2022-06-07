Feature: US1009 Datatable sitesine 5 farkli giris yapalim

  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli
    @datatable
    When kullanici "datatablesUrl" anasayfasinda
    Then new butonuna basar
    And isim bolumune "<firstname>" yazar
    And soyisim bolumune "<lastname>" yazar
    And position bolumune "<position>" yazar
    And office bolumune "<office>" yazar
    And extension bolumune "<extension>" yazar
    And startDate bolumune "<startDate>" yazar
    And salary bolumune "<salary>" yazar
    And Create tusuna basar
    When kullanici ilk isim ile arama yapar
    Then isim bolumunde isminin oldugunu dogrular

    Examples:
      |firstname|lastname|position|office  |extension|startDate |salary|
      |Omer     |KARTAL  |QA      |Istanbul|UI       |2021-10-11|10000 |
      |Berk     |Can     |tester  |Corum   |api      |2022-03-02|11000 |
      |Huseyin  |Kacmaz  |BA      |Antep   |-        |2022-01-05|40000 |
      |Ahmet    |Kaya    |PO      |Ankara  |-        |2022-01-03|42000 |
      |Ahmet    |Sahin   |tester  |Ankara  |database |2020-01-03|45000 |
