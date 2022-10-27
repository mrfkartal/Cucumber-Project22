Feature: US1012 kullanici register yapabilmeli
@aut
  Scenario: TC17 kullanici uygun datalarla regsiter olabilmeli




  http://automationpractice.com/index.php sayfasina gidelim
  Cucumber ile asagidaki testi yapalim
    Given kullanici "automationUrl" anasayfasinda
     * user sign in linkine tiklar
     * user Create and account bölümüne email adresi girer
     * Create an Account butonuna basar
     * user kisisel bilgilerini ve iletisim bilgilerini girer
     * user Register butonuna basar
     * hesap olustugunu dogrular
     * sayfayi kapatir



