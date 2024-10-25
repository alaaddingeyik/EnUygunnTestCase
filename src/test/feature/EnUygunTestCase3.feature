Feature:Yanlis kullanici adi ve parola ile login olma islemi.
  @BasarisizLogin
  Scenario: Basarisiz login olma islemi
    Given EnUygun.com Web sitesine gidilir
    When Ana sayfadaki giris yap butonuna tiklanir
    And Acilan ekrandan kayitli olmayan kullanici adi ve parola girilir
    And Giris yap butonuna tiklanir
    Then Yanlis kullanici adi ve sifre pop up in geldigi goruntulenir
