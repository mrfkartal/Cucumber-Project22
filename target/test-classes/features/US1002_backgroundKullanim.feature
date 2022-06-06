@wip
Feature: US1002 kullanici ortak adimlari Background ile calistirmak

  Background: ortak adim

    Given kullanici amazon anasayfasinda


    Scenario: TC04 amazon nutella arama
      Then Nutella icin arama yapar
      And sonuclarin Nutella icerdigini test eder
      And sayfayi kapatir

      Scenario: TC05 amazon java arama
        Then kullanici Java icin arama yapar
        And sonuclarin Java icerdigini test eder
        And sayfayi kapatir