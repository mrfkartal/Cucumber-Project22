Feature: US1011 web tablasundaki istenen sutunu yazdirma
  @guru
  Scenario:TC16 kullanici sutun basligi ile liste alabilmeli

    Given kullanici "guruUrl" anasayfasinda
    * kullanici 3 sn bekler
    #* cookies sorulursa kabul eder
    * "Company", sutunundaki tum degerleri yazdirir
    * sayfayi kapatir