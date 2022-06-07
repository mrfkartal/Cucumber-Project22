Feature: US1009 Datatable sitesine 5 farkli giris yapalim
  @datatable
  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli

    When kullanici "datatablesUrl" anasayfasinda
    Then new butonuna basar
    And isim bolumune "<firstname>" yazar
    And kullanici 1 sn bekler
    And soyisim bolumune "<lastname>" yazar
    And kullanici 1 sn bekler
    And position bolumune "<position>" yazar
    And kullanici 1 sn bekler
    And ofis bolumune "<office>" yazar
    And kullanici 1 sn bekler
    And extension bolumune "<extension>" yazar
    And kullanici 1 sn bekler
    And startDate bolumune "<startDate>" yazar
    And kullanici 1 sn bekler
    And salary bolumune "<salary>" yazar
    And kullanici 1 sn bekler
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    And kullanici 1 sn bekler
    Then isim bolumunde "<firstname>" oldugunu test eder
    And sayfayi kapatir

    Examples:
      |firstname|lastname|position|office  |extension|startDate |salary|
      |Omer     |KARTAL  |QA      |Istanbul|UI       |2021-10-11|10000 |
      |Berk     |Can     |tester  |Corum   |api      |2022-03-02|11000 |
      |Huseyin  |Kacmaz  |BA      |Antep   |-        |2022-01-05|40000 |
      |Ahmet    |Kaya    |PO      |Ankara  |-        |2022-01-03|42000 |
      |Ahmet    |Sahin   |tester  |Ankara  |database |2020-01-03|45000 |
